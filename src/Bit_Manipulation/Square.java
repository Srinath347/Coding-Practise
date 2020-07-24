package Bit_Manipulation;
import java.util.*;

public class Square {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int square = pow(n);
        System.out.println(square);
    }

    private static int pow(int n) {
        return (1<<n);
    }
}