package Searching;

import java.util.Scanner;

public class BinarySearch {

    // Main method
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int[] arr = new int[n];
        for(int i=0;i<n;i++) {
            arr[i] = scan.nextInt();
        }
        int k = scan.nextInt();
        boolean ans = search(arr,0, n-1, k);
        System.out.println(ans);
    }

    private static boolean search(int[] arr, int low, int high, int k) {
        while(low <= high) {
            int mid = (low + high)/2;
            if(arr[mid] == k) {
                return true;
            } else if(arr[mid] < k) {
                low = mid+1;
            } else {
                high = mid-1;
            }
        }
        return false;
    }
}
