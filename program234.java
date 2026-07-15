import java.util.*;

class program234
{
    public static void main(String A[])
    {
        Scanner sobj = new Scanner(System.in);

        int iNo1 = 0 ;
        int iMask = 0x1;    //1 in decimal
        int iAns = 0;
        int ipos = 0;

        System.out.println("Enter a Number : ");
        iNo1 = sobj.nextInt();

        System.out.println("Enter the bit poeition : ");
        ipos = sobj.nextInt();

        iMask = iMask << (ipos -1); // consider 2 to n -1 

        iAns = iNo1 & iMask;

        if(iAns == iMask)
        {
            System.out.println("Bit is ON");
        }
        else
        {
            System.out.println("Bit is off");
        }
    }
}