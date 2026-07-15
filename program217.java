import java.util.*;

class StringX
{
    public String toUpperX(String str)
    {
        int iCnt = 0;
        int i = 0;
        char Arr[] = str.toCharArray();

        for(i = 0 ; i < Arr.length ; i++)
        {
            if(Arr[i] >= 'a' && Arr[i]<= 'z')
            {
                Arr[i] = (char)(Arr[i] -32);
            }
            
        }
        return new String(Arr);

    }
}
class program217
{
    public static void main(String Arg[])
    {
        Scanner sobj = new Scanner(System.in);
        StringX strobj = new StringX();
        String data = null;      // Refrence but not memory allocation
        int iRet = 0;

        // input of string
        System.out.println("Enter String : ");
        data = sobj.nextLine();

        data = strobj.toUpperX(data);
        System.out.println(data);

    }
}