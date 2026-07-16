class node
{
    public int data;
    public node next;
    public node prev;

    public node(int idata)
    {
        this.data = idata;
        this.next = null;
        this.prev = null;
    }
}

class DoublyLL
{
    public node first;
    public int iCount;

    DoublyLL()
    {
        this.first = null;
        this.iCount = 0;
    }

    public void Disply()
    {}

    public int Count()
    {return this.iCount;}

    public void InsertFirst(int iNo)
    {}

    public void InsertLast(int iNo)
    {}

    public void InsertAtPos(int iNo,int iPos)
    {}

    public void DeleteFirst()
    {}

    public void DeleteLast()
    {}

    public void DeleteAtPos(int iPos)
    {}
}
class program288
{
    public static void main(String A[])
    {

    }
}