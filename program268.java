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

    // TO off 7th bit
    public int OffBit(int iNo)
    {
        int iMask = 0x40;
        int iRet = 0;

        iMask = ~iMask;
        iRet = iNo & iMask;
        return iRet;
    }

    // To off 7th and 10 th Bit
    public int OffBitX(int iNo)
    {
        int iMask = 0x40;
        int iMask2 = 0x200;
        int iRet = 0;

        iMask = iMask | iMask2;

        iMask = ~iMask;
        iRet = iNo & iMask;
        return iRet;
    }

    // To toggle only 7th Bit
    public int Toggle(int iNo)
    {
        int iMask = 0x40;
        
        iNo = iNo ^ iMask;
        return iNo;
    }

    public int ToggleX(int iNo)
    {
        int iMask = 0x40;
        int iMask2 = 0x200;
        
        iMask = iMask | iMask2;
        iNo = iNo ^ iMask;
        return iNo;
    }

    public int On4FirstBit(int iNo)
    {
        int iMask = 0xF;
        iNo  = iNo | iMask;

        return iNo;
    }
}

class program268
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

        iRet = bobj.On4FirstBit(iNo);

        System.out.println("Result After off the 7th bit : "+iRet);
        


    }
}