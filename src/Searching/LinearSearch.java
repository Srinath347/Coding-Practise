package Searching;

import java.util.Scanner;

public class LinearSearch {

    // Main method
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int[] arr = new int[n];
        for(int i=0;i<n;i++) {
            arr[i] = scan.nextInt();
        }
        int k = scan.nextInt();
        boolean ans = search(arr,n, k);
        System.out.println(ans);
    }

    private static boolean search(int[] arr, int n, int k) {
        for(int i=0;i<n;i++) {
            if(arr[i] == k) {
                return true;
            }
        }
        return false;
    }
}
