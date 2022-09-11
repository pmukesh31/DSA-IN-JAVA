// import java.util.*;
// public class ReverseQueue {
//     public static void main(String args[]){
//         Queue <Integer> q=new ArrayDeque<Integer>();
//         q.offer(10);
//         q.offer(5);
//         q.offer(15);
//         q.offer(20);
//         System.out.println(q);
//         reverse(q);
//         System.out.println(q);
//     }
//     // public static void reverse(Queue<Integer> q)//Using recursion
//     // {
//     //     if(q.isEmpty())
//     //     return;
//     //     int x=q.peek();
//     //     q.poll();
//     //     reverse(q);
//     //     q.offer(x);
//     // }
//     public static void reverse(Queue <Integer> q)
//     {
//         Stack<Integer> s=new Stack<>();
//         while(!q.isEmpty())
//         {
//             s.push(q.poll());
//         }
//         while(!s.isEmpty())
//         {
//             q.offer(s.pop());
//         }
//     }

    

// }

