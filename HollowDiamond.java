import java.util.*;
public class HollowDiamond {
    public static void main(String args[]) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int i, j, k = 0;

        for (i = 0; i < n; i++) {
            if (i == 0 || i == n - 1) {
                for (j = 0; j < n; j++) {
                    System.out.print("*\t");
                }
            } else if (i <= n / 2) {
                for (j = 0; j < (n / 2) - i + 1; j++) {
                    System.out.print("*\t");
                }
                for (j = 0; j < 2 * i - 1; j++) {
                    System.out.print("\t");
                }
                for (j = 0; j < (n / 2) - i + 1; j++) {
                    System.out.print("*\t");
                }
                if (i == n / 2) {
                    k = 2;
                }
            } else {
                for (j = 0; j < k; j++) {
                    System.out.print("*\t");
                }
                for (j = 0; j < n - (2 * k); j++) {
                    System.out.print("\t");
                }
                for (j = 0; j < k; j++) {
                    System.out.print("*\t");
                }
                k++;
            }
            System.out.println();
}
}
}