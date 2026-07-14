import java.util.*;

class NumberX
{
    public int CountOddDigits(int iNo)
    {
        int iDigit = 0;
        int iCount = 0;

        while(iNo != 0)
        {
            iDigit = iNo % 10;
            if(iDigit % 2 == 1)
            {
                iCount++;
            }
            iNo = iNo / 10;
            
        }

        return iCount;
    }
}


class program133
{
    public static void main(String Arg[])
    {
        Scanner sobj = new Scanner(System.in);
        NumberX nobj = new NumberX();

        int iValue  = 0;
        int iRet = 0;

        System.out.println("Enter a number : ");
        iValue = sobj.nextInt();

        iRet = nobj.CountOddDigits(iValue);

        System.out.println("Count Even digit is : "+ iRet);

        
    }
}