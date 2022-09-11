import java.util.*;
public class Dequee {
    public static void main(String args[])
    {
        Deque <Integer> dq=new LinkedList<Integer>();
        dq.offerFirst(10);
        dq.offerLast(20);
        dq.offerFirst(5);
        dq.offerLast(15);
        System.out.prinlnt(dq.peekFirst());
        System.out.println(dq.peekLast());
        dq.pollFirst();
        dq.pollLast();
        System.out.println(dq);
    }
    
}
