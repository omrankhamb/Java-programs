import java.util.*;

// Input  : 7 
// Output : A       *       B       *       C       *       D

class Pattern 
{
    public void Display(int iNo) 
    {
        int iCnt = 0;
        int iCount = 0;
        char ch = 'A';

        for (iCnt = 1,iCount = 1; iCnt <= iNo; iCnt++) 
        {
                if(iCnt % 2 ==  0)
                {

                    System.out.print("*"+"\t");
                }
                else
                {
                    System.out.print(ch+"\t");
                    ch++;
                }
        }
    }
}

class program158
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