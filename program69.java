import java.io.BufferedReader;
import java.io.InputStreamReader;

class program69
{
    public static void main(String a[])
    {
        BufferedReader bobj = new BufferedReader(new InputStreamReader(System.in));

        
        String str1 = "Hello World";    // String sotred in string const pool
        String str2 = new String("Hello world");    //String Stored in String literal

        String str3 = "Hello World";
        String str4 = new String("Hello world");

        if(str2 == str4)
        {
            System.out.println("Strings litreal Refrence are equal");
        }
        else
        {
            System.out.println("String literal Refrence not equal");
        }

        
        if(str1 == str3)
        {
            System.out.println("Strings liateral pool are equal");
        }
        else
        {
            System.out.println("String literal pool  not equal");
        }
         
    }
}