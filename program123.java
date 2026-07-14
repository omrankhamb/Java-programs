import java.util.*;

class NumberX
{
    public boolean CheckPrime(int iNo)
    {
        int iCnt = 0;
        boolean bRet = true;
        
        for(iCnt = 2 ; iCnt <= iNo / 2 ; iCnt++)
        {
            if(iNo % iCnt == 0)
            {
                break;
            }
        }

        if(iCnt >= (iNo / 2) + 1)
        {
            return true;
        }
        else
        {
            return false;
        }
    }
    
}

class program123
{
    public static void main(String Arg[])
    {
        Scanner sobj = new Scanner(System.in);
        NumberX nobj = new NumberX();

        int iValue  = 0;
        boolean bRet = false;

        System.out.println("Enter a number to check prime or not : ");

        iValue = sobj.nextInt();

        bRet = nobj.CheckPrime(iValue);

        if(bRet)
        {

            System.out.println("Number is prime");
        }
        else
        {
            System.out.println("Number is not prime");
        }

    }
}