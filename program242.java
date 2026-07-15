import java.util.*;

class program242
{
    public static void main(String A[])
    {
        Scanner sobj = new Scanner(System.in);

        int iCnt = 0;
        int iMask = 0x1;

        for(iCnt = 0 ; iCnt <=32 ; iCnt++)
        {
            System.out.println(iCnt + "  "+ iMask);
            iMask = iMask << 1;
        }
           

        
    }
}