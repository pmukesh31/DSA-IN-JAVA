import java.util.Scanner;
public class prime{
    public static boolean main(String [] args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.print("");
        int n=sc.nextInt();
        if(n==1 )
        return false;
        if(n==2 || n==3)
        return true;
        if(n%2==0 || n%3==0)
            return false;
        
        int c=0;
        for(int i=5;i*i<=Math.sqrt(n);i+=6)
        {
            if(n%i==0 || n%(i+2)==0)
            return false;
            
            
        }
        return true;
        
   
    }
}