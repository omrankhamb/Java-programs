import java.util.*;

class program384
{
    public static void main(String arg[])
    {
        int Arr[] = {101,102,103,101,104,102,101,105,105};

        HashMap<Integer,Integer> frequency = new HashMap<>();

        for(int id : Arr)
        {
            // if key present then return the value or either set to zero 0 
            frequency.put(id,frequency.getOrDefault(id, 0) + 1);
            // either get the value of put the default the zero
        }

        for(int id : frequency.keySet())
        {
            System.out.println(id + " -> " + frequency.get(id));
        }

        System.out.println(frequency.keySet());
    }
}