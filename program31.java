class Demo
{
    public int i;

    public Demo()
    {
        System.out.println("INside demo constructor");
    }

    public Demo(int x)
    {
        this.i = x;
        
    }

    public void printX()
    {
        System.out.println("Value of i is "+ this.i);
    }
}

class program31
{
    public static void main(String A[])
    {   
        Demo dobj = new Demo();
        dobj.i = 11;

        dobj.printX();
        
    }
}