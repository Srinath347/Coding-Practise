package Bit_Manipulation;

public class TwoNumbersRepeatedTwice {

    private static boolean check(int c, int i) {
        return (((c>>i)&1)==1);
    }

    private static void printTwoNumbers(int[] arr, int n) {
        int k = 0;
        for(int i=0;i<=n-2;i++) {
            k^=i;
        }
        int k1 = 0;
        for(int i=0;i<n;i++) {
            k1 ^= arr[i];
        }
        int c = k^k1;
        int bit = -1;
        for(int i=0;i<31;i++) {
            if(check(c, i)) {
                bit = i;
            }
        }
        k = 0;
        k1 = 0;
        for(int i=0;i<=n-2;i++) {
            if(check(i, bit)) {
                k ^= i;
            } else {
                k1 ^= i;
            }
        }

        for(int i=0;i<n;i++) {
            if(check(arr[i], bit)) {
                k ^= arr[i];
            } else {
                k1 ^= arr[i];
            }
        }
        System.out.println(k+" "+k1);
    }

    public static void main(String[] args) {
        int[] arr = new int[]{2, 8, 2, 1, 5, 3, 3, 6, 4, 7};
        int n = arr.length;
        printTwoNumbers(arr,n);
    }
}
