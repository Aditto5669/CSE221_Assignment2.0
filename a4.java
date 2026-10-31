import java.io.*;
import java.util.*;
public class a4{
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        PrintWriter pw= new PrintWriter(System.out);

        StringTokenizer st = new StringTokenizer(br.readLine());

        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());
        st = new StringTokenizer(br.readLine());
        int a[] = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = Integer.parseInt(st.nextToken());
        }
        int e=0;
        int b=0;
        int max=0;
        int c=0;
        while (b<n) {
            c+=a[b];
            while (b>=e && c>m) {
                c-=a[e];
                e++;
            }
            int k=b-e+1;
            if (k>max) {
               max=k; 
            }
            b++;

        }

    //   //  while (aa<n) {
    //         if (aa==b) {
    //             if (a[aa]>m) {
    //                 aa++;
    //                 b++;
    //                 c=0;
    //                 continue;
    //             }
    //         }
                
            
    //         c+=a[aa];
    //         if (c<=m) {
    //             aa++;
    //             int k=(aa-b)+1;
    //             if (k>max) {
    //                 max=k;
    //             }
    //         } else {
            
    //             c-=a[b];
    //             b++;
    //         }
        
    //     }
       pw.println(max);
        pw.close();
    }
}