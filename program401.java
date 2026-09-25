import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.ObjectOutputStream;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.HashMap;


class program401
{
    public static void main(String Arg[])
    {
        String str;
        try
        {

            ServerSocket serverSocket = new ServerSocket(9000);

            System.out.println("============================= SERVER IS WAITING FOR CLIENT REQUEST =============================");


            // class intilaisation at run time
            Class.forName("com.mysql.cj.jdbc.Driver");


            // Connection with the actaul database
            Connection connection = DriverManager.getConnection(
                "jdbc:mysql://localhost:3306/projectstore", 
                "root" , 
                "");
            

            System.out.println("======================================= DATABASE IS UP =========================================");


            while (true) { 
                Socket socket = serverSocket.accept();
                System.out.println("==================================== Client request is accepted ================================");

                // To create mulitclient server request
                Thread t = new Thread(()-> HandleClientRequest(socket , connection));
                t.start(); 
                
            }

            // client get accepted          

        }
        catch(Exception e)
        {
            System.out.println("Exeption is  : " + e);
        }
    }   

    public static void HandleClientRequest(Socket socket , Connection connection)
    {

        PreparedStatement stmt;
        HashMap<Integer , Integer> Item;
        
        DataOutputStream dos;
        DataInputStream dis;
        try
        {
            Item = new HashMap<>();
            
            dis = new DataInputStream(socket.getInputStream());
            dos = new DataOutputStream(socket.getOutputStream());

            System.out.println("waiting for command");
            while(true)
            {
                // INPUT COMMAND CREATION
                String string = dis.readUTF();
                string = string.replaceAll("\\s+", " ");
                string = string.toUpperCase();

                // to clear for next output
                Item.clear();
                
                String Command[] = string.split(" ");
                switch (Command[0]) {
                    case "GET":

                            stmt = connection.prepareStatement(
                            "SELECT * FROM store WHERE Item_Id = ?"
                            );

                            int itemId = 101;   // or any variable
                            stmt.setInt(1, itemId);
                            ResultSet resultSet = stmt.executeQuery();


                            while (resultSet.next()) 
                            {
                                Item.put(resultSet.getInt("Item_Id"),resultSet.getInt("amount"));
                            }
                            
                            ObjectOutputStream out = new ObjectOutputStream(socket.getOutputStream());
                            out.writeObject(Item);                           
                        
                        break;
                    case "GETALL":

                            stmt = connection.prepareStatement(
                            "SELECT * FROM store"
                            );

                            resultSet = stmt.executeQuery();


                            while (resultSet.next()) 
                            {
                                Item.put(resultSet.getInt("Item_Id"),resultSet.getInt("amount"));
                            }
                            
                            out = new ObjectOutputStream(socket.getOutputStream());
                            out.writeObject(Item);    
                        
                        break;

                    case "PUT":
                        System.out.println("element is removed in store");
                        break;

                    case "POST":
                        System.out.println("element is removed in store");
                        break;

                    case "DELETE":
                        System.out.println("element is removed in store");
                        break;
                    default:
                        throw new AssertionError();
                }

            }       

            

        }
        catch(Exception e)
        {
            System.out.println("Exception in Handle Request is ; " + e);
        }

    }
    
}