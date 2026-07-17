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

    }


    
}

class program298
{
    public static void main(String Arg[])
    {}
}