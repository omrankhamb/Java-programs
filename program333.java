// Bubble sort in java
// Time complexity : Best Case : O(n^2)
//                   Worst case : O(n^2)
// Space complexity : O(1)
// Inplace sorting 
class program333
{

    static void BubbleSort(int Arr[]) 
    {
       int n = Arr.length;

       for(int i = 0 ; i < n ; i++)
       {
        // No use of j < n - i - 1
            for(int j = 1  ; j < n - i; j++)
            {
                if(Arr[j - 1] > Arr[j])
                {
                    int temp = Arr[j- 1];
                    Arr[j - 1] = Arr[j];
                    Arr[j] = temp;
                }
            }
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

        BubbleSort(Arr);
        PrintArray(Arr);
    }

}
