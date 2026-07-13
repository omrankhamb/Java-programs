class Demo extends Thread
{
    public void run()
    {
        try
        {
            for(int i = 0 ; i <= 100 ; i++)
            {
                System.out.println("Inside run Thread" + Thread.currentThread().getName() + " :: "+ i);
                Thread.sleep(10);
            }
        }
        catch(InterruptedException eobj)
        {

        }
            
    }
        
}

class program80 
{
    public static void main(String a[]) throws Exception
    {
        System.out.println("Inside main Thread");

        Thread mobj = Thread.currentThread();

        System.out.println("Name of currentthread is : " + mobj.getName());
        System.out.println("Priority of currenthread Thread is : " + mobj.getPriority());

        Demo dobj = new Demo();
        Demo dobj2 = new Demo();

        dobj.setName("First");
        dobj2.setName("Second");

        dobj.start();
        dobj2.start();

        dobj.sleep(5000);
        
        dobj.join();
        dobj2.join();
        System.out.println("End of main Thread");

    }
}