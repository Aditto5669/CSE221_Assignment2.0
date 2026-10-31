import java.io.*;
import java.util.*;
public class t4{
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        PrintWriter out = new PrintWriter(System.out);

        StringTokenizer st = new StringTokenizer(br.readLine());

        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());
        st = new StringTokenizer(br.readLine());
        int arr[] = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = Integer.parseInt(st.nextToken());
        }
        int a=0;
        int b=1;
        int md=0;
        int cd=0;
        int aa=arr[a];
        while((a<n-1) || (b<n)){
            
            if ((aa+arr[b]) <=m) {
                aa+=arr[b];
                b++;
               cd=b-a;
                if (cd>md) {
                 md=cd;
               } 
            }
            else if (a==b && arr[a]>m) {
                a++;
                b++;
            }
            else{
                a-=arr[a];
                a++;
                cd=b-a;
            }
        }
    }
}