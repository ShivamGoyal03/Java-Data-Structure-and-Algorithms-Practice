package BasicRecursion;

import java.util.*;

public class ReverseArr {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        reverseArray(arr, n);
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }

    static void reverseArray(int[] arr, int n) {
        for (int j = 0; j < n/2; j++) {
            int temp = arr[j];
            System.out.println("temp" + temp);
            arr[j] = arr[n - j - 1];
            arr[n - j - 1] = temp;
        }
        // reverseArray(i+1, arr, n-1);
        // if (i < n) {
        // int tmp = arr[i];
        // arr[i] = arr[n];
        // arr[n] = tmp;
        // reverseArray(i + 1, arr, n - 1);
        // }
    }
}
