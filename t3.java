import java.io.*;
import java.util.*;
public class t3{
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        PrintWriter out = new PrintWriter(System.out);

        StringTokenizer st = new StringTokenizer(br.readLine());

        int n = Integer.parseInt(st.nextToken());
        st = new StringTokenizer(br.readLine());
        int arr[] = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = Integer.parseInt(st.nextToken());
        }
        st = new StringTokenizer(br.readLine());
        int m = Integer.parseInt(st.nextToken());
        st = new StringTokenizer(br.readLine());
        int arr1[] = new int[m];
        for (int i = 0; i < m; i++) {
            arr1[i] = Integer.parseInt(st.nextToken());
        }
        int g=n+m;
        int f[] = new int[g];
        int k=0;
        int a=0;
        int b=0;
        while((a<n) &&(b<m)){
            if(arr[a]<=arr1[b]){
                f[k]=arr[a];
                a++;
            }
            else{
                f[k]=arr1[b];
                b++;
            }
            k++;
            
        }
        if(a<n){
            while(a<n){
                f[k]=arr[a];
                a++;
                k++;
            }
        }
        else if(b<m){
            while(b<m){
                f[k]=arr1[b];
                b++;
                k++;
            }
        }
        for (int i = 0; i < n + m; i++) {
            out.print(f[i] + " ");
        }
        //out.println();
        out.close();
    }
}