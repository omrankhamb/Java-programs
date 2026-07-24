class node
{
    public int data;
    public node next;   // crating a pointer to point the data
    public node(int data)
    {
        this.data = data;
        this.next = null;   
    }
}

class Queue
{
    public node first;
    public int iCnt;

    public Queue() {
        this.first = null;
        this.iCnt = 0;
    }

    public int Count()
    {
        return this.iCnt;
    }

    public void Display()
    {
        node temp = null;
        temp = this.first;

        while(temp != null)
        {
            System.out.println(temp.data);
            temp = temp.next;
        }
    }

    public void Enqueue(int iNo)
    {
        node newn = new node(iNo);
        node temp = null;

        if(this.first ==  null)
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
        }

        this.iCnt++;
    }

    public void Dequeue()
    {
        if(this.first == null)
        {
            System.out.println("Queue is empty");
            return;
        }
        else if(this.first.next == null)
        {
            this.first = null;      // no neew to delete the garbage collector delete it automically            
        }
        else
        {
            this.first = this.first.next;
        }

        this.iCnt--;
    }

    public int Peek()
    {   
        int iNo  = 0;
        if(this.first == null)
        {
            return -1;
        }
        else
        {
            return this.first.data;
        }
    }

}

class program321
{
    public static void main(String Arg[])
    {
        System.out.println("Enter in main");

        Queue sobj = new Queue();
        int iRet = 0;

        sobj.Enqueue(11);
        sobj.Enqueue(21);
        sobj.Enqueue(31);
        sobj.Enqueue(41);

        iRet = sobj.Count();
        sobj.Display();
        System.out.println("Number of element in Queue are : " + iRet);
        iRet = sobj.Peek();
        System.out.println("Elemet at peek is : " + iRet);

        sobj.Dequeue();

        iRet = sobj.Count();
        sobj.Display();
        System.out.println("Number of element in Queue are : "+ iRet);

        iRet = sobj.Peek();
        System.out.println("Elemet at peek is : " + iRet);


    }
}
