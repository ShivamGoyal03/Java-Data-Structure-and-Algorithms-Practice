package BasicMath;
import java.util.*;
public class DecimalToAnyBase {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number to convert ");
        int n = sc.nextInt();
        System.out.println("Enter the base to convert ");
        int b = sc.nextInt();
        int ans = 0, pow = 1;
        while (n != 0) {
            int rem = n % b;
            n = n / b;
            ans = ans + rem * pow;
            pow = pow * 10;
        }
        System.out.println(ans);
    }
}
