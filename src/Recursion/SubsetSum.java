package Recursion;
import java.util.*;

public class SubsetSum {

    private static boolean hasSum(int[] arr, int n, int sum, int idx) {
        if(idx ==  n) {
            return false;
        }
        if(sum == 0) {
            return true;
        }
        return hasSum(arr, n, sum-arr[idx], idx+1) || hasSum(arr, n, sum, idx+1);
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int[] arr = new int[]{1,2,3,4,5,6,7};
        int n = arr.length;
        int sum = scan.nextInt();
        boolean contains = hasSum(arr, n, sum, 0);
        System.out.println(contains);
    }
}
