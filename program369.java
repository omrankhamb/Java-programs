
import java.net.*;

class program369
{
    public static void main(String Arg[])
    {
        try{
            Socket socket = new Socket("127.0.0.1",9000);
            System.out.println("Connection with serve successfully");
        }
        catch(Exception e)
        {
            System.out.println("Exception is : " + e);
        }
        
    }
}