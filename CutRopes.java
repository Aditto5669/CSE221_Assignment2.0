import java.io.*;
import java.util.*;

public class CutRopes {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        PrintWriter out = new PrintWriter(System.out);

        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        long k = Long.parseLong(st.nextToken());

        long[] ropes = new long[n];
        st = new StringTokenizer(br.readLine());
        long maxLen = 0;
        for (int i = 0; i < n; i++) {
            ropes[i] = Long.parseLong(st.nextToken());
            maxLen = Math.max(maxLen, ropes[i]);
        }

        long left = 1, right = maxLen, ans = -1;

        while (left <= right) {
            long mid = (left + right) / 2;
            if (canCut(ropes, k, mid)) {
                ans = mid;      // feasible, try larger
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }

        out.println(ans);
        out.close();
    }

    static boolean canCut(long[] ropes, long k, long len) {
        long count = 0;
        for (long rope : ropes) {
            count += rope / len;
            if (count >= k) return true; // early exit
        }
        return count >= k;
    }
}
