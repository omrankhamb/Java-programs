class node 
{
    public int data;
    public node next;

    public node(int data)
    {
        this.data= data;
        this.next = null;
    }
}

class singlyCL
{
    public node first;
    public node last;
    public int iCount;

    public singlyCL()
    {
        first = null;
        last = null;
        iCount = 0;
    }

    public void Display()
    {
        node temp = null;
        temp = first;

        do
        {
            System.out.print("| " + temp.data + " | ->");
            temp = temp.next;
        }while(temp != last.next);

        System.out.println();

    }

    public int Count()
    {
        return this.iCount;
    }

    public void InsertFirst(int iNo)
    {
        node newn = new node(iNo);

        if(this.first == null)
        {
            this.first = newn;
            this.last = newn;
        }
        else
        {
            newn.next = this.first;
            this.first = newn;
        }
        this.last.next = this.first;
        this.iCount++;

    }

    public void InsertLast(int iNo)
    {
        node newn = new node(iNo);

        if(this.first == null)
        {
            this.first = newn;
            this.last = newn;
        }
        else
        {
            this.last.next = newn;
            this.last = newn;
        }
        this.last.next = this.first;
        this.iCount++;

    }

    public void InsertAtPos(int iNo,int iPos)
    {
        node newn = null;
        node temp = null;
        int i = 0;

        if(iPos < 1 || iPos > this.iCount +1)
        {
            System.out.println("Invliad position");
        }
        
        if(iPos == 1)
        {
            InsertFirst(iNo);
        }
        else if(iPos == this.iCount + 1)
        {
            InsertLast(iNo);
        }
        else
        {
            temp = this.first;

            for(i = 1 ; i < iPos - 1 ; i++)
            {
                temp = temp.next;
            }

            newn = new node(iNo);

            newn.next = temp.next;
            temp.next = newn;

            this.iCount++;
        }   
    }

    public void DeleteFirst()
    {
        if(this.first == null && this.last == null)
        {
            return ;
        }
        else if(this.first == this.last)
        {
            this.first = null;
            this.last = null;
        }
        else
        {
            this.first = this.first.next;
        }

        this.last.next = this.first;
        this.iCount--;
    }

    public void DeleteLast()
    {
        node temp = null;
        if(this.first == null && this.last == null)
        {
            return ;
        }
        else if(this.first == this.last)
        {
            this.first = null;
            this.last = null;
        }
        else
        {
            temp = this.first;

            while(temp.next != this.last)
            {
                temp = temp.next;
            }

            this.last = temp;
        }

        this.last.next = this.first;
        this.iCount--;
    }

    public void DeleteAtPos(int iPos)
    {
        node temp = null;
        int i = 0;

        if(iPos < 1 || iPos > this.iCount)
        {
            System.out.println("Invliad position");
        }
        
        if(iPos == 1)
        {
            DeleteFirst();
        }
        else if(iPos == this.iCount)
        {
            DeleteLast();
        }
        else
        {
            temp = this.first;

            for(i = 1 ; i < iPos - 1 ; i++)
            {
                temp = temp.next;
            }

            temp.next = temp.next.next;

            this.iCount--;
        }   
    }

    
}

class program304
{
    public static void main(String Arg[])
    {
        singlyCL dobj = new singlyCL();
        int iRet = 0;

        dobj.InsertFirst(51);
        dobj.InsertFirst(21);
        dobj.InsertFirst(11);

        dobj.Display();
        iRet = dobj.Count();
        System.out.println("Number of Node Are : "+ iRet);

        dobj.InsertLast(101);
        dobj.InsertLast(111);
        dobj.InsertLast(121);

        dobj.Display();
        iRet = dobj.Count();
        System.out.println("Number of Node Are : "+ iRet);

        dobj.DeleteFirst();

        dobj.Display();
        iRet = dobj.Count();
        System.out.println("Number of Node Are : "+ iRet);

        dobj.DeleteLast();

        dobj.Display();
        iRet = dobj.Count();
        System.out.println("Number of Node Are : "+ iRet);

        dobj.InsertAtPos(100,3);

        dobj.Display();
        iRet = dobj.Count();
        System.out.println("Number of Node Are : "+ iRet);

        dobj.DeleteAtPos(3);

        dobj.Display();
        iRet = dobj.Count();
        System.out.println("Number of Node Are : "+ iRet);

    }
}