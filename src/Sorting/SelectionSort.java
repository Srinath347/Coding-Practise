package Sorting;

import java.util.Arrays;
import java.util.Scanner;

/* Problem Statement : Implement Selection Sort Algorithm
 *  T.C : O(n2)
 *  S.C : O(1)
 */
public class SelectionSort {

    // Method to swap to variables
    private static void swap(int[] arr, int i, int j) {
        arr[i] = arr[j]^arr[i]^(arr[j] = arr[i]);
    }

    //Method to implement selection sort algorithm
    private static void sort(int[] arr, int n) {
        for(int i=0;i<n;i++) {
            int min = arr[i];
            int idx = i;
            for(int j = i+1; j<n;j++) {
                if(arr[j] < min) {
                    min = arr[j];
                    idx = j;
                }
            }
            swap(arr, i,idx);
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
        sort(arr,n);
        System.out.println(Arrays.toString(arr));
    }
}
