import java.util.*;
class program227
{
    public static void main(String A[])
    {
        Scanner sobj = new Scanner(System.in);

        int iNo1 = 0 ,iNo2 = 0,Ans = 0;

        System.out.println("Enter a number : ");
        iNo1 = sobj.nextInt();

        System.out.println("Enter A Number : ");
        iNo2 = sobj.nextInt();

        Ans = iNo1 & iNo2;
        System.out.println("Result of & operator is : "+Ans);
        

    }
}