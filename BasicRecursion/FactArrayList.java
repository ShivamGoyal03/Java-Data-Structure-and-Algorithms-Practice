// Find all factorial numbers less than or equal to N

package BasicRecursion;
import java.util.*;
public class FactArrayList {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        ArrayList<Long> i = factorialNumbers(N);
        System.out.println(i);
    }

    static ArrayList<Long> factorialNumbers(long n){
        ArrayList<Long> arr = new ArrayList<>();
        Long fact = (long) 1;
        Long x = (long) 2;
        if(n == 1){
            return arr;
        }
        else{
            while (fact <= n) {
                arr.add(fact);
                fact = fact * x;
                x++;
            }
            return arr;
        }
    }
}
