package Bit_Manipulation;
import java.util.*;

public class Power {

    private static int computePower(int a, int n) {
        if(n == 0) {return 1;}
        int x = computePower(a, n/2);
        if(n%2 == 0) {
            return x*x;
        }
        return x*x*a;
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int a = scan.nextInt();
        int n = scan.nextInt();
        int ans = computePower(a, n);
        System.out.println(ans);
    }
}
