class node
{
    public int data;
    public node next;

    public node(int data)
    {
        this.data = data;
        this.next = null;
    }
}

class SinglyLL
{
    public node first;
    public int iCount;

    SinglyLL()
    {
        this.first = null;
        this.iCount = 0;
    }

    public void Display()
    {
        node temp = null;
        temp = this.first;

        while(temp != null)
        {
            System.out.print("| "+temp.data+" |-> ");
            temp = temp.next;
        }

        System.out.println("NULL");
    }

    public int Count()
    {return this.iCount;}

    public void InsertFirst(int iNo)
    {
        node newn= null;
        newn = new node(iNo);

        if(this.first == null)
        {
            this.first = newn;
        }
        else
        {
            newn.next = this.first;
            this.first = newn;
        }

        this.iCount++;

    }

    public void InsertLast(int iNo)
    {}

    public void InsertAtPos(int iNo,int iPos)
    {}

    public void DeleteFirst()
    {}

    public void DeleteLast()
    {}

    public void DDeleteAtPos(int iPos)
    {}
}



class program281
{
    public static void main(String Arg[])
    {
        SinglyLL sobj = new SinglyLL();
        int iRet = 0;

        sobj.InsertFirst(51);
        sobj.InsertFirst(21);
        sobj.InsertFirst(11);

        sobj.Display();
        iRet = sobj.Count();
        System.out.println("Number Of Node are : " + iRet);

    }
}