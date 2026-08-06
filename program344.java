import java.io.*;

class program344
{
    public static void main(String Arg[])
    {
        try
        {
            FileWriter fr = new FileWriter("New.txt");

            fr.write("Hi my name is Swati Rajesaheb Rankhamb");

            fr.close();
        }
        catch(Exception e)
        {
            System.out.println("Escaptio is : " + e);
        }
        finally{
            System.out.println("Program Ended successfully");
        }
    }
}