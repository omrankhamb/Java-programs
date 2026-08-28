import java.util.*;

// Hashset
// No duplicate are allowed 
// no ordering guarranted

class program359
{

    public static void main(String Arg[])
    {
        HashSet<String> set = new HashSet<>();

        set.add("Marvellous");
        set.add("Infosystems");
        set.add("Marvellous");  // Duplicate is ignored

        System.out.println(set);

    }
}