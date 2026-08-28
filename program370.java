
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.net.*;

class program370
{
    public static void main(String Arg[])
    {
        try{
            Socket socket = new Socket("127.0.0.1",9000);
            System.out.println("Connection with serve successfully");

            DataInputStream dis = new DataInputStream(socket.getInputStream());
            DataOutputStream dos = new DataOutputStream(socket.getOutputStream());

            System.out.println(dis.readUTF());
        }
        catch(Exception e)
        {
            System.out.println("Exception is : " + e);
        }
        
    }
}