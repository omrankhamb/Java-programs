// selection sort in java
// Time complexity : Best Case : O(n^2)
//                   Worst case : O(n^2)
// Space complexity : O(1)
// Inplace sorting 

class program335
{

    static void InsertionSort(int Arr[]) 
    {
       int n = Arr.length;
       int minidx = 0;

       for(int i = 0 ; i < n ; i++)
       {
            minidx = i;
            for(int j = i + 1 ; j < n ; j++)
            {
                if(Arr[minidx] > Arr[j])
                {
                    minidx = j;
                }
            }   

            int temp = Arr[minidx];
            Arr[minidx] = Arr[i];
            Arr[i] = temp;
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
