package SortingAndSearching;

import java.util.Arrays;

public class QuickSort {
    public static void main(String[] args) {
        int[] arr = {4,3,2,1};
        int n = arr.length;
        quick(arr, 0, n-1);
        System.out.println(Arrays.toString(arr));
    }

    static int partition(int[] arr, int start, int end){
        int pivot = arr[start];
        int i = start;
        int j = end;
        while (i < j) {
            // do{
            //     i++;
            // }while(arr[i] <= pivot);
            // do{
            //     j--;
            // }while(arr[i] > pivot);
            while (arr[i] <= pivot && i <= end-1){
                i++;
            }
            while (arr[j] > pivot && j >= start){
                j--;
            }
            if (i < j) {
                int t = arr[i];
                arr[i] = arr[j];
                arr[j] = t;
            }
        }
        int t = arr[start];
        arr[start] = arr[j];
        arr[j] = t;
        return j;
    }

    static void quick(int[] arr, int start, int end){
        if (start < end) {
            int j = partition(arr, start, end);
            quick(arr, start, j-1);
            quick(arr, j+1, end);
        }
    }
}
