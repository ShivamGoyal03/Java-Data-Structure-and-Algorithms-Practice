package BasicMath;
import java.util.*;
public class Prime {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number: ");
        int num = sc.nextInt(); 
        int count = 0;
        for (int i = 2; i <= Math.sqrt(num); i++) { // Sqrt because if there is any number it would be easy to identify till its root, after root the values will be same. 
            if (num % i == 0) {
                count++;
                break;
            }
        }

        if (count == 0) {
            System.out.println("Prime");
        }
        else{
            System.out.println("Not Prime");
        }
    }
}

// Time Complexity: O(root(n))