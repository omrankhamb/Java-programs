import java.io.BufferedReader;
import java.io.InputStreamReader;

class program70
{
    public static void main(String a[])
    {
        BufferedReader bobj = new BufferedReader(new InputStreamReader(System.in));

        
        String str1 = "Hello World";    // String sotred in string const pool
        String str2 = new String("Hello World");    //String Stored in String literal

        String str3 = "Hello World";
        String str4 = new String("Hello World");

        if(str1.equals(str2))
        {
            System.out.println("String  content are Equal");
        }else
        {
            System.out.println("String content are not equal");
        }
         
    }
}