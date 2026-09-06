import java.util.*;

class program393
{
    public static void main(String A[])
    {

        if(A.length != 2)
        {
            System.out.println("Invalid number of arguments : ");
            return;
        }

        // it will do the string concatenation


        // we have to convert the string into the Integer using the parsing
        int ans = Integer.parseInt(A[0]) + Integer.parseInt(A[1]);
        System.out.println("Addition is : " + ans );
        
    }
}