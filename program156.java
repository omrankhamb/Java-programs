import java.util.*;

// Input  : 7 
// Output : 1       *       2       *       3       *       4

class Pattern 
{
    public void Display(int iNo) 
    {
        int iCnt = 0;
        int iCount = 0;

        for (iCnt = 1,iCount = 1; iCnt <= iNo; iCnt++) 
        {
            if(iCnt % 2 == 0)
            {
                System.out.print("*\t");
            }
            else
            {
                System.out.print(iCount+"\t");
                iCount++;
                
            }
        }
    }
}

class program156
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