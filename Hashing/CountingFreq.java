package Hashing;
import java.util.*;
public class CountingFreq {
    public static void main(String[] args) {
        int[] arr = {2, 3, 2, 3, 5};
        int N = arr.length;
        int P = 3;
        frequencyCount(arr, N, P);
    }

    public static void frequencyCount(int arr[], int N, int P)
    {
        // code here
        HashMap<Integer, Integer> hs = new HashMap<>();
        for(int i = 0; i<arr.length; i++){
            if(hs.containsKey(arr[i])){
                int val = hs.get(arr[i]);
                val++;
                hs.put(arr[i], val);
            }
            else{
                hs.put(arr[i], 1);
            }
        }
        
        for(int i = 0; i<arr.length; i++){
            if(hs.containsKey(i+1)){
                int val = hs.get(i+1);
                arr[i] = val;
            }
            else{
                arr[i] = 0;
            }
        }
    }
}
