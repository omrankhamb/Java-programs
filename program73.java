class Base extends Thread
{
    public void run()
    {
        System.out.println("Inside Base Thread run methd" );
    }
}


class program73
{
    public static void main(String a[]) throws Exception
    {
        System.out.println("Inside main Thread");

        Thread tobj = Thread.currentThread();

        System.out.println("Name of currentthread is : "+ tobj.getName());
        System.out.println("Priority of currenthread Thread is : " + tobj.getPriority());

        Base bobj = new Base();
        bobj.start();



    }
}