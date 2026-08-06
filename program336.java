// Insertion sort in java
// Time complexity : Best Case : O(n^2)
//                   Worst case : O(n^2)
// Space complexity : O(1)
// Inplace sorting 

class program336
{

    static void InsertionSort(int Arr[]) 
    {
       int i = 0 , j = 0,Key = 0 ;
       int n = Arr.length;

       for(i = 1 ; i <= n - 1 ; i++)
       {
           Key = Arr[i];
            j = i;
            while(j >= 1 && Arr[j - 1] > Key )
            {
                Arr[j] = Arr[j-1];
                j--;
            }
            
            Arr[j] = Key;
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
        int Arr[] = {6,3,2,5,4,1};

        InsertionSort(Arr);
        PrintArray(Arr);
    }

}
