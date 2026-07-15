import java.util.*;

// Input  : 7 
// Output : A       b       C       d       E       f       G
class Pattern 
{
    public void Display(int iNo) 
    {
        int iCnt = 0;
        int iCount = 0;
        char ch = 'A';
        char ch2 = 'a';

        for (iCnt = 1,iCount = 1; iCnt <= iNo; iCnt++,ch++,ch2++) 
        {
                if(iCnt % 2 ==  0)
                {

                    System.out.print(ch2+"\t");
                }
                else
                {
                    System.out.print(ch+"\t");
                    
                }
        }
    }
}

class program160
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