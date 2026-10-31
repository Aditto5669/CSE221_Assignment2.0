import java.io.*;
import java.util.*;
public class t2 {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        PrintWriter out = new PrintWriter(System.out);

        StringTokenizer st = new StringTokenizer(br.readLine());

        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());
        int k=Integer.parseInt(st.nextToken());
        //st = new StringTokenizer(br.readLine());
        int ar[]= new int[n];
        int ar1[] = new int[m];
        st = new StringTokenizer(br.readLine());
        for (int i = 0; i < n; i++) {
            ar[i] = Integer.parseInt(st.nextToken());
        }
        st = new StringTokenizer(br.readLine());
        for (int i = 0; i < m; i++) {
            ar1[i] = Integer.parseInt(st.nextToken());
        }
        int a=-1;
        int b=-1;
        int c=0;
        int d=m-1;
        int dif=99999;
        int aaa;
        if (k<0) {
             aaa=k*-1;
        }
        else{
            aaa=k;
        }
        while ((c<n) || (d>=0)) {
            int jk=ar[c]+ar1[d];
            if (jk<0) {
                jk=(-1)*jk;
            }
            
            if ((ar[c]+ar1[d])==k) {
                a=c;
                b=d;
                break;
            }
            else if (ar[c]+ar1[d]>k) {
                
                if ((jk-aaa)<dif) {
                   a=c;
                    b=d;
                    dif=jk-aaa;
                }
                d--;
            }
            else{
                
                if ((jk-aaa)<dif) {
                   a=c;
                    b=d;
                    dif=jk-aaa;
                }
                c++;
            }
        }
        out.println((a+1) +" "+ (b+1));
        out.close();
        
    }
}