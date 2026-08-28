
import java.io.*;
import java.net.*;

class server
{
    public static void main(String Arg[])
    {
    
        try
        {
            ServerSocket serverSocket = new ServerSocket(9000);

            System.out.println("--------------------------------------------------------------------------");
            System.out.println("-------------- server is running successfully ----------------------------");
            System.out.println("--------------------------------------------------------------------------");


            while(true)
            {
                System.out.println("server is waiting for client request");

                Socket socket = serverSocket.accept();

                System.out.println("Client handled successfully");
                // thread gets wuccessfully created for client
                // for new thread new client  is created

                Thread  t = new Thread(()-> handleRequest(socket));
                t.start();
            }

        }
        catch(Exception e)
        {
            System.out.println("Excpetion is : " + e);
        }
    }

    public static void handleRequest(Socket socket)
    {
        try
        {
            DataInputStream dis = new DataInputStream(socket.getInputStream());
            DataOutputStream dos = new DataOutputStream(socket.getOutputStream());

            dos.writeUTF("Connected to omprasad server");


            while(true)
            {
                String command = dis.readUTF();
                command = command.replaceAll("\\s+", " ");
                

                System.out.println("Command recieved for client");

                String parts[] = command.split(" ");

                String Operation = parts[0];

                if(Operation.equals("quit"))
                {
                    dos.writeUTF("Disconnected from server");
                    break;
                }


                if(parts.length !=3 )
                {
                    dos.writeUTF("Invalid command format");
                    continue;
                }

                // parsing the double
                double no1 = Double.parseDouble(parts[0]);
                double no2 = Double.parseDouble(parts[2]);

                double result = 0.0;
                Operation = parts[1].toUpperCase();
                if(Operation.equals("ADD"))
                {
                    result = no1 + no2;
                    dos.writeUTF("Result is : "  + result);

                }
                else if(Operation.equals("SUB"))
                {
                    result = no1 - no2;
                    dos.writeUTF("Result is : "  + result);
                }
                else
                {
                    dos.writeUTF("Invalid operation");
                }

            }// End of while

            socket.close();

        }
        catch(Exception e)
        {
            System.out.println("Exception is : " + e);
        }
    }
}