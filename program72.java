// main thread

class program72
{
    public static void main(String a[]) throws Exception
    {
        System.out.println("Inside main Thread");

        Thread tobj = Thread.currentThread();

        System.out.println("Name of CurretnThread is : "+ tobj.getName());
        System.out.println("Priority of CurrentThread Thread is : " + tobj.getPriority());


    }
}