import java.util.*;
class Base 
{
    public void Display(int iNo)
    {
        int iCnt = 0;
        for (iCnt = iNo; iCnt >= 0; iCnt--) 
        {
            System.out.println("Jay Ganesh.." + iCnt);
        }
    }
}

class program99
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