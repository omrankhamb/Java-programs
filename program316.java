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

class Stack<T>
{
    public node first;
    public  int iCnt;

    public Stack()
    {
        this.first = null;
        this.iCnt = 0;
    }

    public void Display()
    {

    }

    public int Count()
    {
        return this.iCnt;
    }

    public void Push(int iNo)
    {
        node newn = new node(iNo);

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

    public int Pop()
    {
        return 0;
    }

    public int Pip()
    {
        return 0;
    }

}

class program316
{
    public static void main(String Arg[])
    {
        Stack sobj = new Stack();
        int iRet = 0;

        sobj.Push(11);  
        sobj.Push(21);  
        sobj.Push(51);  
        sobj.Push(81);  

        iRet = sobj.Count();
        System.out.println("Number of elemets are : " + iRet);

    }
}
