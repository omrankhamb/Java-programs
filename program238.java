import java.util.*;

class program237
{
    public static void main(String A[])
    {
        Scanner sobj = new Scanner(System.in);

        int iNo1 = 0 ;
        int iMask = 1048576;    //1 in decimal
        int iAns = 0;
        int ipos = 0;

        for(int i = 20 ; i >=0 ; i--)
        {
            System.out.println(iMask);    //1
            iMask = iMask >> 1;       
        }
           

        
    }
}