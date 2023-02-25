package ArraysAndArrayList;
import java.util.*;
public class LinearSearch {
    public static void main(String[] args) {
        int[] arr = { 1, 2, 4, 4, 8, 9, 12 };
        System.out.println(find(arr, 53, 0));
        System.out.println(findIndex(arr, 4, 0));
        // findAllIndex(arr, 4, 0);
        // System.out.println(list);
        System.out.println(findAllIndex(arr, 4, 0, new ArrayList<>()));
        System.out.println(findAllIndex2(arr, 4, 0));
    }

    // linear searching if present or not - True/False
    static boolean find(int[] arr, int target, int index){
        if (index == arr.length) {
            return false;
        }

        return arr[index] == target || find(arr, target, index+1);
    }

    // returning the index of target
    static int findIndex(int[] arr, int target, int index){
        if (index == arr.length) {
            return -1;
        }
        if (arr[index] == target) {
            return index;
        } else{
            return findIndex(arr, target, index+1);
        }
    }

    // printing arraylist of the all indexes where target is matched
    static ArrayList<Integer> list = new ArrayList<>();
    static void findAllIndex(int[] arr, int target, int index){
        if (index == arr.length) {
            return;
        }
        if (arr[index] == target) {
            list.add(index);
        }
        findAllIndex(arr, target, index+1);
    }

    // returning arraylist of the all indexes where target is matched
    static ArrayList<Integer> findAllIndex(int[] arr, int target, int index, ArrayList<Integer> list){
        if (index == arr.length) {
            return list;
        } 
        if (arr[index] == target) {
            list.add(index);
        }
        return findAllIndex(arr, target, index+1,list);
    }

    // creating arraylist after every recursion call
    // returning arraylist of the all indexes where target is matched without passing the arguement
    static ArrayList<Integer> findAllIndex2(int[] arr, int target, int index){
        ArrayList<Integer> list = new ArrayList<>();
        if (index == arr.length) {
            return list;
        } 
        // this will contain answers for that function call only
        if (arr[index] == target) {
            list.add(index);
        }
        ArrayList<Integer> ansForBelowCalls = findAllIndex2(arr, target, index+1);
        // ansForBelowCalls.addAll(list);
        // return ansForBelowCalls;
        list.addAll(ansForBelowCalls);
        return list;
    }
}
 