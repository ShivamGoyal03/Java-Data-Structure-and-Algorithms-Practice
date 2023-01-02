// Factorial of N numbers

package BasicRecursion;
import java.util.*;
public class Factorial {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int ans = fact(n);
        System.out.println(ans);
    }

    static int fact(int n){
        if (n == 1) {
            return n;
        }
        return n * fact(n-1);
    }
}
