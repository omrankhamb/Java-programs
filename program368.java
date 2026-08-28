
import java.net.*;

class program368
{
    public static void main(String Arg[])
    {
        try{
            ServerSocket serverSocket = new ServerSocket(9000);
            System.out.println("------------------------------------------------------");
            System.out.println("------------- Marvellous Server Started --------------");
            System.out.println("------------------------------------------------------");

            System.out.println("server is waiting for client request");

            Socket clientsocket = serverSocket.accept();
            System.out.println("clinent connected successfully");
        }
        catch(Exception e)
        {
            System.out.println("Exceptio is : " + e);
        }
        
    }
}