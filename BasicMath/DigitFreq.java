package BasicMath;
import java.util.*;
public class DigitFreq {
    public static void main(String[] args) {   
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number to count no. of digits ");
        int N = sc.nextInt();
        System.out.println("Enter the digit to count frequency ");
        int d = sc.nextInt();
        int count=0;
        if (N == 0 && d == 0) {
            System.out.println("1");
        }
        else {
            while (N != 0) {
                int rem = N % 10;
                if (rem == d) {
                    count++;
                }
                N = N / 10;
            }
            System.out.println(count);
        }
    }
}
