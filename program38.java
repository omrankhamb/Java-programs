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


class DerivedX extends Derived
{
    public DerivedX()
    {
        System.out.println("Inside DerivedX Construcor");
    }


    public void sun()
    {
        System.out.println("Inisde DerivedX sun");
    }
}

class program37
{
    public static void main(String Arg[])
    {
        DerivedX dobj  = new DerivedX();

        dobj.fun();
        dobj.gun();
        //dobj.sun(); //error because at run times compiler check refrece hold of object and method visible for that object 
        


    }
}