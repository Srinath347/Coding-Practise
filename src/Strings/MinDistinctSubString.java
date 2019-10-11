package Strings;

import java.util.*;
import java.io.*;

/**
 * You are given a String S made of lowercase English Alphabets.
 * Find the length of smallest substring with maximum number of distinct characters.
 *
 * 1<= |S| <= 105.
 * where |S| denotes the length of the String.
 */

public class MinDistinctSubString {

    private static boolean isValid(String s, int len, int n, int k) {
        HashMap<Character, Integer> h = new HashMap<Character, Integer>();

        for(int i=0;i<k;i++) {
            int c = h.get(s.charAt(i)) == null ? 1 : h.get(s.charAt(i))+1;
            h.put(s.charAt(i),c);
        }

        if(h.size() == n) {
            return true;
        }

        for(int i=k;i<len;i++) {
            char c = s.charAt(i-k);
            if(h.get(c) == 1) {
                h.remove(c);
            } else {
                int x = h.get(c);
                h.put(c,x-1);
            }

            int co = h.get(s.charAt(i)) == null ? 1 : h.get(s.charAt(i))+1;
            h.put(s.charAt(i),co);

            if(h.size() == n) {
                return true;
            }
        }

        return false;
    }

    private static int get(String s, int len, int n) {
        int low = 1;
        int high = len;
        int ans = 1;
        while(low<=high) {
            int mid = (low+high)/2;
            if(isValid(s,len,n,mid)) {
                ans = mid;
                high = mid-1;
            } else {
                low = mid+1;
            }
        }
        return ans;
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int test = Integer.parseInt(br.readLine());
        while(test>0) {
            String s = br.readLine();
            int len = s.length();
            HashSet<Character> h = new HashSet<Character>();

            // find number of distinct chars in the String
            for(int i=0;i<len;i++) {
                h.add(s.charAt(i));
            }

            bw.write(get(s,len,h.size())+"\n");
            test--;
        }
        bw.flush();
    }
}
