import java.util.*;

/*
    a
    a  b
    a  b  c
    a  b  c  d
    a  b  c  d  e
    a  b  c  d  e  f
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
            for(j = 1,ch = 'a' ; j <= i ; j++,ch++)
            {
                System.out.print(ch+"  ");
                
            }
            System.out.println();
        }

        
    }
}

class program187
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