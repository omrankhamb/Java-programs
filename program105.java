import java.util.*;

class NumberX
{
    public int SumFacotr(int iNo)
    {
        int iCnt = 0;
        int iSum = 0;

        for(iCnt = 1 ; iCnt <=iNo/ 2; iCnt++)
        {
            if(iNo % iCnt == 0)
            {
                iSum = iSum + iCnt;
            }
            
        }

        return iSum;
    }
}

class program105
{
    public static void main(String Arg[])
    {
        Scanner sobj = new Scanner(System.in);
        NumberX obj = new NumberX();

        int iValue = 0;
        int iRet = 0;

        System.out.println("Enter a number : ");
        iValue = sobj.nextInt();

        System.out.println("Number of factors are : ");
        iRet = obj.SumFacotr(iValue);

        System.out.println("Sum of factor is : "+iRet);


    }
}