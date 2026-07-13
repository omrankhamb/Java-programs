class Base implements Runnable 
{
    public void run() 
    {
        System.out.println("Inside Base Thread run methd");
    }
}

class program74 {
    public static void main(String a[]) throws Exception
    {
        System.out.println("Inside main Thread");

        Thread mobj = Thread.currentThread();

        System.out.println("Name of currentthread is : " + mobj.getName());
        System.out.println("Priority of currenthread Thread is : " + mobj.getPriority());

        Base bobj = new Base();
        Thread tobj = new Thread(bobj);

        tobj.start();

    }
}