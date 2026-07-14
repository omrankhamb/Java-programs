import java.util.*;

class NumberX
{
    public void Display(int iNo)
    {
        int iCnt = 0;

        for(iCnt = iNo ; iCnt >0 ;iCnt--)
        {
            System.out.print(iCnt + "   ");
        }
    }
}

class program113
{
    public static void main(String Arg[])
    {
        Scanner sobj = new Scanner(System.in);
        NumberX nobj = new NumberX();

        int iValue  = 0;

        System.out.println("Enter a Number : ");
        iValue = sobj.nextInt();

        nobj.Display(iValue);



    }
}