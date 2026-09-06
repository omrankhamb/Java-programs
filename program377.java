import java.util.*;
import java.io.*;

class program377
{
    public static void main(String Arg[])
    {
        Scanner sobj = new Scanner(System.in);
        try
        {
            String FileName = null;
            System.out.println("Enter the File Name  : ");
            FileName = sobj.nextLine();

            File file = new File(FileName);

            if(file.exists() == false)
            {
                file.createNewFile();
            }

            FileOutputStream fileOutputStream = new FileOutputStream(file);

            System.out.println("Entet the string to write in File : ");

            String string = sobj.nextLine();

            byte b[] = string.getBytes();

            fileOutputStream.write(b);
            
            System.out.println("Data written successfully");

            
        }
        catch(Exception e)
        {
            System.out.println("Exception is : " + e);
        }
    }
}