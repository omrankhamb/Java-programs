import java.util.*;

class program46
{
    public static void main(String[] args) 
    {
        Scanner sobj = new Scanner(System.in);
        
        int iSize = 0 ;
        System.out.println("Enter the size of array  : ");
        iSize = sobj.nextInt();
        int Arr[] = new int[iSize];

        Arr[0] = 12;
        System.out.println(Arr.length);

        Arr = null;
        System.gc();
    }   
}