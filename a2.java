 import java.io.*;
import java.util.*;

public class a2 {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        PrintWriter out = new PrintWriter(System.out);

        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());
        int k = Integer.parseInt(st.nextToken());

        int[] ar = new int[n];
        int[] ar1 = new int[m];

        st = new StringTokenizer(br.readLine());
        for (int i = 0; i < n; i++) {
            ar[i] = Integer.parseInt(st.nextToken());
        }
        st = new StringTokenizer(br.readLine());
        for (int i = 0; i < m; i++) {
            ar1[i] = Integer.parseInt(st.nextToken());
        }

        int i = 0, j = m - 1;
        int bestI = 0, bestJ = 0;
        long bestDiff = Long.MAX_VALUE;

        while (i < n && j >= 0) {
            long sum = (long) ar[i] + ar1[j];
            long diff = Math.abs(sum - k);

            if (diff < bestDiff) {
                bestDiff = diff;
                bestI = i;
                bestJ = j;
            }

            if (sum > k) {
                j--;
            } else {
                i++;
            }
        }

        out.println((bestI + 1) + " " + (bestJ + 1));
        out.close();
    }
}

