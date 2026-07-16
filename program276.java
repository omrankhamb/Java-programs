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

        iRet = iNo | iMask;
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

    public boolean ChkBitAtPosition(int iNo,int iPos)
    {
        int iMask = 0x1;
        iMask = iMask <<(iPos - 1);

        iNo = iNo & iMask;
        if(iNo == iMask)
        {
            return true;
        }
        else
        {
            return false;
        }
    }

    public int OffBitAtPosition(int iNo,int iPos)
    {
        int iMask = 0x1;
        int iANs = 0;
        iMask = iMask << (iPos -1);
        iMask = ~iMask;

        iANs = iNo & iMask;

        return iANs;
        
    }

    public int ONBitAtPosition(int iNo,int iPos)
    {
        int iMask = 0x1;
        int iANs = 0;
        iMask = iMask << (iPos -1);

        iANs = iNo | iMask;

        return iANs;
        
    }


    public int ToggleBitAtPos(int iNo,int iPos)
    {
        int iMask = 0x1;
        int iAns = 0;

        iMask = iMask << (iPos -1);

        iAns = iNo ^ iMask;
        return iAns;
    }

    public int ToggleFirstAndLatNibble(int iNo)
    {
        int iAns = 0;
        int iMask = 0xF000000F;

        iAns = iNo ^ iMask;
        return iAns;
    }

    public int  CountNumber1(int iNo)
    {
        int iCnt = 0;

        while(iNo != 0)
        {
            iCnt = iCnt + iNo % 2;
            iNo = iNo/2;
        }
        return iCnt;
    }

    public int ToggBitRange(int iNo,int iStart,int iend)
    {
        int iMask = 0x1;

        for(int i = iStart ; i <= iend ; i++)
        {
            int temp = 0x1;
            temp = temp << (i - 1);
            iMask = iMask | temp;
        }

        iNo = iNo ^ iMask;
        return iNo;
    }
}

class program275
{
    public static void main(String Arg[])
    {
        Scanner sobj = new Scanner(System.in);
        int iNo = 0;
        int iRet = 0;
        int iPos = 0;
        int iPos2 = 0;
        BitX bobj = new BitX();
        boolean bAns  = false;

        System.out.println("Enter A Number : ");
        iNo = sobj.nextInt();

        System.out.println("Enter The Position To check Bit : ");
        iPos = sobj.nextInt();

        System.out.println("Enter The Second  Position To check Bit : ");
        iPos2 = sobj.nextInt();

        iRet = bobj.ToggBitRange(iNo,iPos ,iPos2);

        System.out.print("Number After Toggle Position At Bit : " + iRet);

        
    }
}