import java.io.*;
import java.util.LinkedHashMap;
import java.util.TreeMap;

class program396
{
    public static void main(String A[])
    {
        if(A.length != 1)
        {
            System.out.println("Invalid number of arguments");
        }

        String str = A[0];


        // Ordering in issuse 
        // Issue becuse can not match the order
        LinkedHashMap<Character,Integer > frequnecy = new LinkedHashMap<Character , Integer>();

        for(char ch : str.toCharArray())
        {
            frequnecy.put(ch, frequnecy.getOrDefault(ch, 0) + 1);
        }

        System.out.println(frequnecy);

    }
}