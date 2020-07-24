package Sorting;

import java.util.*;

public class QuickSort {

    private static void swap(int[] arr, int i, int j) {

    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int[] arr = new int[n];
        for(int i=0;i<n;i++) {
            arr[i] = scan.nextInt();
        }
        sort(arr,0, n-1);
        System.out.println(Arrays.toString(arr));
    }

    private static void sort(int[] arr, int low, int high) {
        if(low >= high) { return; }
        int pi = partition(arr, low, high);
        sort(arr, low, pi-1);
        sort(arr, pi+1, high);
    }

    private static int partition(int[] arr, int low, int high) {
        int pivot = arr[high];
        int i = low;
        for(int j=low;j<high;j++) {
            if(arr[j] < pivot) {
                arr[j] =  arr[i]^arr[j]^(arr[i] = arr[j]);
                i++;
            }
        }
        arr[i] = arr[high]^arr[i]^(arr[high] = arr[i]);
        return i;
    }
}
