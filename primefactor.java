import java.util.*;
public class primefactor {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int sum=0;
        for(int i=2;i<Math.sqrt(n);i++){
            while(n%i==0){
                sum+=i;
                n=n/i;
            }
        }
        if(n>2){
            sum+=n;
        }
        System.out.print(sum);
        
    }
    
}
