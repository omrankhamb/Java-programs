class Base
{
    public Base() 
    {
        System.out.println("Inside Base constructor");
    }

    protected void finalize()    
    {
        System.out.println("inside base destructor");
    }
}


class program82
{
    public static void main(String Arg[])
    {
        Base bobj = new Base();

        bobj = null;

        System.gc();

        System.out.println("End of main");
    }
}