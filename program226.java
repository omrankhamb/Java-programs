import java.util.*;
class program226
{
    public static void main(String A[])
    {
        Scanner sobj = new Scanner(System.in);

        int iNo  = 0;

        System.out.println("Enter A number : ");
        iNo = sobj.nextInt();

        while(iNo != 0)
        {
            int idigit = iNo % 2;
            System.out.print(idigit);
            iNo = iNo/2;
        }


    }
}