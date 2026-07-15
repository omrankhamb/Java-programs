import java.util.*;

class program249
{
    public static void main(String A[])
    {
        Scanner sobj = new Scanner(System.in);

        int iNo = 0;
        int iMask = 0x0000008;

        System.out.println("Enter A number : ");
        iNo = sobj.nextInt();

        iNo = iNo ^ iMask;

        System.out.println("Result is : "+iNo);
    }
}