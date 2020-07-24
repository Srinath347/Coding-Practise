package Bit_Manipulation;

import java.util.Scanner;

public class OnlyOnce {

    private static boolean check(int n, int i) {
        return (((n>>i)&1) == 1);
    }

    private static int findUnique(int[] arr, int n) {
        int ans = 0;
        for(int i=0;i<31;i++) {
            int count = 0;
            for(int j=0;j<n;j++) {
                if(check(arr[j], i)) { count++; }
            }
            if(count%3 != 0) {
                ans += (1<<i);
            }
        }
        return ans;
    }

    public static void main(String[] args) {
        int[] arr = new int[]{1, 10, 10, 3, 10, 3, 198, 3, 1, 1};
        int n = 10;
        int ans = findUnique(arr, n);
        System.out.println(ans);
    }
}
