final class Base
{
    public Base()
    {
        System.out.println("Inside cinstructor Base");
    }

    public void gun()
    {
        System.out.println("Inisde Base Final gun");
    }

    public void fun()
    {
        System.out.println("Inside Base fun ");
    }

}

class Derived extends Base  // We can not inherit because in Base declared as final
{
    public Derived()
    {
        System.out.println("Inside Derived Constructor");
    }

    public void run()
    {
        System.out.println("Inside Derived run");
    }

}

class program57
{
    public static void main(String A[])
    {
        Derived dobj = new Derived();

        // dobj.fun();
        // dobj.run();
        // dobj.gun(); //error

    }
}