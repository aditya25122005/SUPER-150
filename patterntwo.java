
import java.util.Scanner;

public class patterntwo {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int N=sc.nextInt();
        int space=N-1;
        int star=1;
        int row=1;
        while(row<=2*N-1){
            //space
            int i=1;
            while(i<=space){
                System.err.print("  ");
                i++;
            }
            //star
            int j=1;
            while(j<=star){
                System.out.print("* ");
                j++;
            }
            if(row<N){
                star++;
                space--;
            }
            else{
                star--;
                space++;
            }
            row++;
            System.out.println();

        }
    }
    
}
