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
class program253
{
    public static void main(String A[])
    {
        Scanner sobj = new Scanner(System.in);
        
        int iNo = 0;
        int iMask = 0xFFFFFFF7;

        int iAns = 0;

        System.out.println("Enter a number : ");
        iNo = sobj.nextInt();

        iNo = iNo & iMask;
        
        System.out.print("Result is : "+iNo);
    }
}