package Bit_Manipulation;

import java.util.Scanner;

public class UniqueElement {
    private static int find(int[] arr, int n) {
        int ans = 0;
        for(int i=0;i<n;i++) {
            ans ^= arr[i];
        }
        return ans;
    }

    public static void main(String[] args) {
        int[] arr = new int[]{5,2,2,1,1,5,7};
        int n = 7;
        int ans = find(arr, n);
        System.out.println(ans);
    }
}
