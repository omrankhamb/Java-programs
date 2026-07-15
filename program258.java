import java.util.*;

class program258
{
    public static void main(String A[])
    {
        
        // position 9 and 17
        // Toggle 9 th and 17 th poisition of binsry digit
        Scanner sobj = new Scanner(System.in);
        int iNo = 0;
        int iRet = 0;
        int iMask = 0x00010100;

        System.out.println("Enter the Number : ");
        iNo = sobj.nextInt();

        iNo = iNo ^ iMask;
      

        System.out.println("result is : "+iNo);



    }
}