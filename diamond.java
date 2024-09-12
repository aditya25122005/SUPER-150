public class diamond{
    public static void main(String[] args) {
        int n=5;
        for(int i=1;i<2*n;i++){

            int c= i>n ? 2*n -i:i;
            int sp=n-c;
            for(int s=1;s<=sp;s++){
                System.out.print(" ");
            }
            for(int j=1;j<=c;j++){
                System.out.print("* ");
            }
            System.out.println();

        }
    }
}