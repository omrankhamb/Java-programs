import java.io.BufferedReader;
import java.io.InputStreamReader;

class program67      
{
    public static void main(String a[])
    {
        BufferedReader bobj = new BufferedReader(new InputStreamReader(System.in));

        
        String str1 = "Hello World";    // String sotred in string const pool
        String str2 = new String("Hello world");    //String Stored in String literal


        /*
        
    +---------------------------------------------------------+
    |  In String Const Pool No multiple Copies are Created    | 
    |  In String Literal multiple copies are created          |
    +---------------------------------------------------------+

        */
         
    }
}

