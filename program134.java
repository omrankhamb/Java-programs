import java.util.*;

class NumberX
{
    public int SumDigit(int iNo)
    {
        int iDigit = 0;
        int iCount = 0;
        int iSum = 0;

        while(iNo != 0)
        {
            iDigit = iNo % 10;
            iSum = iSum + iDigit;
            iNo = iNo / 10;
            
        }

        return iSum;
    }
}


class program134
{
    public static void main(String Arg[])
    {
        Scanner sobj = new Scanner(System.in);
        NumberX nobj = new NumberX();

        int iValue  = 0;
        int iRet = 0;

        System.out.println("Enter a number : ");
        iValue = sobj.nextInt();

        iRet = nobj.SumDigit(iValue);

        System.out.println("Sum of digit is : "+ iRet);

        
    }
}