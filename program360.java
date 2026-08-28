import java.util.*;

// Sorted Set
// Used red black tree
// No duplicates

class program360
{

    public static void main(String Arg[])
    {
        TreeSet<String> set = new TreeSet<>();

        set.add("Marvellous");
        set.add("PPA");
        set.add("LB");

        System.out.println("Sorted set : " + set);
        System.out.println("First : " + set.first());
    }
}