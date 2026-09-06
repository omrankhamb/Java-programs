import java.sql.*;
import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.*;

class program401
{
    public static void main(String Arg[])
    {
        String str;
        try
        {

            ServerSocket serverSocket = new ServerSocket(9000);

            System.out.println("================================================================================================");
            System.out.println("============================= SERVER IS WAITING FOR CLIENT REQUEST =============================");
            System.out.println("================================================================================================");


            // class intilaisatio at run time
            Class.forName("com.mysql.cj.jdbc.Driver");


            // Connection with the actaul database
            Connection connection = DriverManager.getConnection(
                "jdbc:mysql://localhost:3306/projectstore", 
                "root" , 
                "");
            

            System.out.println("================================================================================================");
            System.out.println("======================================= DATABASE IS UP =========================================");
            System.out.println("================================================================================================");


            // client get accepted
            Socket socket = serverSocket.accept();
            System.out.println("==================================== Client request is accepted ================================");


            // Getting page for write the querey
            Statement statement = connection.createStatement();


            // Creaetin the stream for client
            DataInputStream dis = new DataInputStream(socket.getInputStream());
            DataOutputStream  dos = new DataOutputStream(socket.getOutputStream());


            // giving the messaget to server 
            dos.writeUTF("Database is connected");
            str = dis.readUTF();
            System.out.println("Message from server : " + str);


             // Wrting the actaul querey
            ResultSet resultSet = statement.executeQuery("SELECT * FROM store");


            while(resultSet.next())
            {
                dos.writeUTF(resultSet.getString("Item_Id") + " " + resultSet.getString("amount"));
            }

            resultSet.close();
            statement.close();
            connection.close();
            dos.close();
            dis.close();
            socket.close();
        }
        catch(Exception e)
        {
            System.out.println("Exeption is  : " + e);
        }
    }   
    
}