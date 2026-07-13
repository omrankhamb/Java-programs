import java.util.Scanner;
import java.lang.Exception;

class AgeInvalid extends Exception
{
    public AgeInvalid(String str)
    {
        super(str);
    }
}

class program54
{
    public static void main(String[] args) 
    {
        
        int iAge = 0;

        Scanner sobj = new Scanner(System.in);
        iAge = sobj.nextInt();

        try
        {
            if(iAge < 18)
            {
                throw new AgeInvalid("you are under age");
            }
            else
            {
                System.out.println("your age is valid");
            }
        }
        catch (Exception eobj)
        {
            System.out.println("EXCeption is : "+eobj);
        }
        finally
        {
            System.out.println("End of main : ");
        }
        



    }   
}