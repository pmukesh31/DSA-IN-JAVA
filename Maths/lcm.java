public class lcm {
    public static void main(String [] args)
    {
        int res=max(a,b);
        while(true)
        {
            if(res%a==0 && res%b==0)
            return res;
            res++;
        }
        return res;
    }
    
}
//EFFICIENT METHOD
//a*b=gcd(a,b)*lcm(a,b)
// int hcd(int a,int b)
// {
//     if(b==0)
//     return a;
//     return gcd(b,a%b);
// }
// int lcm(int a,int b)
// {
//     return (a*b)/gcd((a,b));
// }
if(n==2|| n=3)
{
    System.out.pritnln("is primr;")
}
for