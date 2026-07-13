abstract class Base 
{
    public Base()
    {
        System.out.println("Inside constructor Base");
    }

    public void fun()
    {
        System.out.println("Inside Base fun");
    }

    public abstract void gun();
    
}
class program63
{
    public static void main(String Arg[])
    {
        System.out.println("Hello World");
        // error because Base is abstract
        Base bobj = new Base();
    }
}