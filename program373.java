import java.io.*;
import java.net.*;
import java.util.*;

class program373
{
    public static void main(String[] args) {

        
        try
        {
            ServerSocket serverSocket = new ServerSocket(9000);
            // create a server at port 9000

            System.out.println("-------------------------------------------------------");
            System.out.println("----------------- Server get Started ------------------");
            System.out.println("-------------------------------------------------------");

            System.out.println("Server is waiting for response");

            // accepet client request only on client can serve
            
            // wait for client

            System.out.println("Client request accepeted");

            // create a stream to client to write on client screen
             
    
            while (true) { 
                System.out.println("Server is waiting for client request...");
                Socket socket = serverSocket.accept();

                System.out.println("client connected successfully");

                Thread t = new Thread(()->HandleClientRequest(socket));
                t.start();

            }
        
        }
        catch(Exception e)
        {
            System.out.println("Exception is " + e);
        }
        

        
    }

    public static void HandleClientRequest(Socket socket)
        {
            Scanner sobj = new Scanner(System.in);

            try
            {

                DataOutputStream dos =  new DataOutputStream(socket.getOutputStream());
                DataInputStream dis = new DataInputStream(socket.getInputStream());

                String read = new String();
                String write = new String();

                System.out.println("Enter the message to client : ");
                while (true) { 
                    read = dis.readUTF();
                    System.out.println("Message from client is : " + read);
                    System.out.println("Give response to client : ");
                    write = sobj.nextLine();
                    dos.writeUTF(write);
                }     
            }
            catch(Exception e)
            {
                System.out.println("Exception is : " + e);
            }
            
        }
}