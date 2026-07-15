import java.util.*;

class StringX
{
    public String Reverse(String str)
    {
        int i = 0;
        char Arr[] = str.toCharArray();

        int right = 0;
        int left = Arr.length-1;

        while(right <= left)
        {
            char ch = Arr[right];
            Arr[right] = Arr[left];
            Arr[left] = ch;
            right++;
            left--;
        }

        return new String(Arr);
    }
}
class program223
{
    public static void main(String Arg[])
    {
        Scanner sobj = new Scanner(System.in);
        StringX strobj = new StringX();

        String data = null;     // Just creating a refrence
        int iRet = 0;

        System.out.println("Enter a String : ");
        data = sobj.nextLine();

        data = strobj.Reverse(data);

        System.out.println(data);

        
    }
}