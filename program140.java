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
}

class program140
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
        
        iRet = bobj.Summation(Arr);

        System.out.println("Summation of array is : "+iRet);


    }
}