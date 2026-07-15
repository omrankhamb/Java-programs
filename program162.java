import java.util.*;

// Input  : 11 
// Output : #       #       #       *       *       *       #       #       #       *       *
class Pattern 
{
    public void Display(int iNo) 
    {
        int iCnt = 0;
        int iCount = 0;
        char ch = 'A';
        char ch2 = 'a';

        for (iCnt = 1; iCnt <= iNo;) 
        {
                for(int j = 1 ; j<=3 ; j++)
                {
                    
                    System.out.print("#\t");
                    
                    if(iCnt == iNo)
                    {
                        break;
                    }
                    iCnt++;
                }

                for(int j= 1 ; j <= 3 ; j++)
                {
                    System.out.print("*\t");
                    
                    if(iCnt == iNo)
                    {
                        break;
                    }
                    iCnt++;
                }

                if(iCnt >= iNo)
                {
                    break;
                }
        }
    }
}

class program162
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