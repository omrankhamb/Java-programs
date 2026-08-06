// Quick sort Algoritham in java in java
// Time complexity : Best Case : O(nlong^n)
//                   Worst case : O(n^2)
// Space complexity : O(1)
// Inplace sorting 

class program337
{
    static int Partition(int Arr[],int Low,int High)
    {
        int left = 0,right = 0,Pivot = Arr[Low];
        left = Low;
        right = High;

        while(left < right)
        {
            while(left <= High  && Arr[left] <= Pivot  ) 
            {
                left++;
            }

            while(Arr[right] > Pivot)
            {
                right--;
            }

            if(left < right)
            {
                int temp = Arr[left];
                Arr[left] = Arr[right];
                Arr[right] = temp;
            }
        }

        Arr[Low] = Arr[right];
        Arr[right] = Pivot;
        

        return right;
        //5,3,2,6,4,1
        //5,3,2,1,4,6

    }

    static void QuickSort(int Arr[],int Low,int High)
    {
        int Pivot = 0;
        if(Low < High)
        {   
            Pivot = Partition(Arr,Low,High);
            QuickSort(Arr,Low,Pivot-1);
            QuickSort(Arr,Pivot + 1,High);
        }
    }

    static void PrintArray(int Arr[])
    {
        int n = Arr.length;

        for(int i = 0 ; i < n ; i++)
        {
            System.out.print(Arr[i] + " ");
        }
        System.out.println();   
    }

    public static void main(String Arg[]) 
    {
        int Arr[] = {5,3,2,6,4,3,4,9,1};

        QuickSort(Arr, 0, Arr.length - 1);
        PrintArray(Arr);
    }

}
