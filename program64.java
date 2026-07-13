abstract class Circle
{
    public final float PI = 3.14f;  // Not good programming practise


    public float Area(float iRadius)
    {
        return PI * iRadius * iRadius;
    }

    abstract public float Cirumference(float fRadius);
}

class Derived extends Circle
{
    public Derived()
    {
        System.out.println("Inisde Derived Constructor");
    }

    // should provide the function otherwise throw error

    public float Cirumference(float fRadius)
    {
        return 2 * super.PI * fRadius;
    }
}

class program64
{
    public static void main(String Arg[])
    {
        System.out.println("Hello World");
        // Error Bcaus the Circle class is abstract
        // Circle cobj = new Circle();

        float fRet = 0.0f;
        Derived Dobj = new Derived();

        fRet = Dobj.Area(3.13f);
        System.out.println("Area is  : " + fRet);

        fRet = Dobj.Cirumference(3.3f);
        System.out.println("Circumference is : " + fRet);
       
    }
}