// Quick sort Algoritham in java in java
// Time complexity : Best Case : O(nlong^n)
//                   Worst case : O(n^2)
// Space complexity : O(1)
// Inplace sorting 

class program338
{
    static void Merge(int Arr[],int l ,int m ,int r)
    {
        int n1 = m - l + 1;
        int n2 = r- m;
        

        int Arr1[] = new int[n1];
        int Arr2[] = new int[n2];

        for(int i = 0 ; i < n1 ; i++)
        {
            Arr1[i] = Arr[ l + i];
        }

        for(int i = 0 ; i < n2 ; i++)
        {
            Arr2[i] = Arr[m + 1 + i];
        }

        int i = 0 , j = 0;
        int k = l;

        while(i < n1 && j < n2)
        {
            if(Arr1[i] <= Arr2[j])
            {
                Arr[k] = Arr1[i];
                k++;
                i++;

            }
            else
            {
                Arr[k] = Arr2[j];
                j++;
                k++;

            }
        }


        while(i < n1)
        {
            Arr[k] = Arr1[i];
            k++;
            i++;
        }

        while(j < n2)
        {
            Arr[k] = Arr2[j];
            k++;
            j++;

        }
    }
    
    static void MergeSort(int Arr[],int left , int right)
    {
        if(left < right)
        {
            int mid = (left + right )/2;

            MergeSort(Arr,left,mid);
            MergeSort(Arr,mid + 1,right);

            Merge(Arr,left,mid,right);

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

        MergeSort(Arr, 0, Arr.length - 1);
        PrintArray(Arr);
    }

}
