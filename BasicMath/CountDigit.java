package BasicMath;
import java.util.*;
public class CountDigit {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number to count no. of digits ");
        int N = sc.nextInt();
        String n = Integer.toString(N);
        System.out.print(n.length());
    }
}
