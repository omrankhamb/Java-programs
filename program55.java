class Base
{
    public int i;
    public int j;

    public Base()
    {
        System.out.println("Inside base constructor");
    }

    public void fun()
    {
        System.out.println("Inside Base fun");
    }

    public void gun()
    {
        System.out.println("Inside base gun");
    }

}


class Derived extends Base
{
    public int k;
    public int l;

    public Derived()
    {
        System.out.println("Inside Derived constructor");
    }

    public void fun()
    {
        System.out.println("Inside Derived fun");
    }

    public void sun()
    {
        System.out.println("Inside Derived sun");
    }
}




class program55
{
    public static void main(String A[])
    {
        // created refrence poitng to null
        Derived dobj = null;

        // Dowun Casting
        // dobj = new Base();

        Base bobj = new Derived();  // UPcasting is done

        
        


    }
}