package Recursion;
import java.util.*;

public class ValidParenthesis {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        StringBuilder sb = new StringBuilder();
        print(sb, 2*n, 0,0);
    }

    private static void print(StringBuilder sb, int n,int open, int close) {
        if(sb.length() == n) {
            System.out.println(sb);
            return;
        }
        if(close < open) {
            sb.append(")");
            print(sb, n, open, close + 1);
            sb.deleteCharAt(sb.length()-1);
        }
        if(open < n/2){
            sb.append("(");
            print(sb, n, open + 1, close);
            sb.deleteCharAt(sb.length() - 1);
        }
    }
}
