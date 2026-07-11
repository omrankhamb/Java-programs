class Base
{
    public Base()
    {
        System.out.println("insidel base constructor");
    }


    public void fun()
    {
        System.out.println("insidel Base fun");
    }
}


class child1 extends Base
{
    public child1()
    {
        System.out.println("insidel child1 constructor");
    }

    public void gun()
    {
        System.out.println("insidel child1 gun");
    }
}



class child2 extends Base
{
    public child2()
    {
        System.out.println("insidel child2 constructor");
    }

    public void sun()
    {
        System.out.println("insidel child2 gun");
    }
}






class program40
{
    public static void main(String Arg[])
    {
        child1 cobj = new child1();
        child2 cobj2 = new child2();

        cobj.fun();
        cobj.gun();

        cobj2.fun();
        cobj2.sun();
    }
}