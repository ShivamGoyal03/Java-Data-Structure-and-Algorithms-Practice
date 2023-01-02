// Given and integer N.Calculate the sum of series 1^3 + 2^3 + 3^3 + 4^3 + … till N-th term.
package BasicRecursion;
import java.util.*;;
public class SumOfNCube {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int sum =sumofSeries(N);
        System.out.println(sum);
    }

    static int sumofSeries(long N){
        if (N <= 0 || N >= 50000) {
            return 0;
        }
        int pows = (int) Math.pow(N, 3);
        return pows + sumofSeries(N-1);
    }
}
