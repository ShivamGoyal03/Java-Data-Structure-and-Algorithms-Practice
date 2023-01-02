// Given a number N. Count the number of digits in N which evenly divides N.
// Note :- Evenly divides means whether N is divisible by a digit i.e. leaves a remainder 0 when divided.

package BasicMath;
import java.util.*;
public class CountDigitsEvenly {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int cnt = N;
        int count= 0;
        int rem;
        while (cnt != 0) {
            rem = cnt % 10;
            if ((rem != 0) && (N % rem) == 0) {
                count++;
            }
            cnt /= 10;
        }
        System.out.println(count);
    }
}
