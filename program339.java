public class node
{
    public int data;
    public node next;

    public node(int iNo)
    {
        this.data = iNo;
        this.next = null;
    }
}

public class StackX
{
    public node first;
    public int iCnt;
    public int Max;

    public StackX(int max)
    {
        this.first = null;
        this.iCnt = 0;
        this.Max = max;
    }

    public void push(int ino)   // InsertFirst Adding first increases stack
    {
        if(this.iCnt == Max)
        {
            return;
        }

        node newn = new node(ino);
        
        if(this.first == null)
        {
            this.first = newn;
        }
        else
        {
            newn.next = this.first;
            this.first = newn;
        }

        this.iCnt++;
    }

    public void Pop()   
    {
        if(this.iCnt <= 0)
        {
            return;
        }
        if(this.first == null)
        {
            return;
        }
        else if(this.first.next == null)
        {
            this.first = null;
        }
        else
        {
            this.first = this.first.next;
        }

        this.iCnt--;
    }

    public int Peek()
    {
        if(this.first != null)
        {
            return this.first.data;
        }

        return -1;
    }

    public void Display()
    {
        node temp = this.first;

        while(temp != null)
        {
            System.out.println("|"+temp.data+"|");
            temp = temp.next;
        }
    }

    public boolean IsEmpty()
    {
        if(this.first == null)
        {
            return true;
        }
        return false;
    }

    public int Size()
    {
        return this.iCnt;
    }
}


class program339
{
    public static void main(String Arg[])
    {
        StackX obj = new StackX(5);
        int iRet = 0;

        obj.push(111);
        obj.push(101);
        obj.push(51);

        iRet = obj.Peek();
        System.out.println("Element at peek of stack is : "+iRet);
        iRet = obj.Size();
        System.out.println("Size of Stack is : " + iRet);
        obj.Display();

        obj.Pop();
        iRet = obj.Peek();
        System.out.println("Element at peek of Stack is : " + iRet);
        iRet = obj.Size();
        System.out.println("Size of Stack is : " + iRet);
        obj.Display();

        obj.push(21);
        obj.push(11);
        obj.push(1);

        iRet = obj.Peek();
        System.out.println("Element at peek of stack is : "+iRet);
        iRet = obj.Size();
        System.out.println("Size of Stack is : " + iRet);
        obj.Display();

        
    }
}