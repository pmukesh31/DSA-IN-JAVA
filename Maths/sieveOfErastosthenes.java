//finding prime numbers upto n
import java.util.*;
public class sieveOfErastosthenes {
    
    public static void main(String [] args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.print("");
        int n=sc.nextInt();
        boolean a[]=new boolean[n+1];
        Arrays.fill(a,true);
        for(int i=2;i<=n;i++)
    {
        if(isPrime(i))
        System.out.println(i);
        for(int j=i*i;j<=n;j+=i)
        a[j]=false;
    }}
        
    
    
    
    
    public static boolean isPrime(int a)
    {
        
        if(a==1 )
        return false;
        if(a==2 || a==3)
        return true;
        if(a%2==0 || a%3==0)
            return false;
        
        int c=0;
        for(int i=5;i*i<=Math.sqrt(a);i+=6)
        {
            if(a%i==0 || a%(i+2)==0)
            return false;
            
            
        }
        return true;
        
   
    }
}
