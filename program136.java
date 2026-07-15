import java.util.*;
class program136
{
    public static void main(String Arg[])
    {
        Scanner sobj = new Scanner(System.in);

        int iSize = 0;
        // Not work in java int Arr[10];
        System.out.println("Enter the size Of Arry : ");
        iSize = sobj.nextInt();

        int Arr[] = new int[iSize];
        // Arr = (int*)mallo(sizeof(int) * iSize);   C
        // Arr = new int[Isize];                     C++

        System.out.println("the size of Arry : ");
        System.out.println(Arr.length);


    }
}