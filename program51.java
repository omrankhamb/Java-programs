import java.util.*;
import java.lang.Exception;

class program51
{
    public static void main(String[] args) 
    {
        int i = 0 ;
        int j = 12;

        int k = 0;

        try
        {
            k = j / i;
            System.out.println("result of answer : " + k);
        }
        catch(Exception obj)
        {
            System.out.println("Exception is :"+obj);
        }
        finally
        {
            System.out.println("Exception is Handled");
        }

        System.out.println("End of main");


    }   
}