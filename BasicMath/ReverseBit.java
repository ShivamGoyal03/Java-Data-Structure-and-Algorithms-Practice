// Given a 32 bit number X, reverse its binary form and print the answer in decimal.
package BasicMath;
import java.util.*;
public class ReverseBit {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        reverseBits(N);
    }

    static void reverseBits(int n){
        int rev = 0;
        while (n > 0){
            rev <<=1;
            if ((n & 1) == 1) {
                rev ^= 1;
            }
            n >>= 1;
        }
        System.out.println(rev);
    }
}
