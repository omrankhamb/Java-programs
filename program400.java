import java.sql.*;

class program400
{
    public static void main(String Arg[])
    {
        try
        {
            // class intilaisatio at run time
            Class.forName("com.mysql.cj.jdbc.Driver");

            // Connection with the actaul database
            Connection connection = DriverManager.getConnection(
                "jdbc:mysql://localhost:3306/projectstore", "root" , "");

            // Getting page for write the querey
            Statement statement = connection.createStatement();

            // WWrting the actaul querey

            ResultSet resultSet = statement.executeQuery("SELECT * FROM store");

            while(resultSet.next())
            {
                System.out.println("Item ID : " + resultSet.getInt("Item_Id"  ) + " Amount : " + resultSet.getInt("amount"));
            }

            resultSet.close();
            statement.close();
            connection.close();

        }
        catch(Exception e)
        {
            System.out.println("Exeption is  : " + e);
        }
    }   
    
}