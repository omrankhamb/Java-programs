// Creating A queue
class nodeX<T>
{
    public T val;
    public nodeX<T> next;

    public nodeX(T iNo)
    {
        this.val = iNo;
        this.next = null;
    }

}

class Queue<T>
{
    public nodeX<T> first;
    public int iCnt;

    public Queue()
    {
        this.first = null;
        this.iCnt = 0;
    }

    public void Enqueue(T iNo)
    {
        nodeX<T> newn = new nodeX<T>(iNo);
        nodeX<T> temp = null;

        if(this.first == null)
        {
            this.first = newn;
        }
        else
        {
            temp = this.first;

            while(temp.next != null)
            {
                temp = temp.next;
            }
            temp.next = newn;
        }

        this.iCnt++;
    }

    public void Dequeue()
    {
        if(this.first == null)
        {
            return;
        }
        else
        {
            this.first = this.first.next;
        }
        this.iCnt--;
    }

    public void Display()
    {
        nodeX<T> temp = null;
        temp = this.first;

        while(temp != null)
        {
            System.out.println(temp.val + " ");
            temp = temp.next;
        }
    }

    public T Peek()
    {
        if(this.first == null)
        {
            return null;
        }

        return this.first.val;
    }

    public boolean empty()
    {
        if(this.first == null)
        {
            return true;
        }

        return false;
    }
}

// Start of Tree
class node
{
    public int data;
    public node rchild;
    public node lchild;

    public node(int data)
    {
        this.data = data;
        this.lchild = null;
        this.rchild = null;
    }
}


class Tree
{
    public node first;
    public int iCnt;

    public Tree()
    {
        this.first = null;
        this.iCnt = 0;
    }

    public void Insert(int iNo)
    {
        node newn = new node(iNo);
        node temp = null;

        if(this.first == null)
        {
            this.first = newn;
        }
        else
        {
            temp = this.first;

            while(true)
            {
                if(iNo < temp.data)
                {
                    if(temp.lchild == null)
                    {
                        temp.lchild = newn;
                        break;
                    }

                    temp = temp.lchild;

                }
                else if(iNo > temp.data)
                {
                    if(temp.rchild == null)
                    {
                        temp.rchild = newn;
                        break;
                    }
                    temp = temp.rchild;
                }
                else if(iNo == temp.data)
                {
                    System.out.println("Element is already present");
                    return;
                }
            }
        }
        this.iCnt++;
    }

    public void Inorder()
    {
        InorderCopy(this.first);
    }

    public void InorderCopy(node temp)
    {
        if(temp == null)
        {
            return;
        }
        InorderCopy(temp.lchild);
        System.out.println(temp.data + " ");
        InorderCopy(temp.rchild);

    }

    public void Preorder()
    {
        PreorderCopy(this.first);
    }

    public void PreorderCopy(node temp)
    {
        if(temp == null)
        {
            return;
        }

        System.out.println(temp.data + " ");
        PreorderCopy(temp.lchild);
        PreorderCopy(temp.rchild);
    }


    public void PostOrder()
    {
        PostOrderCopy(this.first);
    }

    public void PostOrderCopy(node temp)
    {
            PostOrderCopy(temp.lchild);
            PostOrderCopy(temp.rchild);
            System.out.println(temp.data + " ");
    }

    public boolean Search(int iNo)
    {
        boolean bFlag = false;
        node temp = this.first;

        while(temp != null)
        {
            if(iNo == temp.data)
            {
                bFlag = true;
                break;
            }
            else if(iNo < temp.data)
            {
                temp = temp.lchild;
            }
            else if(iNo > temp.data)
            {
                temp = temp.rchild;
            }

        }

        return bFlag;
    }

    public int CountLeafNode()
    {
        return CountLeafNodeCopy(this.first);
    }

    public int CountLeafNodeCopy(node temp)
    {
        if(temp == null)
        {
            return 0;
        }
        if(temp.rchild  == null && temp.rchild == null)
        {
           return 1;
        }

        return  CountLeafNodeCopy(temp.rchild) + CountLeafNodeCopy(temp.lchild);
        
    }

    public int CountParentNode()
    {   
        return CountparentNodeCopy(this.first);
    }

    public int CountparentNodeCopy(node temp)
    {
        if(temp == null)
        {
            return 0;
        }
        if(temp.lchild == null && temp.rchild == null)
        {
            return 0;

        }

        return 1 +  CountparentNodeCopy(temp.lchild) + CountparentNodeCopy(temp.rchild);
    }

    public int Count()
    {
        return this.iCnt;
    }

    public void LevelOrder()
    {
        Queue<node> obj1 = new Queue<node>();
        node temp = this.first;
        obj1.Enqueue(temp);

        while(!obj1.empty())
        {
            Queue<node> obj2 = new Queue<node>();

            while(!obj1.empty())
            {
                node newn = obj1.Peek();
                System.out.print(newn.data + " ");
                if(newn.lchild != null)
                {
                    obj2.Enqueue(newn.lchild);
                }

                if(newn.rchild != null)
                {
                    obj2.Enqueue(newn.rchild);
                }

                obj1.Dequeue();   
                             
            }
            System.out.println();
            while(!obj2.empty())
            {
                node newn = obj2.Peek();
                obj1.Enqueue(newn);
                obj2.Dequeue();
            }
        }



    }

    
}

class program330
{
    public static void main(String Arg[])
    {
        Tree obj = new Tree();
        int iRet = 0;

        obj.Insert(11);
        obj.Insert(5);
        obj.Insert(17);
        obj.Insert(21);
        obj.Insert(27);
        obj.Insert(19);
        obj.Insert(4);
        obj.Insert(14);
        obj.Insert(9);
        obj.Insert(15);

        iRet = obj.Count();
        obj.Preorder();
        System.out.println("Number of element is : " + iRet);

        if(obj.Search(100))
        {
            System.out.println("Element is find");
        }
        else
        {
            System.out.println("Element is not find");
        }

        iRet = obj.CountLeafNode();
        System.out.println("Number of leaf node are : " + iRet);

        iRet = obj.CountParentNode();
        System.out.println("Number of Parent node are : " + iRet);

        obj.LevelOrder();


        System.out.println("Inside main");
    }
}