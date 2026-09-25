// first we are creating the singleton the design pattern

class Base
{   
    private static Base obj = null;
    
    private Base ()
    {
        System.out.println("Hello");
    }

    public static Base getInstance()
    {
        if(obj == null)
        {
            obj = new Base();
        }

        return obj;
    }

    public void print()
    {
        System.out.println("Done from my side");
    }
}



class program407
{
    public static void main(String Arg[])
    {
        Base obj = Base.getInstance();
        obj.print();

        Base obj2 = Base.getInstance();
        obj2.print();

        if(obj.hashCode() == obj2.hashCode())
        {
            System.out.println("Object share the same instance");
            System.out.println(obj.hashCode());
            System.out.println(obj2.hashCode());
        }
        else
        {
            System.out.println("Object Do not share the same Instance");
        }
    }
}