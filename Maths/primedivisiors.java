import java.util.Scanner;
public class primedivisiors {
    public static void main(String [] args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter number");
        int num=sc.nextInt();
        if(num<=1){
        
        System.out.println("NULL");}
        while(num%2==0)
        {
            System.out.println("2");
            num/=2;
        }
        while(num%3==0)
        {
            System.out.println("3");
            num/=3;
        }
        for(int i=5;i*i<num;i+=6)
        {
            while(num%i==0)
            {
                System.out.println(i);
                num=num/i;
            }
            while(num%(i+2)==0)
            {
                System.out.println(i+2);
                num=num/(i+2);
            }


        }
        if(num>3)
        System.out.println(num);
    }
    



    // public static boolean isPrime(int a)
    // {
        
    //     if(a==1 )
    //     return false;
    //     if(a==2 || a==3)
    //     return true;
    //     if(a%2==0 || a%3==0)
    //         return false;
        
    //     int c=0;
    //     for(int i=5;i*i<=Math.sqrt(a);i+=6)
    //     {
    //         if(a%i==0 || a%(i+2)==0)
    //         return false;
            
            
    //     }
    //     return true;
        
   
    // }
}