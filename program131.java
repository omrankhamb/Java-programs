import java.util.*;

class NumberX
{
    public int CountDigits(int iNo)
    {
        int iDigit = 0;
        int iCount = 0;

        while(iNo != 0)
        {
            iNo = iNo / 10;
            iCount++;
        }

        return iCount;
    }
}


class program131
{
    public static void main(String Arg[])
    {
        Scanner sobj = new Scanner(System.in);
        NumberX nobj = new NumberX();

        int iValue  = 0;
        int iRet = 0;

        System.out.println("Enter a number : ");
        iValue = sobj.nextInt();

        iRet = nobj.CountDigits(iValue);

        System.out.println("Count of digit is : "+ iRet);

        
    }
}