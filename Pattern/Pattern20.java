package Pattern;
import java.util.*;

public class Pattern20 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of the pyramid: ");
        int n = sc.nextInt();
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print("* ");
            }
            for (int j = (2 * n - 2 * i + 1); j >= 2; j--) {
                System.out.print("  ");
            }
            for (int j = i; j >= 1; j--) {
                System.out.print("* ");
            }
            System.out.println();
        }
        for (int i = 1; i <= (n-1); i++) {
            for (int j = 1; j <= (n - i); j++) {
                System.out.print("* ");
            }
            for (int j = 1; j <= (2 * i); j++) {
                System.out.print("  ");
            }
            for (int j = (n - i); j >= 1; j--) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
