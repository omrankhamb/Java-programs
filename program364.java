import java.util.*;

// ArrayDequeue
// Faster than Stack
// No null elmets are allowed

class program362
{

    public static void main(String Arg[])
    {
       ArrayDeque<String> dq = new ArrayDeque<>();

       dq.push("Marvellous");
       dq.push("Infosystems");
       dq.push("Omprasad");

       System.out.println("Stack Style is : " + dq);
       dq.pop();


       System.out.println("After Pop  : " + dq);

    }
}