import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.net.*;
import java.util.*;
import jdk.net.Sockets;

class program376
{
    public static void main(String arg[])
    {
        Scanner sobj = new Scanner(System.in);
        String str;
        try
        {
            Socket socket = new Socket("127.0.0.1",9000);

            System.out.println("Your request is sent too server");

            DataInputStream dis = new DataInputStream(socket.getInputStream());
            DataOutputStream dos = new DataOutputStream(socket.getOutputStream());

            str = dis.readUTF();
            System.out.println(str);

            dos.writeUTF("Client message");

            
            str = dis.readUTF();
            System.out.println(str);
            str = dis.readUTF();
            System.out.println(str);
            str = dis.readUTF();
            System.out.println(str);

        }
        catch(Exception e)
        {
            System.out.println("Exception is : " + e);
        }
    }
}

