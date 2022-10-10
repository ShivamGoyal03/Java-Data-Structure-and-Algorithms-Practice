package Pattern;
import java.util.*;
public class Pattern18 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of the pyramid: ");
        int n = sc.nextInt();
        char c = (char) ('A' + n - 1);
        for (int i = 1; i <= n; i++) {
            for (int j = i; j >= 1; j--) {
            // for (int j = 1; j <= i; j++) {
                char ch = (char)(c - j + 1);
                System.out.print(ch);
            }
            System.out.println();
        }
    }
}
