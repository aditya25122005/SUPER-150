
import java.util.Scanner;

public class pattern3 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int N=sc.nextInt();
        int star=N;
        int space=N-1;
        int row=1;
        while(row<=2*N-1){
            //space
            int i=1;
            while(i<=space){
                System.out.print("  ");
                i++;
            }
            //star
            int j=1;
            while(j<=star){
                System.out.print("* ");
                j++;
            }
            if(row<N){
                space--;
                star--;

            }
            else{
                space++;
                star++;
            }
            System.out.println();
            row++;
        }
    }
    
}
