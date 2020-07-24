package Bit_Manipulation;
import java.util.*;

/* Problem Statement : Given a number N and a position i, check whether ith bit is set/not-set in N.
   Input : N = 7 , i = 2 ; N = 16 , i = 2 .
   Output: true ; false .
   Explanation : N = 7   0111 , here 0th, 1st and 2nd bit are set and i = 2 hence return true.
                 N = 16  10000 , here all bit are unset except for 4th bit so for i = 2 return false.
 */
public class CheckBit {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int N = scan.nextInt();
        int i = scan.nextInt();
        System.out.println(checkBit(N, i));
    }

    /* Explanation : right shift N by i times, then ith bit comes to LSB
                     now & it with 1, if LSB is 1 & gives 1 else 0.
     */
    static boolean checkBit(int N, int i) {
        return ((N >> i) & 1) == 1 ? true : false;
    }
}
