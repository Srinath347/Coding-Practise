package Sorting;

import java.util.*;

public class MergeSort {

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
        int mid = (low+high)/2;
        sort(arr, low, mid);
        sort(arr, mid+1, high);
        merge(arr, low, mid, high);
    }

    private static void merge(int[] arr, int low, int mid, int high) {
        int[] temp = new int[high-low+1];
        int p1 = low;
        int p2 = mid+1;
        int i = 0;
        while(p1<=mid && p2 <= high) {
            if(arr[p1] < arr[p2]) {
                temp[i++] = arr[p1++];
            } else {
                temp[i++] = arr[p2++];
            }
        }

        while(p1 <= mid) {
            temp[i++] = arr[p1++];
        }

        while(p2 <= high) {
            temp[i++] = arr[p2++];
        }

        for(i=low;i<=high;i++) {
            arr[i] = temp[i-low];
        }
    }
}
