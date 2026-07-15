import java.util.*;

/*
    a       b       c       d
    1       2       3       4
    a       b       c       d
    1       2       3       4
*/

class Pattern 
{
    public void Display(int iRow,int iCol) 
    {
        int iCnt = 0;
        int i = 0;
        int j = 0;
        char ch = 'A';

        for(i = 1 ; i <= iRow ; i++)
        {
            for(j = 1,ch='a' ; j <= iCol ; j++,ch++)
            {
                if(i % 2 == 1){
                    System.out.print(ch+"\t");
                }
                else
                {
                    System.out.print(j+"\t");
                }
                
                
            }
            System.out.println();
        }

        
    }
}

class program173
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