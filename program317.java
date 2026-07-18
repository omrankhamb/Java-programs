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

class Stack
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
        node temp = null;
        temp = this.first;

        while(temp != null)
        {
            System.out.println("| "+ temp.data +" |");
            temp = temp.next;
        }

    }

    public int Count()
    {
        return this.iCnt;
    }

    public void Push(int iNo)               // Insert First
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

    public int Pop()                        // Deletefirst
    {
        int iValue = 0;
        if(this.first == null)
        {
            System.out.println("Stack is empty");
            return -1;
        }
        else
        {
            iValue = this.first.data;
            this.first = this.first.next;
            this.iCnt--;
            return iValue;
        }
    }

    public int Pip()
    {
        return this.first.data;
    }

}

class program317
{
    public static void main(String Arg[])
    {
        Stack sobj = new Stack();
        int iRet = 0;

        sobj.Push(11);  
        sobj.Push(21);  
        sobj.Push(51);  
        sobj.Push(81);  

        sobj.Display();
        iRet = sobj.Count();
        System.out.println("Number of elemets are : " + iRet);

        sobj.Pop();  

        sobj.Display();
        iRet = sobj.Count();
        System.out.println("Number of elemets are : " + iRet);

        iRet = sobj.Pip();  

        System.out.println("Element of top of stack is : "+ iRet);
        sobj.Display();
        iRet = sobj.Count();
        System.out.println("Number of elemets are : " + iRet);

    }
}
