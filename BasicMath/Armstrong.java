// For a given 3 digit number, find whether it is armstrong number or not. An Armstrong number of three digits is an integer such that 
// the sum of the cubes of its digits is equal to the number itself. Return "Yes" if it is a armstrong number else return "No".

package BasicMath;
import java.util.*;
public class Armstrong {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        armstrongNumber(N);
    }

    static String armstrongNumber(int n){
        int sum = 0;
        int count = 0;
        int temp = n;
        int temp1 = n;
        while (temp != 0) {
            count++;
            temp /= 10;
        }
        while(n != 0){
            int dig = n % 10;
            sum += Math.pow(dig, count);
            n /= 10;
        }
        if (temp1 == sum) {
            return "yes";
        }
        else
            return "no";
    }
}
