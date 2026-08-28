class program367
{


    public static int Partition(int Arr[],int left ,int right)
    {
        int low = left;
        int high = right;
        int pivot = Arr[left];

        while(low < high)
        {
            while(Arr[low] <= pivot && low < right)
            {
                low++;
            }

            while(Arr[high] > pivot )
            {
                high--;
            }

            if(low < high)
            {
                int temp = Arr[low];
                Arr[low] = Arr[high];
                Arr[high] = temp;
            }
        }
        int x = Arr[high];
        Arr[left] = x;
        Arr[high] = pivot;
        return high;

    }


    public static void Merge(int Arr[],int left,int right)
    {
        if(left < right)
        {
            int pivot = Partition(Arr,left,right);

            Merge(Arr,left,pivot-1);
            Merge(Arr,pivot + 1,right);
        }
    }
   public static void main(String Arg[])
   {
        int Arr[] = {5,4,3,2,1};


        Merge(Arr,0,Arr.length-1);

        for(int i = 0 ; i < Arr.length ; i++)
        {
            System.out.println(Arr[i]);
        }

        
   }
}