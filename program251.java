import java.util.*;
class  Bit
{
    public int ToggleBit(int iNo,int iPos)
    {
        int iMask = 0x1;
        int iResult = 0;

        iMask = iMask <<(iPos -1);

        iResult = iNo ^ iMask;

        return iResult;

    }
}
class program251
{
    public static void main(String A[])
    {
        Scanner sobj = new Scanner(System.in);
        Bit bobj = new Bit();

        int iNo = 0;
        int iMask = 0x01;
        int iPos = 0;
        int iAns = 0;
        int iRet = 0;

        System.out.println("Enter A number : ");
        iNo = sobj.nextInt();

        System.out.println("Enter the position : ");
        iPos = sobj.nextInt();

        iRet = bobj.ToggleBit(iNo, iPos);
        System.out.println("Result is : " + iRet);

        

        
    }
}