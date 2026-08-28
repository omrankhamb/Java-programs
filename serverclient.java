import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.net.*;
import java.util.*;
import jdk.net.Sockets;

class serverclient
{
    public static void main(String arg[])
    {
        Scanner sobj = new Scanner(System.in);
        try
        {
            Socket socket = new Socket("127.0.0.1",9000);

            System.out.println("Your request is sent too server");

            DataInputStream dis = new DataInputStream(socket.getInputStream());
            DataOutputStream dos = new DataOutputStream(socket.getOutputStream());

            while (true) { 
                System.out.print("Enter the opereation :");
                String str = sobj.nextLine();
                dos.writeUTF(str);
                dos.flush();
                str = dis.readUTF();
                System.out.println(str);
            }


        }
        catch(Exception e)
        {
            System.out.println("Exception is : " + e);
        }
    }
}

