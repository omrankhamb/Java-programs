import java.util.*;

class program203
{
    public static void main(String Arg[])
    {
        Scanner sobj = new Scanner(System.in);

        String str = null;

        System.out.println("Enter A string : ");
        str = sobj.nextLine();

        // error
        System.out.println(str.charAt(0));
        System.out.println(str.charAt(1));
        System.out.println(str.charAt(2));

        System.out.println(str);
    }
}