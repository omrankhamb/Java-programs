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

    
}

class program297
{
    public static void main(String Arg[])
    {}
}