package BasicMath;
import java.util.*;

public class BenjaminBulb {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        benjaminBulb(n);        
    }

    static void benjaminBulb(int n){
        for (int i = 1; i*i <= n; i++) {
            System.out.println(i*i);
        }
    }
}
