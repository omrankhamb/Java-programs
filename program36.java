class Base 
{
    public Base()
    {
        System.out.println("Insde Base constructor");
    }

    public void fun()
    {
        System.out.println("Inside Base fun");
    }

    protected void finalize()
    {
        System.out.println("Inside Base Destructor");
    }
}


class Derived extends Base
{
    public Derived()
    {
        System.out.println("Inside Derived Constructor");
    }


    public void gun()
    {
        System.out.println("Inisde Derived gun");
    }

    protected void finalize()
    {
        System.out.println("Inside Derived Destructor");
    }
}


class program36
{
    public static void main(String Arg[])
    {
        Derived dobj  = new Derived();

        dobj.fun();
        dobj.gun();

        dobj = null;
        System.gc();

        System.out.println("End os main");


    }
}