import java.io.*;
import java.util.TreeMap;

class program394
{
    public static void main(String A[])
    {
        if(A.length != 1)
        {
            System.out.println("Invalid number of arguments");
        }

        String str = A[0];

        TreeMap<Character,Integer > frequnecy = new TreeMap<Character , Integer>();

        for(char ch : str.toCharArray())
        {
            frequnecy.put(ch, frequnecy.getOrDefault(ch, 0) + 1);
        }

        System.out.println(frequnecy);

    }
}