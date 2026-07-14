import java.util.*;

class NumberX
{
    public void Display(int iNo)
    {
        int iDigit = 0;
        while(iNo != 0)
        {
            iDigit = iNo % 10;
            System.out.println(iDigit);
            iNo = iNo / 10;
        }
    }
}


class program130
{
    public static void main(String Arg[])
    {
        Scanner sobj = new Scanner(System.in);
        NumberX nobj = new NumberX();

        int iValue  = 0;

        System.out.println("Enter a number : ");
        iValue = sobj.nextInt();

        nobj.Display(iValue);

        
    }
}