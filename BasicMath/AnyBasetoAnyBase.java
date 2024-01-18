package BasicMath;
import java.util.*;
public class AnyBasetoAnyBase {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number to convert ");
        int n = sc.nextInt();
        System.out.println("Enter the base of the number ");
        int b1 = sc.nextInt();
        System.out.println("Enter the base to convert ");
        int b2 = sc.nextInt();
        int ans = 0, pow = 1;
        while (n != 0) {
            int rem = n % 10;
            n = n / 10;
            ans = ans + rem * pow;
            pow = pow * b1;
        }
        int ans2 = 0, pow2 = 1;
        while (ans != 0) {
            int rem = ans % b2;
            ans = ans / b2;
            ans2 = ans2 + rem * pow2;
            pow2 = pow2 * 10;
        }
        System.out.println(ans2);
    }
}
