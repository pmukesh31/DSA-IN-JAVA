import java.util.*;
public class kthbit {
    public static void main(String [] args){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter number n ");
        int n=sc.nextInt();
        System.out.print("Enter Kth value to find where it is set or not ");
        int k=sc.nextInt();
        if(n & (1<<(k-1))!=0)
        System.out.println("Yes");
        else 
        System.out.println("No");
    }
    
}
// right shift
//if((n>>(k-1))&1==1))




