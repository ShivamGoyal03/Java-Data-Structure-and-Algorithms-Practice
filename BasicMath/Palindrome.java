// Given an integer, check whether it is a palindrome or not.

package BasicMath;
import java.util.*;
public class Palindrome {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        is_palindrome(N);
    }

    static void is_palindrome(int n){
        int sum = n;
        int i =0;
        while (n > 0) {
            int dig = n % 10;
            i = i*10 + dig;
            n /= 10;
        }
        if (i == sum) {
            System.out.println("palin");
        }
        else
            System.out.println("NOT");
    }
}
