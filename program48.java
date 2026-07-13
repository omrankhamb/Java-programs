import java.util.*;

class program48
{
    public static void main(String[] args) 
    {
        Scanner sobj = new Scanner(System.in);
        
        int iRow = 0;
        int iCol = 0;

        System.out.println("Enter Number of rows : ");
        iRow = sobj.nextInt();

        int Arr[][] = new int[iRow][];

        Arr[0] = new int[4];
        Arr[1] = new int[5];
        Arr[2] = new int[6];

        Arr = null;
        System.gc();
        System.out.println("End of main : ");

    }   
}