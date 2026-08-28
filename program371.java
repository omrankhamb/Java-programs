// run first and then run the 920
import java.io.DataInputStream;
import java.io.DataOutput;
import java.io.DataOutputStream;
import java.net.*;

class program371
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

            Thread t = new Thread(()-> HandleClientRequest(clientsocket));
            t.start();  
            // calling constructor
        }
        catch(Exception e)
        {
            System.out.println("Exception is : " + e);
        }
        
    }

    public static void HandleClientRequest(Socket socket)
    {
        try
        {
            DataInputStream dis = new DataInputStream(socket.getInputStream());
            DataOutputStream dos = new DataOutputStream(socket.getOutputStream());

            dos.writeUTF("Connected to marvellos Server");

        }
        catch(Exception e)
        {
            System.out.println("Exceptio is : " + e);
        }
    }
}