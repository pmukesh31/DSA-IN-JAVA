import java.util.Scanner;
public class EuclicleanAlgo
//USED FOR GCD OF TWO NUMBERS
//IF G IS GCD OF A,B THEN G IS ALSO GCD OF A-B,B
{
    public static void  main(String []args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.print("enter first number ");
        int a=sc.nextInt();
        System.out.print("enter second number ");
        int b=sc.nextInt();
        sc.close();
        while(a!=b)
        {
            if(a>b)
             a=a-b;
            else 
             b=b-a; 
               
        }
        System.out.println(a);

    }}
    //OPTIMIZED CODE
    //int gcd(nt a,int b)
    // {
    //     if b==0
    //     return a;
    //     else
    //     return gcd(b,a%b)
    // }