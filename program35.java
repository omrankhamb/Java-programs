class Demo{
    public int i;
    public int j;
    public static int k;    // default value is 0


    public Demo(int i,int j)
    {
        System.out.println("Inside demo constructor");
        this.i = i;
        this.j = j;
    }

    static
    {
        System.out.println("first block is exectued");
    }

    public void fun()
    {
        System.out.println(this .i);
        System.out.println(this.j);
        System.out.println(this.k); // static character static can not access by non static function

    }


    public static void gun()
    {
        // error System.out.println(this .i);
        // error System.out.println(this.j);
        System.out.println(k); // static character static can not access by non static character stics
    }
}

class program35
{
    public static void main(String Arg[])
    {
        Demo dobj = new Demo(11,21);
        dobj.fun();


        System.out.println("Inside main");

    }
}