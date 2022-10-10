package Pattern;
import java.util.*;
public class Pattern11 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of the pyramid: ");
        int n = sc.nextInt();
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                if (i == j) {
                    System.out.print("1");
                }
                else if ((j == 1) && ((i%2)!= 0)) {
                    System.out.print("1");
                }
                else if (((i-j) % 2) == 0) {
                    System.out.print("1");
                }
                else{
                    System.out.print("0");
                }
            }
            System.out.println();
        }        
    }
}
