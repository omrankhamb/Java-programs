import java.util.*;


// Input  : 5 
// Output : 1       *       3       *       5       *       7

class Pattern 
{
    public void Display(int iNo) 
    {
        int iCnt = 0;
        int iCount = 0;

        for (iCnt = 1; iCnt <= iNo; iCnt++) 
        {
            if(iCnt % 2 == 0)
            {
                System.out.print("*\t");
            }
            else
            {
                System.out.print(iCnt+"\t");
                
            }
        }
    }
}

class program155
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