import java.util.*;

// Tree Map
// Sorted map
// keys stored in sorted order

class program362
{

    public static void main(String Arg[])
    {
       TreeMap<Integer,String> map = new TreeMap<>();

       map.put(2,"Marvellous");
       map.put(1,"Omprasad");
       map.put(3,"Rankhamb");
       map.put(4,"Harsh");

       System.out.println("Sorted Map : " + map);   
       System.out.println("First Key : " + map.firstKey())  ;   

    }
}