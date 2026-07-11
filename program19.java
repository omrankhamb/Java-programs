import java.util.*;


class program19
{
    public int Summation(int Arr[])
    {
        int iSum = 0;
        int iCnt = 0;

        for(iCnt = 0 ; iCnt < Arr.length ; iCnt++)
        {
            iSum = Arr[iCnt] + iSum;
        }

        return iSum;
    }

    public static void main(String[] args)
    {
        Scanner sobj = new Scanner(System.in);
        program19 obj = new program19();

        int iCnt = 0;
        int iRet = 0;
        int iLength = 0;

        System.out.println("Enter The number Of elements : ");
        iLength = sobj.nextInt();

        int Brr[] = new int[iLength];
    //  int *Brr = (int*)malloc(iLength* iLength);

        System.out.println("Enter The Elements : \n");

        for(iCnt = 0  ; iCnt < Brr.length ; iCnt++)
        {
            Brr[iCnt] = sobj.nextInt();
        }

        iRet = obj.Summation(Brr);
        System.out.println("Summation Of array is : "+iRet);
        

        Brr = null;             // Making refrece Count Zero
        System.gc();            // Calling garbage Collector
        // Not Assure TO Come
        

        
    }
}