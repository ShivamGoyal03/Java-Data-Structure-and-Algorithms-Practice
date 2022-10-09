package Pattern;
import java.util.*;
public class Pattern10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of the pyramid: ");
        int size = sc.nextInt();
        for (int i = 1; i <= size; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
        for (int i = 1; i <= (size-1) ; i++) {
            for (int j = 1; j <= (size-i); j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
