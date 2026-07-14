import java.util.*;


class program127
{
    public static void main(String Arg[])
    {
        Scanner sobj = new Scanner(System.in);

        int iValue  = 0;
        int iCnt = 0;
        boolean bRet = false;

        System.out.println("Enter a number : ");

        iValue = sobj.nextInt();

        iCnt = iValue;

        while(iCnt >=1)
        {
            System.out.println(iCnt);
            iCnt--;
        }
        
        
    }
}