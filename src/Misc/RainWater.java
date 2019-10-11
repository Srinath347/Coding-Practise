package Misc;

import java.util.*;
import java.io.*;

public class RainWater {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int[] arr = new int[n];

        for(int i=0;i<n;i++) {
            arr[i] = Integer.parseInt(br.readLine());
        }

        int[] lm = new int[n];
        int[] rm = new int[n];

        lm[0] = 0;
        for(int i=1;i<n;i++) {
            if(arr[i] > arr[lm[i-1]]) {
                lm[i] = i;
            } else {
                lm[i] = lm[i-1];
            }
        }

        rm[n-1] = n-1;
        for(int i=n-2;i>=0;i--) {
            if(arr[i]>arr[rm[i+1]]) {
                rm[i] = i;
            } else {
                rm[i] = rm[i+1];
            }
        }
        System.out.println(Arrays.toString(lm));
        System.out.println(Arrays.toString(rm));
        int max = 0;
        for(int i=0;i<n;i++) {
            int ans = 0;
            if(i != lm[i] && i!= rm[i]) {
                ans = Math.min(arr[lm[i]], arr[rm[i]])*(rm[i]-lm[i]-1);
            }
            max = max>ans?max:ans;
        }
        System.out.println(max);
    }
}
