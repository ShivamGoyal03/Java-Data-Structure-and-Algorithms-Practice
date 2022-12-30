// Understand recursion by print something N times

package BasicRecursion;
import java.util.*;
public class PrintNTimes {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        printNos(num);
    }
    
    static void printNos(int num){
        if (num < 1 || num >= 1000) {
            return;
        }
        printNos(num-1);
        System.out.print(num + " ");
    }
}
