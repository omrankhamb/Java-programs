import java.util.*;

class NumberX
{
    public boolean CheckPalindrome(int iNo)
    {
        int iDigit = 0;
        int iValue = iNo;
        int iSum = 0;

        while(iNo != 0)
        {
            iDigit = iNo % 10;
            iSum = iSum*10 + iDigit;
            iNo = iNo / 10;
            
        }

        if(iValue == iSum)
        {
            return true;
        }
        else
        {
            return false;
        }
    }
}


class program135
{
    public static void main(String Arg[])
    {
        Scanner sobj = new Scanner(System.in);
        NumberX nobj = new NumberX();

        int iValue  = 0;
        int iRet = 0;
        boolean bRet = false;

        System.out.println("Enter a number : ");
        iValue = sobj.nextInt();

        bRet = nobj.CheckPalindrome(iValue);

        if(bRet)
        {

            System.out.println("Number is palindrome");
        }
        else
        {
            System.out.println("Number is not palindrome");
        }

        
    }
}