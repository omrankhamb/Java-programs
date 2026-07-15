import java.util.*;
class ArrayX
{
    public int []Arr;

    public ArrayX(int iSize)
    {
        Arr = new int[iSize];

    }

    public void Accepet()
    {
        Scanner sobj = new Scanner(System.in);
        int iCnt = 0;

        System.out.println("Enter The array : ");
        for(iCnt = 0 ; iCnt < Arr.length ; iCnt++)
        {
            Arr[iCnt] = sobj.nextInt();
        }
    }

    public void Display()
    {
        int iCnt = 0;

        for(iCnt = 0 ; iCnt < Arr.length ; iCnt++)
        {
            System.out.println(Arr[iCnt]);
        }
    }

    protected void finalize() 
    {
        System.out.println("Inisde destructor");
        Arr = null;

    }
}



class program150
{
    public static void main(String A[])
    {

        Scanner sobj = new Scanner(System.in);
        int iSize = 0;

        System.out.println("enter the size : ");
        iSize = sobj.nextInt();

        ArrayX aobj = new ArrayX(iSize);

        aobj.Accepet();
        aobj.Display();

        aobj = null;
        sobj =null;

        System.gc();

        System.out.println();
    }
}