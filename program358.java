import java.util.*;

// Linkedlist in java
// Implements list Queue + Dequeue
class program358
{

    public static void main(String Arg[])
    {
        LinkedList<String> list = new LinkedList<>();

        list.add("Marvellous");
        list.addFirst("Ganesh");
        list.addLast("saraswati");

        System.out.println(list);
        list.removeFirst();
        System.out.println(list);
    }
}