// Print name N times using recursion

package BasicRecursion;
import java.util.*;
public class NameNTimes {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        printgfg(num);
    }
    
    static void printgfg(int num){
        if (num < 1 || num >= 1000) {
            return;
        }
        printgfg(num-1);
        System.out.print("GFG ");
    }
}
