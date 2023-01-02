// Given a string S, check if it is palindrome or not.

package BasicRecursion;
import java.util.*;
public class StringPalindrome {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        str.toLowerCase();
        str = str.replaceAll("[^a-zA-Z0-9]", "");
        isPalindrome(str);
    }

    static boolean isPalindrome(String s){
        String ans = "";
        for (int i = s.length()-1; i >= 0; i--) {
            ans = ans + s.charAt(i);
        }
        if (ans.equals(s)) {
            return true;
        }
        return false;
    }
}
