import java.util.*;

class program89
{
    public static void main()
    {
        Scanner sobj = new Scanner(System.in);

        int iNo = 0;

        System.out.println("Enter A number to Check Even or Odd : ");

        iNo = sobj.nextInt();

        if(iNo % 2 == 0)
        {
            System.out.println("Number is Even");

        }
        else
        {
            System.out.println("Number is ODD");
        }

    }
}