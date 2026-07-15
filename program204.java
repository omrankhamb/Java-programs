import java.util.*;

class program204
{
    public static void main(String Arg[])
    {
        Scanner sobj = new Scanner(System.in);

        String str = null;

        System.out.println("Enter A string : ");
        str = sobj.nextLine();

       for(int i = 0 ; i < str.length() ; i++)
       {

        System.out.print(str.charAt(i));
       }
    }
}