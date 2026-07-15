import java.util.*;

class StringX
{
    public void Display(String str)
    {
        System.out.println("Recieved String is : "+str);
    }

    public int CountCapital(String str)
    {
        int iCount = 0;
        int i = 0;
        char Arr[] = str.toCharArray();

        for(i = 0 ; i < Arr.length ; i++)
        {
            if(Arr[i] >= 'A' && Arr[i] <= 'Z')
            {
                iCount++;
            }
        }
        return iCount;
    }

    public int CountSmall(String str)
    {
        int iCount = 0;
        int i = 0;
        char Arr[] = str.toCharArray();

        for(i = 0 ; i < Arr.length ; i++)
        {
            if(Arr[i] >= 'a' && Arr[i] <='z')
            {
                iCount++;
            }
        }

        return iCount;
    }

    public int CountDigit(String str)
    {
        int iCnt = 0;
        int i = 0;
        char Arr[] = str.toCharArray();

        for(i = 0 ; i < Arr.length ; i++)
        {

        }
        return i;
    }

     public int CountSpace(String str)
    {
        int iCnt = 0;
        int i = 0;
        char Arr[] = str.toCharArray();

        for(i = 0 ; i < Arr.length ; i++)
        {
            if(Arr[i] == ' ')
            {
                iCnt++;
            }
        }
        return iCnt;
    }

    
}

class program213
{
    public static void main(String Arg[])
    {
        Scanner sobj = new Scanner(System.in);
        StringX obj = new StringX();
        String str = null;      // Refrence but not memory allocation
        int iRet = 0;

        System.out.println("Enter a String : ");
        str = sobj.nextLine();


        iRet = obj.CountSpace(str);
        System.out.print("Count of Capital letter in string : "+iRet);
    }
}