// Pattern 22

package Pattern;
import java.util.*;
public class Pattern22 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size : ");
        int n = sc.nextInt();
        int ele;
        for(int i=0;i<2*n-1;i++){
            for(int j=0;j<2*n-1;j++){
                int top=i;
                int bottom=(2*n)-2-i;
                int right=j;
                int left=(2*n)-2-j;
                ele=n-Math.min(Math.min(top,bottom),Math.min(right,left));
                System.out.print(ele + " ");
            }
            System.out.println();
        }
    }
}
