import java.io.*;
import java.util.LinkedHashMap;
import java.util.TreeMap;

class program397
{
    public static void main(String A[])
    {
        if(A.length != 1)
        {
            System.out.println("Invalid number of arguments");
        }

        String str = A[0];


       // Linked map maintain the order of  inserting the element
        LinkedHashMap<Character,Integer > frequnecy = new LinkedHashMap<Character , Integer>();

        for(char ch : str.toCharArray())
        {
            frequnecy.put(ch, frequnecy.getOrDefault(ch, 0) + 1);
        }


        System.out.println(frequnecy);

        char find = '\0';

        for(char ch : frequnecy.keySet())    
        {
            if(frequnecy.get(ch) == 1)
            {
                System.out.println("First non-repeting character is : " + ch);
                break;
            }
        }

    }
}