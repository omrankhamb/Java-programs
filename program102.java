import java.util.*;
class Base
{
    public boolean ChkDivisible(int iValue)
    {
        if((iValue %3 == 0) && (iValue % 5 == 0))
        {
            return true;
        }
        else
        {
            return false;
        }
    }
}

class program101
{
    public static void main(String Arg[]) 
    {
        Scanner sobj  = new Scanner(System.in);
        Base bobj = new Base();
        
        int iValue = 0;
        boolean bRet = false;

        System.out.println("Enter A number : ");
        iValue = sobj.nextInt();

        bRet = bobj.ChkDivisible(iValue);

        if(bRet)
        {
            System.out.println("Number is Divisible by both 3 and 5");
        }
        else
        {
            System.out.println("Number is not Divisible by 3 and 5");
        }
        
    }
}