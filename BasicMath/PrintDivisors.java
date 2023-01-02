// Sum of all divisors from 1 to n

package BasicMath;
import java.util.*;
public class PrintDivisors {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        long k = sumOfDivisors(n);
        System.out.println(k);
    }

    static long sumOfDivisors(int n){
        long result = 0l;
        for (int i = 1; i <= n; i++) {
            int a = n/i;
            result += i*a;
        }
        return result;
    }
}
