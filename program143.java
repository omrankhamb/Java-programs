import java.util.*;

class ArrayX
{
    public ArrayX()
    {
        System.out.println("Inside Base constructor");
    }

    public void CallByAddress(int Arr[])
    {
        int iCnt = 0;
        for(iCnt = 0 ; iCnt < Arr.length ; iCnt++)
        {
            Arr[iCnt]++;
        }
    }

    public int Summation(int Arr[])
    {
        int iCnt = 0;
        int iSum = 0;

        for(iCnt = 0 ; iCnt < Arr.length ; iCnt++)
        {
            iSum = iSum + Arr[iCnt];
        }

        return iSum;
    }

    public int CountEven(int Arr[])
    {
        int iSum = 0;
        int iCnt = 0;
        int iCount = 0;

        for(iCnt = 0 ; iCnt < Arr.length ; iCnt++)
        {
            if(Arr[iCnt] % 2 == 0)
            {
                iCount++;
            }
            
        }

        return iCount;
    }

    public int SumEven(int Arr[])
    {
        int iSum = 0;
        int iCnt = 0;
        int iCount = 0;

        for(iCnt = 0 ; iCnt < Arr.length ; iCnt++)
        {
            if(Arr[iCnt] % 2 == 0)
            {
                iSum = iSum + Arr[iCnt];
            }
            
        }

        return iSum;
    }
}

class program143
{
    public static void main(String Arg[])
    {
        Scanner sobj = new Scanner(System.in);
        ArrayX bobj = new ArrayX();

        int iSize = 0;
        int iCnt = 0;
        int iRet = 0;
        // Not work in java int Arr[10];

        System.out.println("Enter the length of array : ");
        iSize = sobj.nextInt();

        
        int Arr[] = new int[iSize];

        System.out.println("Enter the array : ");
        for(iCnt = 0 ; iCnt < Arr.length ; iCnt++)
        {
            Arr[iCnt] = sobj.nextInt();
        }
        
        iRet = bobj.SumEven(Arr);

        System.out.println("Sum of even number is : "+iRet);


    }
}