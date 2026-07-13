class Demo extends Thread
{
    public void run()
    {
        System.out.println("Inside run Thread" + Thread.currentThread().getName());
    }
}

class program76
{
    public static void main(String a[]) throws Exception
    {
        System.out.println("Inside main Thread");

        Thread mobj = Thread.currentThread();

        System.out.println("Name of currentthread is : " + mobj.getName());
        System.out.println("Priority of currenthread Thread is : " + mobj.getPriority());

        Demo dobj = new Demo();
        Demo dobj2 = new Demo();

        dobj.start();
        dobj2.start();

    }
}