import java.util.*;

// Input  : 5 
// Output : *       #       *       #       *       #       *       #       *       #

class Pattern 
{
    public void Display(int iNo) 
    {
        int iCnt = 0;

        for (iCnt = 1; iCnt <= iNo; iCnt++) 
            {
            System.out.print("*"+iCnt+"*\t");
        }
    }
}

class program154
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