import java.util.*;

/*
    *    *    *    *    *    *
    *    *    *    *    *
    *    *    *    *
    *    *    *
    *    *
    *
*/

class Pattern 
{
    public void Display(int iRow,int iCol) 
    {
        int iCnt = 0;
        int i = 0;
        int j = 0;
        char ch = 'a';

        for(i = 1 ; i <= iRow ; i++)
        {
            for(j = 1 ; j <= iRow -i+1 ; j++)
            {
                System.out.print("*" + "    ");
            }
            System.out.println();
        }

        
    }
}

class program192
{
    public static void main(String Arg[]) 
    {
        Pattern obj = new Pattern();
        Scanner sobj = new Scanner(System.in);

        int iValue1 = 0;
        int iValue2 = 0;

        System.out.println("Enter the Number of Row : ");
        iValue1 = sobj.nextInt();

        System.out.println("Enter the Number of Column : ");
        iValue2 = sobj.nextInt();

        obj.Display(iValue1,iValue2);
    }
}