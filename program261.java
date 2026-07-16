import java.util.*;
// for 5th and 18 th position
class BitX
{
    public boolean Chkbit(int iNo)
    {
        int iMask = 0x10;
        int iMask2 = 0x20000;
        int iAns = 0;

        iMask = iMask | iMask2;
        iAns = iMask & iNo;

        if(iAns == iMask)
        {
            return true;
        }
        else
        {
            return false;
        }
    }   
}

class program261
{
    public static void main(String A[])
    {
        Scanner sobj = new Scanner(System.in);
        BitX bobj = new BitX();

        int iNo = 0;
        boolean bRet = false;
        System.out.println("Enter A Number : ");

        iNo = sobj.nextInt();
        bRet = bobj.Chkbit(iNo);

        if(bRet)
        {
            System.out.println("Bit Is ON");
        }
        else
        {
            System.out.println("Bit is OFF");
        }


    }
}