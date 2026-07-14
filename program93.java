import java.util.*;

class program93
{
    public static int TicketPrice(int iNo)
    {
        if(iNo < 6)
        {
            return 0;
        }
        else if(iNo >=6 && iNo <= 18)
        {
            return 600;
        }
        else if(iNo >18 && iNo <= 30)
        {
            return 900;
        }
        else
        {
            return 400;
        }
    }
    public static void main(String Arg[])
    {
        Scanner sobj = new Scanner(System.in);

        int iAge = 0;
        int iTicketPrice = 0;

        System.out.println("Enter the age : ");

        iAge = sobj.nextInt();

        iTicketPrice = TicketPrice(iAge);

        System.out.println("Ticket Price is : "+iTicketPrice);




    }
}