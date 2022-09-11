public class twoOccur{
    public static void main(String [] args){
        // Scanner sc=new Scanner(System.in);
        for(int i=0;i<n-1;i++){
            int count=0;
            for(int j=i+1;j<=n;j++){
                if(arr[i]==arr[j])
                count++;

            }
            if(count%2!=0)
            print(arr[i]);
        }
    }
}
//EFFICIENT 
int xor=0,res1=0,res2=0;
for(int i=0;i<n;i++){
xor=xor^arr[i];}
int s=xor^(~(xor-1));//right most set bit
for(int i=0;i<n;i++)
{
    if((s&arr[i]!=0)){
        res1=res1^arr[i];
    else
        res2=res2^arr[i];
    }
}
return res1,res2;