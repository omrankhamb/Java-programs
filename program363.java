import java.util.*;

// Priority Queue
// use Min heap by default
// Schseduling tasks

class program362
{

    public static void main(String Arg[])
    {
       PriorityQueue<String>  pq = new PriorityQueue<>();

       pq.add("Marvellous");
       pq.add("PPA");
       pq.add("Ayq");
       pq.add("Omprasad");
       pq.add("Python");

       System.out.println("Peek : " + pq.peek());
       System.out.println("Poll : " + pq.poll());
       System.out.println("After Poll : " + pq);

    }
}
