import java.util.*;

class program387
{
    public static void main(String arg[])
    {
        int Arr[] = {101,102,103,101,104,102,101,105,105};

        Hashtable<Integer , Integer > frequency  = new Hashtable<>();

        for(int no : Arr)
        {
            if(frequency.containsKey(no))
            {
                frequency.put(no, frequency.get(no) + 1);
            }
            else
            {
                frequency.put(no, 1);
            }
        }

        // In hastable the problem is that it can not manitain the order

        // synchronosed automatically sort in the reverse order
        System.out.println(frequency);
    }
}