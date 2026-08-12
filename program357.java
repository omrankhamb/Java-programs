import java.util.*;
// Arralylist in java

class program357
{

    public static void main(String Arg[])
    {
        ArrayList<String> list  = new ArrayList<>();

        list.add("Marvellous");
        list.add("Infosystems");
        list.add("Marvellous");

        System.out.println("List is  : " + list );
        System.out.println("First elment is : " + list.get(0));
        System.out.println("Contain Marvellous ? " + list.contains("Marvellous"));


        list.remove("Infosystems");
        System.out.println("After Removal : "+ list);
    }
}