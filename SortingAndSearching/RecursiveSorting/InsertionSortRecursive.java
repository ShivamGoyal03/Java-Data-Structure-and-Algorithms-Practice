// Recursive Insertion Sort

package SortingAndSearching.RecursiveSorting;
import java.util.*;
public class InsertionSortRecursive {
    public static void main(String[] args) {
        int[] arr = { 4, 5, 1, 2, 3 };
        int n = arr.length;
        InsertionRecur(arr, n);
        System.out.println(Arrays.toString(arr));   
    }

    static void InsertionRecur(int[] arr, int n){
        if (n <= 1)
            return;
        InsertionRecur(arr, n-1);
        int key = arr[n-1];
        int j = n-2;
        while (j >= 0 && arr[j] > key) {
            arr[j + 1] = arr[j];
            j--;
        }
        arr[j + 1] = key;
    }

}
