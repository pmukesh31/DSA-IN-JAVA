import java.util.*;

public class MaximumofKSubArray {
    public static void main(String []args)
    {
        Deque<Integer> dq=new LinkedList<Integer>();
        int a[]={11,22,55,66,99,88,11,32,55,66,88,115};
        int k=4;
        int n=a.length;
        for(int i=0;i<k;i++)
        {
            while(!dq.isEmpty() && a[i]>=a[dq.peekLast()]){
            dq.pollLast();}
            dq.addLast(i);
        }
        for(int i=k;i<n;i++)
        {
            System.out.print(a[dq.peekFirst()]+" ");
            while(!dq.isEmpty() && dq.peek()<=i-k){
            dq.removeFirst();}
            while(!dq.isEmpty() && a[i]>=a[dq.peekLast()]){
            dq.pollLast();}
            dq.addLast(i);
        }
        System.out.print(a[dq.peekFirst()] + " ");
    }
    
}
