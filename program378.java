import java.util.*;
import java.io.*;

class program378
{
    public static void main(String Arg[])
    {

        Scanner sobj = new Scanner(System.in);
        try
        {
            System.out.println("Enter the file Name To fetch tha data : ");
            String fileName = sobj.nextLine();

            File file = new File(fileName);

            if(file.exists() == false)
            {
                file.createNewFile();
            }

            byte buffer[] = new byte[1024];
            FileInputStream fileInputStream = new FileInputStream(file);

            int iRet = 0;

            // read the data untile iRet -1 
            while((iRet = fileInputStream.read(buffer)) != -1)
            {
                System.out.print(new String(buffer,0,iRet));
            }
        }
        catch(Exception e)
        {
            System.out.println("Exception is : " + e);
        }
    }
}