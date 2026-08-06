import com.sun.source.tree.TryTree;
import java.io.*;

class program346
{
    public static  void main(String Arg[])
    {
        try
        {
             FileOutputStream fd = new FileOutputStream("New.txt");
            BufferedOutputStream bin = new BufferedOutputStream(fd);

            String Name = "Omprasad Rankheamb Rajesaheb";

            byte b[] = Name.getBytes();


            bin.write(b);

            bin.flush();
            bin.close();
            fd.close();
        }
        catch(Exception e)
        {
            System.out.println("Exception is : " + e);
        }
        finally
        {
            System.out.println("Program ended successfully");
        }
        


    }
}