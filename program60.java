class Base
{

    public final int i = 21;
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

class program60
{
    public static void main(String A[])
    {
        Base bobj = new Base();

        System.out.println(bobj.i);

        // error bobj.i = 12;    //error Because in classs it is declared as final no one change the value acts as a constant

    }
}