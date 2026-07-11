class demo{
    public int i;
    public int j;

    public demo()
    {
        System.out.println("Inside demo constructor");
    }

    public void fun()
    {
        System.out.println("Inside demo pubic fun");
    }
    private void sun()
    {
        System.out.println("Inside private fun");
    }

    protected void gun()
    {
        System.out.println("Inside demo protected demo");
    }

}



class program32
{
    public static void main(String arg[])
    {
        demo dobj = new demo();

        dobj.fun();
        dobj.gun();
        dobj.sun();

    }
}