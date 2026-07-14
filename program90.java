import java.util.*;

class program90
{

    public static boolean EvenOrOdd(int iNo)
    {
        if(iNo % 2 == 0)
        {
            return true;
        }
        else
        {
            return  false;
        }
    }
    public static void main()
    {
        Scanner sobj = new Scanner(System.in);

        int iNo = 0;
        boolean bRet = false;

        System.out.println("Enter A number to Check Even or Odd : ");

        iNo = sobj.nextInt();

        bRet = EvenOrOdd(iNo);

        if(bRet) 
        {
            System.out.println("Number is Even");
        }
        else
        {
            System.out.println("Number is Odd");
        }


        

    }
}