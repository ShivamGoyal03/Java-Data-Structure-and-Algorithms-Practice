// The Fibonacci numbers, commonly denoted F(n) form a sequence, called the Fibonacci sequence, 
// such that each number is the sum of the two preceding ones, starting from 0 and 1. That is,

package BasicRecursion;

import java.util.*;

public class FibonacciNum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int  k = fib(n);
        System.out.println(k);
    }

    static int fib(int n) {
        if (n <= 1) {
            return n;
        }
        return fib(n-1) + fib(n-2);
    }
}
