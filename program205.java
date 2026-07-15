import java.util.*;

class program205
{
    public static void main(String Arg[])
    {
        Scanner sobj = new Scanner(System.in);

        String Arr = null;
        System.out.println("Enter a string : ");

        Arr = sobj.nextLine();

        char str[] = Arr.toCharArray();

        for(int i = 0 ; i < str.length ; i++)
        {

            System.out.print(str[i]);
        }


    }
}