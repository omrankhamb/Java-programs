import java.util.*;

class program235
{
    public static void main(String A[])
    {
        Scanner sobj = new Scanner(System.in);

        int iNo1 = 0 ;
        int iMask = 0x1;    //1 in decimal
        int iAns = 0;
        int ipos = 0;

        System.out.println(iMask);    //1
        iMask = iMask <<1;          

        System.out.println(iMask);       //2
        iMask = iMask << 1;

        System.out.println(iMask);      //4
        iMask = iMask << 1;

        System.out.println(iMask);      // 8
        iMask = iMask << 1;

        System.out.println(iMask);      //16
        iMask = iMask << 1;

        System.out.println(iMask);      //32
        iMask = iMask << 1;

        System.out.println(iMask);      // 64
        iMask  = iMask << 1 ;


    }
}