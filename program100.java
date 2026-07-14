import java.util.*;
class Base extends Thread
{
    public void Display(int iNo)
    {
        
        try{
            int iCnt = 0;
            for (iCnt = iNo; iCnt >= 0; iCnt--) 
            {
                System.out.println(iCnt);
                Thread.currentThread().sleep(1000);
            }
        }
        catch(Exception eobj)
        {

        }
        
    }
}

class program100
{
    public static void main(String Arg[]) 
    {
        Scanner sobj  = new Scanner(System.in);
        Base bobj  = new Base();
        int iNo = 0;

        System.out.println("Enter A number : ");
        iNo = sobj.nextInt();

        bobj.Display(iNo);

        

    }
}