import java.util.*;

class Base
{
    public Base()
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
}

class program141
{
    public static void main(String Arg[])
    {
        Scanner sobj = new Scanner(System.in);
        Base bobj = new Base();

        int iSize = 0;
        int iCnt = 0;
        int iRet = 0;
        // Not work in java int Arr[10];

        int Arr[] = {10,100,20,30,40,050};
        
        iRet = bobj.CountEven(Arr);

        System.out.println("Count of even is  : "+iRet);


    }
}