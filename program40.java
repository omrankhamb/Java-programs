class Base
{
    public int i;
    public Base(int x)
    {
        System.out.println("Inside Base Constructor");
        this.i = x;
    }
}





class program40
{
    public static void main(String A[])
    {
        Base bobj = new Base(10);
        System.out.println(bobj.i);

    }
}