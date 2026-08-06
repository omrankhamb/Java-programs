import java.io.*;

class program341
{
    public static void main(String Arg[])
    {
        try
        {
            FileReader fr = new FileReader("New.txt");
            // return fe of pointer
            int i = 0;
            while((i = fr.read()) != -1)
            {
                System.out.print((char)i);
                // Typecasting printing
            }

        }
        catch(Exception e)
        {
            System.out.println("Exception is : " + e);
        }

        System.out.println("Success");
    }
}