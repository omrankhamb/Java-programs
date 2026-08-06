// Bubble sort in java
// Time complexity : Best Case : O(n^2)
//                   Worst case : O(n^2)
// Space complexity : O(1)
// Inplace sorting 
// We can reduce the time complxity if no swap occurs during ten entore then arrya is sorted then no need of completing remainig iteration
class program334
{

    static void BubbleSort(int Arr[]) 
    {
       int n = Arr.length;
       boolean bFlag = false;

       for(int i = 0 ; i < n ; i++)
       {
        // No use of j < n - i - 1
        bFlag = false;
            for(int j = 1  ; j < n - i; j++)
            {
                
                if(Arr[j - 1] > Arr[j])
                {
                    bFlag = true;
                    int temp = Arr[j- 1];
                    Arr[j - 1] = Arr[j];
                    Arr[j] = temp;

                }
            }
            if(!bFlag)
            {
                break;
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
