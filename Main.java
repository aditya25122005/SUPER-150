import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int line = 1;
        int space = (2 *n-3);
        int k = 1;

        while (line < n) {
            int i = 1;
            while (i <= line) {
                System.out.print(i + "\t");
                i++;
            }

            int j = 1;
            while (j <= space) {
                System.out.print(" \t");
                j++;
            }
            space = space - 2;

            j = 1;
            while (j <= line) {
                System.out.print(k + "\t");
                j++;
                k--;
            }
            k += line + 1;
            System.out.println();
            line++;
        }

        int i = 1;
        while (i <= n) {
            System.out.print(i + "\t");
            i++;
        }
        int j = (n - 1);
        while (j >= 1) {
            System.out.print(j + "\t");
            j--;
        }
   }
}