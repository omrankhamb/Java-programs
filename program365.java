import java.util.*;
import java.util.concurrent.ConcurrentHashMap;

// Consurrent hashmap
// Better Perfromance than Hashable

class program365
{

    public static void main(String Arg[])
    {
       
        ConcurrentHashMap<Integer , String> map = new ConcurrentHashMap<>();
        map.put(1,"Marvellous");
        map.put(2,"Infosystems");

        System.out.println(map);
    }
}