// Printing Fibonacci Series

package BasicMath;
import java.util.*;
public class Fibonacci {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        // int a = 0;
        // int b = 1;
        // for (int i = 0; i < n; i++) {
        //     System.out.println(a);
        //     int c = a + b;
        //     a = b;
        //     b = c;
        // }
        long[] i = printFibb(n);
        for (long l : i) {
            System.out.println(l);
        }
    }

    static long[] printFibb(int n){
        long[] pf = new long[n];
        if (n == 1) {
            pf[0] = 1;
            return pf;
        }
        pf[0] = 1;
        pf[1] = 1;
        for (int i = 2; i < n; i++) {
            pf[i] = pf[i-1] + pf[i-2];
        }
        return pf;
    }
}
