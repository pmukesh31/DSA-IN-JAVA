public class recursion{
    public static void main(String [] args){
        func(13);

    }
    public static int func(int n)
    {
        if(n==0)
        return null;
        func(n/2);
        System.out.prinlnt(n%2);
    }
}