
import java.util.Scanner;

public class pattern5 {
    public static void main(String[] args) {
        Scanner scanner= new Scanner(System.in);
          int N=scanner.nextInt();
          int row=1;
          int star=N/2+1;
          int space=-1;

          while(row<=N){
            //star
            int i=1;
            
            while(i<=star){
                System.out.print("* ");
                i++;
            }
            int j=1;

            while(j<=space){
                System.out.print("  ");
                j++;
            }
            int k;
            if(row==N|| row==1){
                k=2;
            }
            else{
            k=1;
            }
            while(k<=star){
                System.out.print("* ");
                k++;
            }
            if(row<N/2+1){
                star--;
                space+=2;
            }
            else{
                star++;
                space-=2;

            }
            row++;
            System.out.println();
          }

    }
    
}
