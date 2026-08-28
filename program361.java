import java.util.*;

// Hash map
// stored Key value pairs 
// no duplicate keys 
// fast accessing using hashing

class program361
{

    public static void main(String Arg[])
    {
        HashMap<Integer, String> map = new HashMap<>();

        map.put(1,"Omprasad");
        map.put(2,"Soham");
        map.put(3,"Harsh");

        for(Map.Entry<Integer , String> entry : map.entrySet())
        {
            System.out.println( entry.getKey() + "->" + entry.getValue());
        }

    }
}