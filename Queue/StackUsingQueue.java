// import java.util.*;
// class Stack
// {
//     Queue<Integer> q1=new ArrayDeque<Integer>();
//     Queue<Integer> q2=new ArrayDeque<Integer>();
//     int peek()
//     {
//         return q1.peek();
//     }
//     int size()
//     {
//         return q1.size();
//     }
//     int pop()
//     {
//         return q1.poll();
//     }
//     void push(int x)
//     {
//         while(!q1.isEmpty())
//         {
//             q2.offer(q1.poll());
//         }
//         q1.offer(x);
//         while(!q2.isEmpty())
//         {
//             q1.offer(q2.poll());
//         }
//     }
// }
// public class StackUsingQueue {
//     public static void main(String args[])
//     {
//         Stack s=new Stack();
//         s.push(20);
//         System.out.println(s.pop());
//         s.push(30);
//         s.push(40);
//         s.pop();
//         System.out.println(s.peek());


//     }
// }
