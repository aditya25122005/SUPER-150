import java.util.*;
public class divisibility{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        for(int i=1;i<=t;i++){
            int a =sc.nextInt();
            int b=sc.nextInt();

            int count=0;
            if(a%b==0){
                System.out.println(0);
            }
            else{
                int rem=a%b;
                int res=b-rem;
                System.out.println(res);
            }

           
            
            

            }


        }

        
    }
