import java.util.*;

class program250
{
    public static void main(String A[])
    {
        Scanner sobj = new Scanner(System.in);

        int iNo = 0;
        int iMask = 0x01;
        int iPos = 0;
        int iAns = 0;

        System.out.println("Enter A number : ");
        iNo = sobj.nextInt();

        System.out.println("Enter the position : ");
        iPos = sobj.nextInt();

        iMask = iMask << (iPos -1);

        iAns = iNo ^ iMask;

        System.out.println("retult is : "+ iAns);

        
    }
}