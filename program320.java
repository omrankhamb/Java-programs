class node<T>
{
    public T data;
    public node<T> next;

    public node(T data)
    {
        this.data = data;
        this.next = null;
    }
}

class Stack<T>
{
    public node<T> first;
    public  int iCnt;

    public Stack()
    {
        this.first = null;
        this.iCnt = 0;
    }

    public void Display()
    {
        node<T> temp = null;
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

    public void Push(T iNo)               // Insert First
    {
        node<T> newn = new node<T>(iNo);

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

    public void Pop()                        // Deletefirst
    {
        T iValue ;
        if(this.first == null)
        {
            System.out.println("Stack is empty");
        }
        else
        {
            iValue = this.first.data;
            this.first = this.first.next;
            this.iCnt--;
            
        }
    }

    public T Pip()
    {
        return this.first.data;
    }

}

class program320
{
    public static void main(String Arg[])
    {
        Stack <Integer>sobj = new Stack<>();
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
