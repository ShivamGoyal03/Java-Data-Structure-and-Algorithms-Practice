// Given two numbers A and B. The task is to find out their LCM and GCD.

package BasicMath;
import java.util.*;
public class LCM_GCD {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        long[] lcmAndGcd = new long[2];
        int hcf = gcd(a, b);
        lcmAndGcd[0] = (a*b) / hcf;
        lcmAndGcd[1] = hcf;
        // System.out.println(lcmAndGcd);
    }

    static int gcd(int a, int b){
        if (b == 0) {
            return a;
        }
        else{
            return gcd(b, a % b);
        }
    }
}
