import java.util.*;

public class brianKernongamsAlgo {
    public static void main(Syring [] args){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter number n ");
        int n=sc.nextInt();
        int res=0;
        while(n>0){
            n=(n&(n-1));
            res++;
        }
        System.out.println(res);
    }
    
}
