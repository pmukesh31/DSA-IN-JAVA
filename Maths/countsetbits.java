import java.util.*;
public class countsetbits {
    public static void main(String [] args){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter number n ");
        int n=sc.nextInt();
        int res=0;
        while(n>0)
        {
            if(n%2!=0)//if(n&1==0)
            res++;
            n=n/2;//n=n>>1
        }
        System.out.println(res);
    }
    
}
