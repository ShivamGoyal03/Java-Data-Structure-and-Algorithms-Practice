// Print N to 1 using recursion

package BasicRecursion;
import java.util.*;
public class PrintNTimesReverse {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        printNos(num);
    }

    static void printNos(int n){
        if (n < 1 || n >= 1000) {
            return;
        }
        System.out.print(n + " ");
        printNos(n-1);
    }
}
