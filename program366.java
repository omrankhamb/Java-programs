class node
{
    public int data;
    public node right;
    public node left;

    public node(int data)
    {
        this.data = data;
        this.left = null;
        this.right = null;
    }
}

class Tree
{
    public node first;
    public int count;

    public Tree()
    {
        first = null;
        count = 0;
    }

    public void Insert(int data)
    {
        node temp = null;
        node newn = new node(data);
        if(this.first == null)
        {
            this.first = newn;
        }
        else
        {
            temp = this.first;

            while(true)
            {
                if(data < temp.data)
                {
                    if(temp.left == null)
                    {
                        temp.left = newn;
                        break;
                    }
                    temp = temp.left;
                }
                else if(data > temp.data)
                {
                    if(temp.right == null)
                    {
                        temp.right = newn;
                        break;
                    }
                    temp = temp.right;
                }
                else if(temp.data == data)
                {
                    newn = null;
                    return;
                }
            }
        }
    }

    public void Inorder()
    {
        Inorderx(this.first);
        System.out.println();
    }


    private void Inorderx(node temp)
    {
        if(temp == null)
        {
            return ;
        }

        Inorderx(temp.left);
        System.out.print(temp.data  + " ");
        Inorderx(temp.right);
    }
}


class program366
{
    public static void main(String arr[])
    {
        Tree obj = new Tree();

        obj.Insert(51);
        obj.Insert(41);
        obj.Insert(61);
        obj.Insert(71);
        obj.Insert(81);
        obj.Insert(45);
        obj.Insert(65);;

        obj.Inorder();
    }
}