import java.util.*;
class  Bit
{
    public int ToggleBit(int iNo,int iPos)
    {
        int iMask = 0x1;
        int iResult = 0;

        if(iPos < 1 || iPos  > 32)
        {
            System.out.println("Invalis Position");
            return 0;
        }

        iMask = iMask <<(iPos -1);

        iResult = iNo ^ iMask;

        return iResult;

    }

    public int OffBit(int iNo,int iPos)
    {
        int iMask = 0x1;
        if(iPos < 1 || iPos > 32)
        {
            System.out.println("Invalid Position");
            return 0;
        }

        iMask = iMask << (iPos -1);
        iMask  = ~iMask;

        iNo = iNo & iMask;
        return iNo;
    }
}
class program255
{
    public static void main(String A[])
    {
        Scanner sobj = new Scanner(System.in);
        Bit bobj = new Bit();
        
        int iNo = 0;
        int iRet = 0;
        int iPos = 0;

        System.out.println("enter a number :");
        iNo = sobj.nextInt();

        System.out.println("Eneter The Position : ");
        iPos = sobj.nextInt();

        iRet = bobj.OffBit(iNo,iPos);

        System.out.println("Result is : "+iRet);



    }
}