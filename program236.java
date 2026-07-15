import java.util.*;

class program236
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

        System.out.println(iMask);      // 128
        iMask  = iMask << 1 ;

        System.out.println(iMask);      // 256
        iMask  = iMask << 1 ;

        System.out.println(iMask);      // 512
        iMask  = iMask << 1 ;

        System.out.println(iMask);      // 1024
        iMask  = iMask << 1 ;

        System.out.println(iMask);      // 2048
        iMask  = iMask << 1 ;

         System.out.println(iMask);      // 4096
        iMask  = iMask << 1 ;

         System.out.println(iMask);      // 8192
        iMask  = iMask << 1 ;

         System.out.println(iMask);      // 16394
        iMask  = iMask << 1 ;


    }
}