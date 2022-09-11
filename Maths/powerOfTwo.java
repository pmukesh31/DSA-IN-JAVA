import java.util.Scanner;
public class powerOfTwo{
    public static boolean main(String [] args){

        Scanner pp=new Scanner(System.in);
        System.out.print("Enter number n ");
        int n=pp.nextInt();
        pp.close();
        if(n==0)
        return false;
        while(n!=1){
            if(n%2!=0)
            return false;
            n=n/2;

        }
        return true;
        // int ans=Math.log(n)/Math.log(2);
        // System.out.println(ans);
    }
}
//EFFICIENT METHOD
IF(N==0)
return false ;
return (n&(n-1)==0);//true or false