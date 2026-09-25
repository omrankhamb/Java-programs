import java.io.*;
import java.net.*;
import java.util.*;
import jdk.net.Sockets;

class program402
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
            

            while (true) { 
                System.out.println("Enter the commnad");
                str = sobj.nextLine();

                dos.writeUTF(str);
                dos.flush();                
                
                ObjectInputStream in = new ObjectInputStream(socket.getInputStream());
                HashMap<Integer,Integer> map = (HashMap<Integer,Integer>) in.readObject();
                System.out.println(map);

            }

        }
        catch(Exception e)
        {
            System.out.println("Exception is : " + e);
        }
    }
}

