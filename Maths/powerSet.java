import java.util.Scanner;
public class Main{
    public static void main(String [] args){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter a string");
        String s=sc.nextLine();
        int n=s.length();
        for(int i=0;i<Math.pow(2,n);i++){
            for(int j=0;j<n;j++){
                if((i&(1<<j))!=0){
                char sp=s.charAt(j);
                System.out.print(sp);
            }
            System.out.println();
        }
    }
}}