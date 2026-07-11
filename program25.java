//String in java
class program25
{
    public static void PassByRefrence(int Arr[])
    {
        Arr[0] = 12;
    }
    public static void main(String[] args) {
            int Arr[] = new int[1];
            Arr[0] = 11;

            System.out.println("Before function Call : "+Arr[0]);
            PassByRefrence(Arr);
            System.out.println("After Function Call : "+Arr[0]);        
    
    }
}
