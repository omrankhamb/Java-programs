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
    // program61.java:33: error: gun() in Derived cannot override gun() in Base
    // public void gun()
    //             ^
    // overridden method is final
    // 1 error
    // error: compilation failed
    public void gun()
    {
        System.out.println("Inside Derived gun");
    }
}

class program61
{
    public static void main(String A[])
    {
        Base bobj = new Derived();      // Upcasting
        bobj.gun();

    }
}