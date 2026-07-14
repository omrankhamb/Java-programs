import java.util.*;
class Base
{
    public Base()
    {
        System.out.println("Inside Base constructor");
    }

    public boolean EvenOrOdd(int iNo)
    {
        if(iNo % 2 == 0)
        {
            return true;
        }
        else
        {
            return  false;
        }
    }
}
class program92
{

    
    public static void main()
    {
        Scanner sobj = new Scanner(System.in);
        Base bobj = new Base();

        int iNo = 0;
        boolean bRet = false;

        System.out.println("Enter A number to Check Even or Odd : ");

        iNo = sobj.nextInt();

        bRet = bobj.EvenOrOdd(iNo);

        if(bRet) 
        {
            System.out.println("Number is Even");
        }
        else
        {
            System.out.println("Number is Odd");
        }


        

    }
}