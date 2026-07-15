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
}

class program139
{
    public static void main(String Arg[])
    {
        Scanner sobj = new Scanner(System.in);
        Base bobj = new Base();

        int iSize = 0;
        int iCnt = 0;
        // Not work in java int Arr[10];

        int Arr[] = {10,100,20,30,40,050};
        
        bobj.CallByAddress(Arr);

        for(iCnt = 0 ; iCnt < Arr.length ; iCnt++)
        {
            System.out.println(Arr[iCnt]);
        }


    }
}