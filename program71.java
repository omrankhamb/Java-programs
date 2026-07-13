import java.io.BufferedReader;
import java.io.InputStreamReader;

class program71
{
    public static void main(String a[]) throws Exception
    {
        BufferedReader bobj = new BufferedReader(new InputStreamReader(System.in));

        
        String sobj = new String();

        System.out.println("Enter A string : ");
        sobj = bobj.readLine();

        System.out.println("You entered String is : "+ sobj);
        System.out.println("Length of string is : "+ sobj.length());

         
    }
}