package BasicMath;
import java.util.*;
public class PrimeFactorization {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        primeFactorization(n);
    }

    static void primeFactorization(int n){
        for(int div = 2; div <= Math.sqrt(n); div++){
            while(n % div == 0){
                n = n / div; // because we have to find the next prime factor
                System.out.print(div + " ");
            }
        }

        if (n != 1) {
            System.out.print(n);
        }
    }
}
