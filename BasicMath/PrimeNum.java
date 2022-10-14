// Prime till N numbers

package BasicMath;
import java.util.*;
public class PrimeNum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number: ");
        int low = sc.nextInt(); 
        int high = sc.nextInt();
        for (int n = low; n <= high; n++) {
            int count  = 0;
            for (int i = 2; i <= Math.sqrt(n); i++) {
                if (n % i == 0) {
                    count++;
                    break;
                }
            }
            if (count == 0) {
                System.out.println(n);
            }
        }
    }
}
