import java.util.Scanner;
public class oddOccur{
    public static void main(String [] args){
        Scanner sc=new Scanner(System.in);
        System.out.print(System.in);
        int n=sc.nextInt();
        sc.close();
        //we use xor operator 
        int a[]={1,1,1,1,2,2,3};//all no.s occur even times except one no.
        int res=0;
        for(int i=0;i<n;i++)
        res=res^a[i];
        System.out.println(res);

    }
}