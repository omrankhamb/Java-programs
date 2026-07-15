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

    
}

class program210
{
    public static void main(String Arg[])
    {
        Scanner sobj = new Scanner(System.in);
        StringX obj = new StringX();
        String str = null;      // Refrence but not memory allocation
        int iRet = 0;

        System.out.println("Enter a String : ");
        str = sobj.nextLine();


        iRet = obj.CountCapital(str);
        System.out.print("Count of Capital letter in string : "+iRet);
    }
}