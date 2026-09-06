import java.util.*;

class program382
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

        for(Map.Entry<Integer, Integer> eobj : frequency.entrySet())
        {
            System.out.println(eobj.getKey() +"->" + eobj.getValue());
        }

        System.out.println(frequency.entrySet());
    }
}