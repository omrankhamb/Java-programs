import java.util.*;

class program257
{
    public static void main(String A[])
    {
        
        // position 3 and 7
        Scanner sobj = new Scanner(System.in);
        int iNo = 0;
        int iRet = 0;
        int iMask = 0x000044;

        System.out.println("Enter the Number : ");
        iNo = sobj.nextInt();

        iNo = iNo ^ iMask;
      

        System.out.println("result is : "+iNo);



    }
}