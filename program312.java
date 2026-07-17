class node
{
    public int data;
    public node next;
    public node prev;

    public node(int idata)
    {
        data = idata;
        next = null;
        prev = null;
    }
}

class DoublyCL
{
    public node first;
    public node last;
    public int iCount;

    public DoublyCL()
    {
        first = null;
        last = null;
        iCount = 0;
    }

    public void Display()
    {
        node temp = null;

        temp = this.first;

        do
        {
            System.out.print("| "+ temp.data +" | <=>");
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
        node newn = null;
        newn = new node(iNo);

        if(first == null && last == null)
        {
            first = newn;
            last = newn;
        }
        else
        {
            newn.next = first;
            first.prev = newn;
            first = newn;
        }

        this.first.prev = this.last;
        this.last.next = this.first;
        this.iCount++;
    }

    public void InsertLast(int iNo)
    {
        node newn = null;
        newn = new node(iNo);

        if(first == null && last == null)
        {
            first = newn;
            last = newn;
        }
        else
        {
            last.next = newn;
            newn.prev = last;
            last = newn;
        }

        this.first.prev = this.last;
        this.last.next = this.first;
        this.iCount++;
    }

    public void InsertAtPos(int iNo,int iPos)
    {
        node newn = null;
        node temp = null;
        int i = 0;

        if(iPos < 1 || iPos > this.iCount + 1)
        {
            System.out.println("Invlid Position");
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

            for(i = 1 ; i < iPos -1 ; i++)
            {
                temp = temp.next;

            }

            newn = new node(iNo);

            newn.next = temp.next;
            temp.next.prev = newn;
            newn.prev = temp;
            temp.next = newn;
            this.iCount++;
        }
        this.first.prev = this.last;
        this.last.next = this.first;
    }

    public void DeleteFirst()
    {
        if(first == null && last == null)
        {
            return;
        }
        else if(first == last)
        {
            first = null;
            last = null;
        }
        else
        {
            first = first.next;
        }
        first.prev = last;
        last.next = first;
        this.iCount--;
    }

    public void DeleteLast()
    {
        if(first == null && last == null)
        {
            return;
        }
        else if(first == last)
        {
            first = null;
            last = null;
        }
        else
        {
            last = last.prev;
        }
        first.prev = last;
        last.next = first;
        this.iCount--;
    }

    public void DeleteAtPos(int iPos)
    {
        node temp = null;
        int i = 0;

        if(iPos < 1 || iPos > this.iCount)
        {
            System.out.println("Invlid Position");
        }

        if(iPos == 1)
        {
            DeleteFirst();
        }
        else if(iPos == this.iCount + 1)
        {
            DeleteLast();
        }
        else
        {
            temp = this.first;

            for(i = 1 ; i < iPos -1 ; i++)
            {
                temp = temp.next;

            }

            temp.next = temp.next.next;
            this.iCount--;
        }
        this.first.prev = this.last;
        this.last.next = this.first;
    }
}
class program312
{
    public static void main(String A[])
    {

    }

}