import java.io.*;

class program345
{
    public static void main(String Arg[])
    {
        try{
            FileInputStream fr = new FileInputStream("New.txt");
            BufferedInputStream bin = new BufferedInputStream(fr);

            int i = 0;

            while((i = bin.read()) != -1)
            {
                System.out.print((char)i);
            }

        }
        catch(Exception e)
        {
            System.out.println("Exception is : " + e);
        }
        finally{
            System.out.println("Program ended Successfullly");
        }
        




    }
}