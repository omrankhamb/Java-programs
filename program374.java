import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.net.Socket;
import java.util.*;

class program374
{

    
    public static void main(String Arg[])
    {
        Scanner sobj = new Scanner(System.in);
        try{

            // create a socket and finding the server 
            Socket socket = new Socket("127.0.0.1",9000);

            System.out.println("Connection woth server successfully");

            // getting the input from server 

            DataInputStream din= new DataInputStream(socket.getInputStream());
            DataOutputStream dos = new DataOutputStream(socket.getOutputStream());

            String read = new String();
            String write = new String();

            while (true) { 
                System.out.println("Enter message to server");
                read = sobj.nextLine();
                dos.writeUTF(read);
                dos.flush();
                write = din.readUTF();
                System.out.println("Response from server is : " + write);                
            }



            


        }
        catch(Exception e)
        {
            System.out.println("Exceptio is  : " + e);
        }
    }
}