import java.util.*;
public class team{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int count=0;
        for(int i=1;i<=n;i++){
            

            int a=sc.nextInt();
            int b=sc.nextInt();
            int c=sc.nextInt();

            if(a+b+c>=2){
                count++;
            }
            
           
        }
        System.out.println(count);
        
    }
}