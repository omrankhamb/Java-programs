import java.util.*;

class NumberX
{
    public boolean ChkPerfect(int iNo)
    {
        int iCnt = 0;
        int iSum = 0;
        int iValue = iNo;

        for(iCnt = 1 ; iCnt <=iNo/ 2; iCnt++)
        {
            if(iNo % iCnt == 0)
            {
                iSum = iSum + iCnt;
            }

            if(iSum > iValue)
            {
                break;
            }
            
        }

        if(iSum == iValue)
        {
            return true;
        }
        else
        {
            return false;
        }
       
    }
}

class program107
{
    public static void main(String Arg[])
    {
        Scanner sobj = new Scanner(System.in);
        NumberX obj = new NumberX();

        int iValue = 0;
        int iRet = 0;
        boolean bRet = false;

        System.out.println("Enter a number : ");
        iValue = sobj.nextInt();

        bRet = obj.ChkPerfect(iValue);

        if(bRet)
        {
            System.out.println("Number is perfect");
        }
        else
        {
            System.out.println("Number is not perfect");
        }


    }
}