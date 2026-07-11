
class Demo
{
    public int i,j;
    public Demo()
    {
        System.out.println("Inside  Default Constructor");
    }

    public Demo(int iNo,int iNo2)
    {
        this.i = iNo;
        this.i = iNo2;
    }

    public int Addition()
    {
        return i + j;
    }

    protected void finalize() 
    {
        System.out.println("Indside finalise method");
    }
}


class program29
{
    public static void main(String[] args) {
        // To call default constructor
        Demo dobj = new Demo();
        dobj = null;

        System.gc();
        System.out.println("End of main : ");
        

    }
}
