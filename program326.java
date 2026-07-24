
class node
{
    public int data;
    public node lchild;
    public node rchild;

    public node(int data)
    {
        this.data = data;
        this.lchild = null;
        this.rchild = null;
    }
}

class BinaryTree
{
    public node first;
    public int iCnt;

    public BinaryTree()
    {
        this.first = null;
        this.iCnt = 0;
    }

    public void Inorder(node temp)
    {
        if(temp!= null)
        {
            Inorder(temp.lchild);
            System.out.println(temp.data + "  ");
            Inorder(temp.rchild);
        }
      
    }

    public void Preorder(node temp)
    {
        if(temp!= null)
        {
            System.out.println(temp.data + "  ");
            Inorder(temp.lchild);
            Inorder(temp.rchild);
        }
    }

    public void PostOrder(node temp)
    {
        if(temp!= null)
        {
            Inorder(temp.lchild);
            Inorder(temp.rchild);
            System.out.println(temp.data + " ");
        }
    }

    public void Insert(int iNo)
    {
        node newn = null;
        node temp = null;

        newn = new node(iNo);

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
                    temp =  temp.lchild;
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
                else if(temp.data == iNo)
                {
                    System.out.println("element is already present");
                    return;
                }
            }
        }
        this.iCnt++;
    }

    public boolean Search(int iNo)
    {
        node temp = null;
        boolean bFlag = false;
        temp = this.first;

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
}


class program326
{
    public static void main(String Arg[])
    {
        BinaryTree obj = new BinaryTree();
        int iRet = 0;
        boolean bRet = false;

        obj.Insert(11);
        obj.Insert(7);
        obj.Insert(5);
        obj.Insert(17);
        obj.Insert(21);
        obj.Insert(27);
        obj.Insert(19);
        obj.Insert(4);
        obj.Insert(14);

        iRet = obj.iCnt;
        obj.Inorder(obj.first);
        System.out.println("Number of element are : "+ iRet);

        bRet = obj.Search(17);
        if(bRet)
        {
            System.out.println("Element  is present");
        }
        else
        {
            System.out.println("element is not present");
        }
    }   
}