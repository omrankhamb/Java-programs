import java.io.BufferedReader;
import java.io.InputStreamReader;

class program68
{
    public static void main(String a[])
    {
        BufferedReader bobj = new BufferedReader(new InputStreamReader(System.in));

        
        String str1 = "Hello World";    // String sotred in string const pool
        String str2 = new String("Hello world");    //String Stored in String literal

        String str3 = "Hello World";
        String str4 = new String("Hello world");

        System.out.println(str1.hashCode());
        System.out.println(str3.hashCode());

        System.out.println(str2.hashCode());
        System.out.println(str4.hashCode());
         
    }
}