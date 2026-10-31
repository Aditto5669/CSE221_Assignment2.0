import java.io.*;
import java.util.*;
 
public class SplitArray {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        PrintWriter out = new PrintWriter(System.out);
 
        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        int k = Integer.parseInt(st.nextToken());
 
        int[] arr = new int[n];
        st = new StringTokenizer(br.readLine());
        long maxElem = 0, totalSum = 0;
        for (int i = 0; i < n; i++) {
            arr[i] = Integer.parseInt(st.nextToken());
            maxElem = Math.max(maxElem, arr[i]);
            totalSum += arr[i];
        }
 
        long left = maxElem, right = totalSum, ans = totalSum;
 
        while (left <= right) {
            long mid = (left + right) / 2;
            if (canSplit(arr, k, mid)) {
                ans = mid;
                right = mid - 1;
            } else {
                left = mid + 1;
            }
        }
 
        out.println(ans);
        out.close();
    }
 
    static boolean canSplit(int[] arr, int k, long maxSum) {
        int count = 1;
        long current = 0;
        for (int num : arr) {
            if (current + num > maxSum) {
                count++;
                current = num;
                if (count > k) return false;
            } else {
                current += num;
            }
        }
        return true;
    }
}