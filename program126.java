import java.util.*;


class program126
{
    public static void main(String Arg[])
    {
        Scanner sobj = new Scanner(System.in);

        int iValue  = 0;
        int iCnt = 0;
        boolean bRet = false;

        System.out.println("Enter a number : ");

        iValue = sobj.nextInt();

        iCnt = 1;

        do
        {
            System.out.println(iCnt);
            iCnt++;
        }
        while(iCnt <= iValue);
        
        
    }
}