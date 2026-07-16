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
}

class program263
{
    public static void main(String Arg[])
    {
        Scanner sobj = new Scanner(System.in);
        int iNo = 0;
        BitX bobj = new BitX();
        boolean bAns  = false;

        System.out.println("Enter A Number : ");
        iNo = sobj.nextInt();

        bAns = bobj.ChkBit(iNo);

        if(bAns)
        {
            System.out.println("Bit is on off");
        }
        else
        {
            System.out.println("Bit is off");
        }


    }
}