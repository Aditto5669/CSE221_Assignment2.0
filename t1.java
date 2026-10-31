import java.io.*;
import java.util.*;
public class t1 {
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
        boolean check = false;
        int a=0;
        int b=n-1;
        while(a<b){
            if(arr[a]+arr[b]==m){
                check = true;
                break;
            }
            else if(arr[a]+arr[b]<m){
                a++;
            }
            else{
                b--;
            }
        }
        if(check){
            
            out.println(a+1+" "+(b+1));
        }
        else{
            out.println(-1);
        }
        out.close();
    }
}