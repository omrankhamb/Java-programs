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
}
class program305
{
    public static void main(String A[])
    {

    }

}