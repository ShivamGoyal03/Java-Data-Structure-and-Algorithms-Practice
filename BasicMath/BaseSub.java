package BasicMath;
import java.util.*;
public class BaseSub {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the first number ");
        int n1 = sc.nextInt();
        System.out.println("Enter the second number ");
        int n2 = sc.nextInt();
        System.out.println("Enter the base of the number ");
        int b = sc.nextInt();
        if (n2 < n1) {
            int temp = n1;
            n1 = n2;
            n2 = temp;
        }
        int ans = 0, pow = 1, borrow = 0;
        while (n1 != 0 || n2 != 0) {
            int rem1 = n1 % 10;
            int rem2 = n2 % 10;
            n1 = n1 / 10;
            n2 = n2 / 10;
            int rem = rem2 - rem1 - borrow;
            if (rem < 0) {
                rem = rem + b;
                borrow = 1;
            } else {
                borrow = 0;
            }
            ans = ans + rem * pow;
            pow = pow * 10;
        }
        System.out.println(ans);
    }
}
