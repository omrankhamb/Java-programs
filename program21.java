import java.util.*;

class program21
{
    public static void Update(int Arr[])
    {
        int iCnt = 0;

        for(iCnt = 0 ; iCnt < Arr.length ; iCnt++)
        {
            Arr[iCnt]++;
        }

    }

    public static void main(String[] args)
    {
        Scanner sobj = new Scanner(System.in);

        int iCnt = 0;
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


        System.out.println("Array Before Funcation Call : \n");
        for(iCnt = 0 ; iCnt < Brr.length ; iCnt++)
        {
            System.out.println(Brr[iCnt]);
        }

        Update(Brr);


        System.out.println("Array After Funcation Call : \n");
        for(iCnt = 0 ; iCnt < Brr.length ; iCnt++)
        {
            System.out.println(Brr[iCnt]);
        }
        

        Brr = null;             // Making refrece Count Zero
        System.gc();            // Calling garbage Collector
        // Not Assure TO Come
        

        
    }
}