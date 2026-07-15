import java.util.*;

// Input  : 7 
// Output : A       2       B       4       C       6       D

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

                    System.out.print(iCnt+"\t");
                }
                else
                {
                    System.out.print(ch+"\t");
                    ch++;
                }
        }
    }
}

class program159
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