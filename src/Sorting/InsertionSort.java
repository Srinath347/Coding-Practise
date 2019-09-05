package Sorting;

import java.util.Arrays;
import java.util.Scanner;

/* Problem Statement : Implement Insertion Sort Algorithm
 *  T.C : O(n2)
 *  S.C : O(1)
 */
public class InsertionSort {

    // swap two variables
    private static void swap(int[] arr, int i, int j) {
        arr[i] = arr[j]^arr[i]^(arr[j] = arr[i]);
    }

    // Insertion sort implementation
    private static void sort(int[] arr,int n) {
        for(int i=1;i<n;i++) {
           int val = arr[i];
           int j = i-1;
           while(j>=0 && arr[j]>val) {
               arr[j+1] = arr[j];
               j--;
           }
           arr[j+1]= val;
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
