class Demo
{

    public int i = 0;
    public int j = 0;
    public Demo()
    {
       System.out.println("Inside Demo Constructor"); 
    }

    public Demo(int x,int y)
    {
        System.out.println("Inside Parametrised constructor");
        this.i = x;
        this.j = y;
    }


    public Demo(Demo dobj)
    {
        System.out.println(dobj.i);
        System.out.println(dobj.j);
    }
    protected void finalize()
    {
        System.out.println("Inside Demo Destructor");
    }


}

class program30
{
    public static void main(String[] args) 
    {
        
        Demo dobj2 = new Demo(11,21);
        Demo dobj = new Demo(dobj2);

        

        dobj = null;
        dobj2 = null;
        System.gc();

        System.out.println("End of main");

        
    }
}