class Marvellous
{
    public Marvellous()
    {
        System.out.println("Inside Marvellous constructor");
    }
}


class Hello
{
    public Hello()
    {
        System.out.println("Inside Hello Consturctor");
    }
}



public class program84 {
    public static void main(String Arg[])
    {

        Marvellous mobj = new Marvellous();
        Hello hobj = new Hello();

        System.out.println(mobj.hashCode());
        System.out.println(hobj.hashCode());

        

    }
}
