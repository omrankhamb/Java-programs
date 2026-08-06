import java.io.*;
import java.util.*;
// Package required for reading and writing the file
class program342
{
    public static void main(String Arg[])
    {
       try
       {
        FileOutputStream fr = new FileOutputStream("New.txt");

        String name = "Omprasad Rankhamb Rajesaheb";

        byte b[] = name.getBytes();
        fr.write(b);
        fr.close();
       }
       catch(Exception e)
       {
        System.out.println("Exception is" + e);
       }
    }   
}