import java.util.*;

class program331 {
    static void Print(int Arr[])
    {
        for(int i = 0 ; i < Arr.length ; i++)
        {
            System.out.println(Arr[i]);
        }
    }
    public static void main(String Arg[])
    {
        Scanner sobj = new Scanner(System.in);

        System.out.println("Hello world");
        int iSize = 0;

        System.out.println("Enter the Size of Array : ");
        iSize = sobj.nextInt();

        int Arr[] = new int[iSize];
        
        System.out.println("Enter The array : ");
        for(int i = 0 ; i < Arr.length ; i++)
        {
            Arr[i] = sobj.nextInt();
        }

        Print(Arr);
    }
    
}
