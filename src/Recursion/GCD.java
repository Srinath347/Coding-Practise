package Recursion;
import java.util.*;

public class GCD {

    private static int gcd(int a, int b) {
        if(a == 0) { return b; }
        System.out.println(a+" "+b);
        return gcd(b%a, a);
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int a = scan.nextInt();
        int b = scan.nextInt();
        int ans = gcd(a, b);
        System.out.println(ans);
    }
}
