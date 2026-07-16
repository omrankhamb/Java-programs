class node
{
    public int data;
    public node next;
    public node prev;

    public node(int idata)
    {
        this.data = idata;
        this.next = null;
        this.prev = null;
    }
}

class DoublyLL
{
    public node first;
    public int iCount;

    DoublyLL()
    {
        this.first = null;
        this.iCount = 0;
    }

    public void Disply()
    {
        node temp = null;
        temp = this.first;
        
        while(temp != null)
        {
            System.out.print("| "+temp.data+" | <=> ");
            temp = temp.next;
        }

        System.out.println("NULL");
    }

    public int Count()
    {return this.iCount;}

    public void InsertFirst(int iNo)
    {
        node newn = null;
        newn = new node(iNo);

        if(this.first == null)
        {
            this.first = newn;
        }
        else
        {
            newn.next = this.first;
            this.first.prev = newn;
            this.first = newn;
        }

        this.iCount++;
    }

    public void InsertLast(int iNo)
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

            while(temp.next != null)
            {
                temp = temp.next;
            }

            temp.next = newn;
            newn.prev = temp;
        }

        this.iCount++;
    }

    public void InsertAtPos(int iNo,int iPos)
    {}

    public void DeleteFirst()
    {
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
            this.first.prev = null;
        }

        this.iCount--;
    }

    public void DeleteLast()
    {}

    public void DeleteAtPos(int iPos)
    {}
}

class program292
{
    public static void main(String A[])
    {
        DoublyLL dobj = new DoublyLL();
        int iRet = 0;

        dobj.InsertFirst(51);
        dobj.InsertFirst(21);
        dobj.InsertFirst(11);

        dobj.Disply();
        iRet = dobj.Count();
        System.out.println("Number of Node Are : "+ iRet);

        dobj.InsertLast(101);
        dobj.InsertLast(111);
        dobj.InsertLast(121);

        dobj.Disply();
        iRet = dobj.Count();
        System.out.println("Number of Node Are : "+ iRet);


        dobj.DeleteFirst();

        dobj.Disply();
        iRet = dobj.Count();
        System.out.println("Number of Node Are : "+ iRet);



    }
}