import java.io.*;

class program343
{
    public static void main(String Arg[])
    {
        try
        {
            FileInputStream fd = new FileInputStream("New.txt");

            BufferedInputStream bin = new BufferedInputStream(fd);
            int i = 0;

            while((i = bin.read()) != -1)
            {
                System.out.print((char) i);
            }

            bin.close();
            fd.close();
            // Creating refrece count to zero
        }
        catch(Exception e)
        {
            System.out.println("Exception is : " + e);
        }
        finally
        {
            System.out.println("Program ended suuccessfully");
        }


    }
}