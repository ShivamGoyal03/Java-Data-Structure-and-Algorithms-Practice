package BasicRecursion.Recursion;
import java.util.*;
public class CountZeros {
    public static void main(String[] args) {
        System.out.println(CountZero(6054));
    }

    static int CountZero(int n){
        return helperCount(n, 0);
    }

    private static int helperCount(int n, int c) {
        if (n == 0) {
            return c;
        }
        int rem = n % 10;
        if (rem == 0) {
            return helperCount(n/10, c+1);
        }
        return helperCount(n/10, c);
    }

}
