import java.util.*;

class Bit
{
    public static int ToggleBit(int iNo,int iPos,int iPos2)
    {
        int iMask = 0x1;
        int iMask2 = 0x1;
        int iMask1 = 0;

        iMask = iMask << (iPos - 1);
        iMask2 = iMask2 << (iPos2 -1);

        iMask1 = iMask | iMask2;

        int iRet = iNo ^ iMask1;

        return iRet;
    }
}

class program259
{
    public static void main(String A[])
    {
        
        // Taking position from user
        Scanner sobj = new Scanner(System.in);
        Bit bobj = new Bit();

        int iNo = 0;
        int iPos = 0;
        int iPos2 = 0;
        int iRet = 0;

        System.out.println("Enter the Number : ");
        iNo = sobj.nextInt();

        System.out.println("Enter the first Position : ");
        iPos = sobj.nextInt();

        System.out.println("Enter the secind position : ");
        iPos2 = sobj.nextInt();

        iRet = bobj.ToggleBit(iNo, iPos, iPos2);

        System.out.println("result is : "+iRet);
        


    }
}