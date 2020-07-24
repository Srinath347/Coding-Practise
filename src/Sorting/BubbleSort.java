package Sorting;

import java.util.*;

/* Problem Statement : Implement Bubble Sort Algorithm
 *  T.C : O(n2)
 *  S.C : O(1)
 */
public class BubbleSort {

    // Method to swap to variables
    private static void swap(int[] arr, int i, int j) {
        arr[i] = arr[j]^arr[i]^(arr[j] = arr[i]);
    }

    // Bubble Sort implementation
    private static void bubbleSort(int[] arr, int n) {
        for(int i=0;i<n-1;i++) {
            for(int j=0;j<n-1;j++) {
                if(arr[j+1] < arr[j]) {
                    swap(arr, j, j+1);
                }
            }
        }
    }

    // Main method
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int[] arr = new int[n];
        for(int i=0;i<n;i++) {
            arr[i] = scan.nextInt();
        }
        bubbleSort(arr,n);
        System.out.println(Arrays.toString(arr));
    }
}
