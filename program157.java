import java.util.*;

// Input  : 7 
// Output : a       b       c       d       e       f       g

class Pattern 
{
    public void Display(int iNo) 
    {
        int iCnt = 0;
        int iCount = 0;
        char ch = 'a';

        for (iCnt = 1,iCount = 1; iCnt <= iNo; iCnt++,ch++) 
        {
            System.out.print(ch+"\t");
        }
    }
}

class program157
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