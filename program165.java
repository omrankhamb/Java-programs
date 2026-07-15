import java.util.*;

/*
    1       1       1       1
    2       2       2       2
    3       3       3       3
    4       4       4       4
*/

class Pattern 
{
    public void Display(int iRow,int iCol) 
    {
        int iCnt = 0;
        int i = 0;
        int j = 0;

        for(i = 1 ; i <= iRow ; i++)
        {
            for(j = 1 ; j <= iCol ; j++)
            {
                System.out.print(i+"\t");
            }
            System.out.println();
        }

        
    }
}

class program165
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