// Kunal Kushwaha Bubble Sort using recursive function

package SortingAndSearching;

import java.util.Arrays;

public class BubbleSortRecursive {
    public static void main(String[] args) {
        int[] arr = {4,3,2,1};
        BubbleRecursive(arr, arr.length-1, 0);
        System.out.println(Arrays.toString(arr));
    }

    static void BubbleRecursive(int[] arr, int r, int c){
        if (r == 0) {
            return;
        }
        if (c < r) {
            if (arr[c] > arr[c+1]) {
                int tmp = arr[c];
                arr[c] = arr[c+1];
                arr[c+1] = tmp;
            }
            BubbleRecursive(arr, r, c+1);
        }
        else{
            BubbleRecursive(arr, r-1, 0);
        }
    }
}
