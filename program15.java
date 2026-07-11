class program15
{
    public static void main(String[] args)
    {
        // Array declaration
        int arr[] = new int[4];

        // initilaisation value by value
        arr[0] = 11;
        arr[1] = 21;
        arr[2] = 51;
        arr[3] = 101;


        // Length Prportey in java
        
        System.out.println("Length of Array is : "+arr.length);
        for(int i = 0 ; i < 4 ; i++)
        {
            System.out.println(arr[i] + "\t");
        }

        
    }
}