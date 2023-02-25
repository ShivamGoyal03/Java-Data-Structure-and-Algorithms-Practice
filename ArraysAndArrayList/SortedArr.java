// Find if array is sorted or not

package ArraysAndArrayList;
import java.util.*;

public class SortedArr {
    public static void main(String[] args) {
        int[] arr = { 1, 2, 4, 8, 9, 12 };
        System.out.println(FindSort(arr, 0));
    }

    static boolean FindSort(int[] arr, int k){
        if (k == arr.length-1) {
            return true;
        }
        return arr[k] < arr[k+1] && FindSort(arr, k+1);
    }
}
