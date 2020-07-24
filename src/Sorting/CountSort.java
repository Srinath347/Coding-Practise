package Sorting;

import java.util.*;

public class CountSort {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int[] arr = new int[n];
        for(int i=0;i<n;i++) {
            arr[i] = scan.nextInt();
        }
        //sort(arr,0, n-1);
        System.out.println(Arrays.toString(arr));
    }
}
