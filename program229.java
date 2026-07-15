import java.util.*;

class program229
{
    public static void main(String A[])
    {
        Scanner sobj = new Scanner(System.in);

        int iNo1 = 0 ;
        int iMask = 4;
        int iAns = 0;

        System.out.println("Enter a Number : ");
        iNo1 = sobj.nextInt();

        iAns = iNo1 & iMask;

        if(iAns == iMask)
        {
            System.out.println("3rd bit is ON");
        }
        else
        {
            System.out.println("3rd bit is off");
        }
    }
}