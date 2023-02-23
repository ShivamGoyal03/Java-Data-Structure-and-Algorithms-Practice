package BasicRecursion.Recursion;

public class ReverseNum {
    static int sum = 0;
    public static void main(String[] args) {
        // Reverse(1456);
        System.out.println(rev2(1456));
        // System.out.println(sum);
    }

    static void Reverse(int n){
        if (n == 0) {
            return;
        }
        int rem = n%10;
        sum = sum * 10 + rem; 
        Reverse(n/10);
    }

    static int rev2(int n){
        // sometimes you need additional variables in the arguement, in that case, make helper function.
        int digits = (int)(Math.log10(n)) + 1;
        return revHelper(n, digits);
    }

    private static int revHelper(int n, int digits) {
        if (n%10 == n) {
            return n;
        }
        return (n%10) * (int)(Math.pow(10,digits-1)) + revHelper(n/10, digits-1);
    }

}
