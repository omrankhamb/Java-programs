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

    public int CountOdd(int Arr[])
    {
        int iSum = 0;
        int iCnt = 0;
        int iCount = 0;

        for(iCnt = 0 ; iCnt < Arr.length ; iCnt++)
        {
            if(Arr[iCnt] % 2 == 1)
            {
                iCount++;
            }

        }

        return iCount;
    }

    public int SumOdd(int Arr[])
    {
        int iSum = 0;
        int iCnt = 0;
        int iCount = 0;

        for(iCnt = 0 ; iCnt < Arr.length ; iCnt++)
        {
            if(Arr[iCnt] % 2 == 1)
            {
                iSum = iSum + Arr[iCnt];
            }

        }

        return iCount;
    }

    public int CountFrequency(int Arr[], int iNo)
    {
        int iCnt = 0;
        int iCount = 0;

        for(iCnt = 0 ; iCnt < Arr.length ; iCnt++)
        {
            if(Arr[iCnt] == iNo)
            {
                iCount++;
            }
        }

        return iCount;
    }

    public boolean LinearSearch(int Arr[],int iNo)
    {
        int iCnt = 0 ;

        for(iCnt = 0 ; iCnt < Arr.length ; iCnt++)
        {
            if(Arr[iCnt] == iNo)
            {
                break;
            }
        }

        if(iCnt >= Arr.length)
        {
            return false;
        }
        else
        {
            return true;
        }
    }
}

class program148
{
    public static void main(String Arg[])
    {
        Scanner sobj = new Scanner(System.in);
        ArrayX bobj = new ArrayX();

        int iSize = 0;
        int iCnt = 0;
        int iRet = 0;
        int iValue = 0;
        boolean bRet = false;
        // Not work in java int Arr[10];

        System.out.println("Enter the length of array : ");
        iSize = sobj.nextInt();

        int Arr[] = new int[iSize];

        System.out.println("Enter the array : ");
        for(iCnt = 0 ; iCnt < Arr.length ; iCnt++)
        {
            Arr[iCnt] = sobj.nextInt();
        }

        System.out.println("Enter the Number to Search : ");
        iValue = sobj.nextInt();
        
        bRet = bobj.LinearSearch(Arr, iValue);

        if(bRet)
        {
            System.out.println("Number is present");
        }
        else
        {
            System.out.println("Number is not present");
        }


    }
}