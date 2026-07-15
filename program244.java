import java.util.*;

class program244
{
    public static void main(String A[])
    {
        Scanner sobj = new Scanner(System.in);

        int iCnt = 0;
        int iMask = 0x1;

        for(iCnt = 1 ; iCnt <=33 ; iCnt++)
        {
            System.out.println(iCnt + "  "+ iMask);
            iMask = iMask << 1;
        }
           

        
    }
}