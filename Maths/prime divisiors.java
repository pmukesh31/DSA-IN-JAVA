import java.util.Scanner;
public class primedivisiors {
    public static void main(String [] args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter number");
        int num=sc.nextInt();
        if(num<=1){
        
        System.out.println("NULL");}
        for(int i=2;i*i<num;i++)
        {
            while(num%i==0)
            {
                System.out,println(i);
                num=num/i;
            }
        }
        if(num>1)
        System.out.println(num);
    }
    
}
