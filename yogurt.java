// InputCopy
// 4
// 2 5 9
// 3 5 9
// 3 5 11
// 4 5 11
// OutputCopy
// 9
// 14
// 15
// 20
import java.util.*;
public class yogurt {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        for(int i=1;i<=t;i++){
            int n=sc.nextInt();
            int a=sc.nextInt();
            int b=sc.nextInt();
            if(n==1){
                System.out.println(a);
            }
            else{
            if(n%2==0){
                if(2*a<b){
                    System.out.println(n*a);
                }
                else{
                    System.out.println(n/2 *b);
                }
            }
            else{
                
                int N=n-1;
                if(2*a<b){
                    System.out.println(N*a+a);
                }
                else{
                    System.out.println(N/2 *b+a);
                }


            }
        }
        }

        
    }
    
}
