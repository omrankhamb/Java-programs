import java.util.*;

class BitX
{
    public boolean ChkBit(int iNo)
    {
        int iMask = 0x1;
        int iMask2 = 0x80000000;
        int iMaskR = 0;

        iMaskR = iMask | iMask2;

        int iAns = iNo & iMask;

        if(iAns == iMaskR)
        {
            return true;
        }else
        {
            return false;
        }
    }

    public int OffBit(int iNo)
    {
        int iMask = 0x40;
        int iRet = 0;

        iMask = ~iMask;
        iRet = iNo & iMask;
        return iRet;
    }
}

class program264
{
    public static void main(String Arg[])
    {
        Scanner sobj = new Scanner(System.in);
        int iNo = 0;
        int iRet = 0;
        BitX bobj = new BitX();
        boolean bAns  = false;

        System.out.println("Enter A Number : ");
        iNo = sobj.nextInt();

        iRet = bobj.OffBit(iNo);

        System.out.println("Result After off the 7th bit : "+iRet);
        


    }
}