package BasicMath;
import java.util.*;
public class BaseMul {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the first number ");
        int n1 = sc.nextInt();
        System.out.println("Enter the second number ");
        int n2 = sc.nextInt();
        System.out.println("Enter the base of the number ");
        int b = sc.nextInt();
        int ans = 0, pow = 1;
        while (n2 != 0) {
            int rem2 = n2 % 10;
            n2 = n2 / 10;
            int singleProduct = getProduct(n1, rem2, b);
            ans = BaseAddition(ans, singleProduct * pow, b);
            pow = pow * 10;
        }
        System.out.println(ans);
    }
    public static int getProduct(int n1, int n2, int b) {
        int ans = 0, pow = 1, carry = 0;
        while (n1 != 0 || carry != 0) {
            int rem1 = n1 % 10;
            n1 = n1 / 10;
            int rem = rem1 * n2 + carry; // single digit product
            carry = rem / b;
            rem = rem % b;
            ans = ans + rem * pow;
            pow = pow * 10;
        }
        return ans;
    }

    public static int BaseAddition(int n1, int n2, int b) {
        int ans = 0, pow = 1, carry = 0;
        while (n1 != 0 || n2 != 0 || carry != 0) {
            int rem1 = n1 % 10;
            int rem2 = n2 % 10;
            n1 = n1 / 10;
            n2 = n2 / 10;
            int rem = rem1 + rem2 + carry; // single digit addition
            carry = rem / b;
            rem = rem % b;
            ans = ans + rem * pow;
            pow = pow * 10;
        }
        return ans;
    }
}
