import java.util.HashMap;

class program381
{
    public static void main(String arg[])
    {
        int Arr[] = {101,102,103,101,104,102,101,105,105};

        HashMap<Integer,Integer> frequency = new HashMap<>();

        for(int id : Arr)
        {
            // if present then fetch the value and then put in
            // the values again
            if(frequency.containsKey(id))
            {
                frequency.put(id , frequency.get(id) + 1);
            }
            else
            {
                // put the first time in the hashmap
                frequency.put(id , 1);
            }
        }

        System.out.println(frequency);
    }
}