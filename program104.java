import java.util.*;

class NumberX
{
    public void DisplayFactors(int iNo)
    {
        int iCnt = 0;

        for(iCnt = 1 ; iCnt < iNo ; iCnt++)
        {
            if(iNo % iCnt == 0)
            {
                System.out.println(iCnt);
            }
        }
    }
}

class program103
{
    public static void main(String Arg[])
    {
        Scanner sobj = new Scanner(System.in);
        NumberX obj = new NumberX();

        int iValue = 0;

        System.out.println("Enter a number : ");
        iValue = sobj.nextInt();

        System.out.println("Number of factors are : ");
        obj.DisplayFactors(iValue);


    }
}