// Pattern 5

package Pattern;
import java.util.*;
public class InversePyramid {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter size of pyramid: ");
        int size = sc.nextInt();
        for (int i = 1; i <= size; i++) {
            for (int j = 1; j <= (size-i+1) ; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }    
}
