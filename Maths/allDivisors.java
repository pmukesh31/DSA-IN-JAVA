import java.util.Scanner;
public class allDivisors {
    public static void main(String []args){
        Scanner sc=new Scanner(System.in);
        System.out.print("enter number");
        int n=sc.nextInt();
        int i=0;
        for( i=1;i*i<n;i++)
        {
            if(n%i==0)
            {
                System.out.println(i);
            }
        }
        for(;i>1;i--)
        {
            if(n%i==0)
            {
                System.out.println(n/i);
            }
        }
    }
    
    
}
