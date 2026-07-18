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

class Queue<T>
{
    public node<T> first;
    public int iCnt;

    public Queue()
    {
        this.first = null;
        this.iCnt = 0;
    }

    public void Display()
    {
        node<T> temp = null;
        temp  = this.first;
        while(temp != null)
        {
            System.out.print("| "+temp.data+" | == ");
            temp = temp.next;
        }
        System.out.println();
    }

    public int Count()
    {
        return this.iCnt;
    }
    
    public void Enqueue(T iNo)    // insert Last
    {
        node<T> temp = null;
        node<T> newn = null;
        newn = new node<T>(iNo);

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
        }
        this.iCnt++;
    }

    public void Dequeue()
    {
        if(this.first == null)
        {
            System.out.println("Queue is Empty");
            return;
        }
        else
        {
            this.first = this.first.next;
            this.iCnt--;
        }

    }
}


class program319
{
    public static void main(String Arg[])
    {
        Queue<Integer> obj = new Queue<>();
        int iRet = 0;

        obj.Enqueue(11);
        obj.Enqueue(21);
        obj.Enqueue(51);
        obj.Enqueue(91);

        obj.Display();
        iRet = obj.Count();
        System.out.println("Number of elelments are : " + iRet);

        obj.Dequeue();

        obj.Display();
        iRet = obj.Count();
        System.out.println("Number of elelments are : " + iRet);
    }
}