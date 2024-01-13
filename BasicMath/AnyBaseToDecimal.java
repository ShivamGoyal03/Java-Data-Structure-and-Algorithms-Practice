package BasicMath;
import java.util.*;
public class AnyBaseToDecimal {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number to convert ");
        int n = sc.nextInt();
        System.out.println("Enter the base of the number ");
        int b = sc.nextInt();
        int ans = 0, pow = 1;
        while (n != 0) {
            int rem = n % 10;
            n = n / 10;
            ans = ans + rem * pow;
            pow = pow * b;
        }
        System.out.println(ans);
    }
}
