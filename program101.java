import java.util.*;

class program101
{
    public static void main(String Arg[]) 
    {
        Scanner sobj  = new Scanner(System.in);
        
        int iValue = 0;

        System.out.println("Enter A number : ");
        iValue = sobj.nextInt();

        if((iValue %3 == 0) && (iValue % 5 == 0))
        {
            System.out.println("Number is Divisible by both 3 and 5");
        }
        else
        {
            System.out.println("Number is not Divisible by 3 and 5");
        }
        
    }
}