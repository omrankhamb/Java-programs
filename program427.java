import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

class node
{
    public int data;
    public node right;
    public node left;

    public node(int data)
    {
        this.data =data;
        this.right = null;
        this.left = null;
    }
}

class Tree
{
    public node first;

    public Tree()
    {
        this.first = null;
    }

    public void insert(int data)
    {
        node newn = new node(data);

        if(this.first == null)
        {
            this.first = newn;
        }
        else
        {
            node temp = this.first;

            while(true)
            {
                if(newn.data < temp.data)
                {
                    if(temp.left == null)
                    {
                        temp.left = newn;
                        break;
                    }
                    temp = temp.left;
                }
                else if(newn.data > temp.data)
                {
                    if(temp.right == null)
                    {
                        temp.right = newn;
                        break;
                    }
                    temp = temp.right;
                }
                else if(temp.data == newn.data)
                {
                    System.out.println("Data is already present in the Tree");
                    newn = null;
                    return;
                }
            }
        }
    }


    public void PreOrder()
    {
        Stack<node> st = new Stack<node>();
        node temp = this.first;
        

        while (true) {

            while(temp != null)
            {
                System.out.print(temp.data + " ");
                st.push(temp);
                temp = temp.left;
            }

            if(st.empty())
            {
                break;
            }

            temp = st.peek();
            st.pop();
            temp =temp.right;
        }

    }

////////////////////////////////////////////////////////////////////////////////
/// 
///     if we want to print in the reverse levelorder then insert first right
///     and then insert the left node and store all the elment in the stack and 
///     then print one by one push and pop()
/// 
////////////////////////////////////////////////////////////////////////////////

    void LevelOrder()
    {
        node temp = this.first;
        Queue<node> obj = new LinkedList<node>();
        if(temp != null)
        {   
            obj.add(temp);
        }

        while(!obj.isEmpty())
        {
            temp = obj.poll();

            System.out.print(temp.data  + " ");

            if (temp.left != null)
            {
                obj.add(temp.left);
            }

            if(temp.right != null)
            {
                obj.add(temp.right);
            }
        }
    }

 ///////////////////////////////////////////////////////////////////////////////////
/// 
///     Deetel the node from the binary tree
/// 
///     3] condition
///         i]  ELment is root node then then retirn inorder Succesor join the right tree to the end of the maxrightend of the left subtree
///         ii] check temp.left != NULL and temp.left.data == data we have to point node before the actual node value to delete
///             Then store the left pointer to which the node is delete find the right most element from the left subtree
///             connect the stored right pointer value to the right subtree
///         iii] First search where node is present
///              store the left child and then find then find right most node of left subtree connect to stored right
///              parent left connect to the chlid left direct done
//////////////////////////////////////////////////////////////////////////////////////

    public void DeleteNode(int data)
    {
        Queue<node> obj = new LinkedList<node>();
        if(this.first == null)
        {
            return;
        }

        obj.add(this.first);

        while(!obj.isEmpty())
        {
            node temp = obj.peek();
            obj.poll();

            if(temp.left != null )
            {
                if( temp.left.data == data){
                temp.left = helper(temp.left);
                }
                else
                {
                    obj.add(temp.left);
                }
            }
            if(temp.right != null)
            {
                if(temp.right.data == data)
                {
                    temp.right = helper(temp.right);
                }
                else
                {
                    obj.add(temp.right);
                }
            }
        }
        
    }

    public node helper(node temp)
    {

        if(temp.left == null)
        {
            return  temp.right;
        }
        else if(temp.right == null)
        {
            return temp.left;
        }
       
        node rightmost = getRightNode(temp.left);
        rightmost.right = temp.right;
        return temp.left;
    }

    public node getRightNode(node temp)
    {
        if(temp.right == null)
        {
            return  temp;
        }
        return getRightNode(temp.right);
    }



///////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
/// 
///     Question : Build The Tree from PreOrder and PostOrder Traversal
///                In preorder first element is always parent so these is our root elment   
///                In Inorder the elemt is always sorted so first create the node from the preorder find the posiotn in inorder 
///                THen condition are made 
///                1] inorderstart == inorderend return node
///                2] if inorderstart > inorderedn return NULL out of range
///                3] else continue the process to the subtree
///////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////

    public static int preIdx = 0;

    public int search(int inOrder[] ,int inorderStart ,int inorderEnd , int data)
    {
        for(int i = inorderStart ; i <= inorderEnd ; i++)
        {
            if(inOrder[i] == data){
                return i;
            }
        }

        return 0;
    }

    public node buildTree(int Inorder[] , int Preorder[] , int inorderstart , int inorderend)
    {
        if(inorderstart > inorderend)
        {
            return null;
        }

        node newn  = new node(Preorder[preIdx]);
        preIdx++;

        if(inorderstart == inorderend){
            return newn;
        }

        int inorderIdx = search(Inorder , inorderstart , inorderend , newn.data);

        newn.left = buildTree(Inorder , Preorder ,inorderstart , inorderIdx - 1 );
        newn.right = buildTree(Inorder , Preorder ,inorderIdx +1  ,inorderend );

        return newn;
    }

///////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
/* 
    Question : Write the program to preform NonRecursivePreorderTraversal
    SolutioN : We can Solve the problem using the Stack Easily

*/
///////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////


    public void NonRecursivePreorder()
    {
        Stack<node> st = new Stack<>();
        node temp = null;
        temp = this.first;
        

        while(true)
        {
            while(temp != null)
            {
                
                System.out.print(temp.data+ " ");
                st.push(temp);
                temp = temp.left;
            }

            if(st.empty() == true)
            {
                break;
            }

            temp = st.pop();
            temp = temp.right;
           
        }
    }

///////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
/* 
    Question : Write the program to preform NonRecursiveInorderTraversal
    SolutioN : We can Solve the problem using the Stack Easily
*/
///////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////


    public void NonRecursiveInorder()
    {
        Stack<node > stack = new Stack<>();
        
        node temp = this.first;

        while(true)
        {
            while(temp != null)
            {
                stack.push(temp);
               
                temp = temp.left;
            }

            if(stack.empty() == true)
            {
                break;
            }

            temp = stack.pop();
            System.out.print(temp.data + " ");
            temp = temp.right;
        }
    }

///////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
/* 
    Question : Write the program to print the levelOrder Traversal
    SolutioN : We can Solve the problem using the Stack Easily
*/
///////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////


    public void NonRecursiveLeveOrder()
    {
        Queue<node> queue = new LinkedList<node>();

        if(this.first != null)
        {
            queue.add(this.first);
            queue.add(null);
        }

        while(!queue.isEmpty())
        {
            node temp = queue.poll();

            if(temp == null)
            {   
                System.out.println();

                if(!queue.isEmpty())
                {
                    queue.add(null);
                }
            }
            else
            {
            System.out.print(temp.data + " ");
            if(temp.left != null) queue.add(temp.left);
            if(temp.right != null) queue.add(temp.right);
            }
            
        }

    }
///////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
/* 
    Question : Find the Maximum elment in the binary Tree
    SolutioN : We can Solve the problem using the Stack Easily
               We can Also solve the Question using NonRecursie PreOrder and Inorder Traversal
*/
///////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////

    public int maximumInTree(node temp)
    {
        if(temp == null)
        {
            return 0;
        }

        return Math.max(temp.data , Math.max(maximumInTree(temp.left) , maximumInTree(temp.right)));
    }
///////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
/* 
    Question : Write the program to PerForm Searchin Elemnt in the Binary Tree
    SolutioN : We can Solve the problem using the Stack Easily
*/
///////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////

    public boolean TreeSearch(node temp , int data)
    {
        if(temp == null){
            return  false;
        }

        return temp.data == data || TreeSearch(temp.left , data) || TreeSearch(temp.right, data);
    }
}




class program427
{
    public static void main(String Arg[])
    {
        Tree obj = new Tree();
        obj.insert(8);
        obj.insert(5);
        obj.insert(12);
        obj.insert(2);
        obj.insert(7);
        obj.insert(10);
        obj.insert(13);
        

       obj.NonRecursiveLeveOrder();
       System.out.println(obj.maximumInTree(obj.first));
       if(obj.TreeSearch(obj.first, 18))
       {
        System.out.println("Elment is present");
       }

    }
}