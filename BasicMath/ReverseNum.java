package BasicMath;
import java.util.*;
public class ReverseNum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number to count no. of digits ");
        int N = sc.nextInt();
        int n = N;
        int temp = 0;
        while (n != 0) {
            int dig = n % 10;
            temp = temp * 10 + dig;
            n /= 10;
        }
        System.out.println(temp);
    }
}
