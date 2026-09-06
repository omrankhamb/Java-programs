import java.util.*;
import java.io.*;

class program379
{
    public static void main(String Arg[])
    {
        Scanner sobj = new Scanner(System.in);

        try
        {   
            System.out.println("Enter the source File Name : ");

            String src = sobj.nextLine();
            File filesrc = new File(src);

            System.out.print("Enter the destination file name : ");

            String dest = sobj.nextLine();
            File filedest = new File(dest);

            int iRet = 0;
            byte buffer[] = new byte[1024];

            FileInputStream fileInputStream = new FileInputStream(filesrc);
            FileOutputStream fileOutputStream = new FileOutputStream(filedest);

            while((iRet = fileInputStream.read(buffer)) != -1)
            {
                fileOutputStream.write(buffer,0,iRet);
            }
        

            

        }
        catch(Exception e)
        {
            System.out.println("Exception is : " + e);
        }
    }
}