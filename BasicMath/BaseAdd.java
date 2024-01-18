package BasicMath;
import java.util.*;
public class BaseAdd {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the first number ");
        int n1 = sc.nextInt();
        System.out.println("Enter the base of the number ");
        int b = sc.nextInt();
        System.out.println("Enter the second number ");
        int n2 = sc.nextInt();
        int ans = 0, pow = 1, carry = 0;
        while (n1 != 0 || n2 != 0 || carry != 0) {
            int rem1 = n1 % 10;
            int rem2 = n2 % 10;
            n1 = n1 / 10;
            n2 = n2 / 10;
            int rem = rem1 + rem2 + carry;
            carry = rem / b;
            rem = rem % b;
            ans = ans + rem * pow;
            pow = pow * 10;
        }
        System.out.println(ans);
    }
}
