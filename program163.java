import java.util.*;

/*
    *       *       *       *
    *       *       *       *
    *       *       *       *
*/

class Pattern 
{
    public void Display(int iNo) 
    {
        int iCnt = 0;
        int i = 0;
        int j = 0;

        for(i = 1 ; i <= iNo ; i++)
        {
            for(j = 1 ; j <= iNo ; j++)
            {
                System.out.print("*\t");
            }
            System.out.println();
        }

        
    }
}

class program163
{
    public static void main(String Arg[]) 
    {
        Pattern obj = new Pattern();
        Scanner sobj = new Scanner(System.in);

        int iNo = 0;

        System.out.println("Enter the size : ");
        iNo = sobj.nextInt();

        obj.Display(iNo);
    }
}