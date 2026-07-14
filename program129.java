import java.util.*;


class program129
{
    public static void main(String Arg[])
    {
        Scanner sobj = new Scanner(System.in);

        int iValue  = 0;
        int iDigit = 0;
        int iCnt = 0;
        boolean bRet = false;

        System.out.println("Enter a number : ");
        iValue = sobj.nextInt();

        while(iValue != 0)
        {
            iDigit = iValue % 10;
            System.out.println(iDigit);
            iValue = iValue / 10;
        }
        
    }
}