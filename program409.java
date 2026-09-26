

// SingleTon Patter

class Base
{
    private static Base obj = null;

    private Base()
    {
        System.out.println("Object Is Created");
    }

    public static Base getInstance()
    {
        if(obj == null)
        {
            obj = new Base();
        }

        return obj;
    }

    public void Display()
    {
        System.out.println("Jay Ganesh");
    }
}


class program409
{
    public static void main(String Arg[])
    {
        Base obj = Base.getInstance();
        obj.Display();
    }
}