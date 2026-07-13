class Base
{
    public Base()
    {
        System.out.println("Inside cinstructor Base");
    }

    public final void gun()
    {
        System.out.println("Inisde Base Final gun");
    }

    public void fun()
    {
        System.out.println("Inside Base fun ");
    }

}

class Derived extends Base
{
    public Derived()
    {
        System.out.println("Inside Derived Constructor");
    }

    public void run()
    {
        System.out.println("Inside Derived run");
    }

    // We can not override the gun method because it is final in Base class
    // public void gun()
    // {
    //     System.out.println("Inside Derived gun");
    // }
}

class program57xx
{
    public static void main(String A[])
    {
        Derived dobj = new Derived();

        dobj.fun();
        dobj.run();
        dobj.gun(); //error

    }
}