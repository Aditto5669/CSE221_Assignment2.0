import java.io.*;
import java.util.*;
public class t55{
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        PrintWriter out = new PrintWriter(System.out);

        StringTokenizer st = new StringTokenizer(br.readLine());

        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());
        st = new StringTokenizer(br.readLine());
        int arr[]=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=Integer.parseInt(st.nextToken());
        }
        if(m==0){
            out.println(0);
            out.close();
        }
        int ck[]=new int[m];
        int min =-1;
        int a=0;
        int b=0;
        int c=0;
        while (b<n) {
            if (a==b) {
                ck[c]=arr[a];
                c++;
                b++;
                continue;
            }
            boolean check=false;
            for(int i=0;i<c;i++){
                if(ck[i]==arr[b]){
                    check=true;
                    break;
                }
            }
            if(check){

                b++;
                if ((b-a)>min) {
                    min=b-a;
                }

            }
            else{
                if (c<m) {
                    ck[c]=arr[b];
                    c++;
                    b++;
                    if ((b-a)>min) {
                    min=b-a;
                }
                }
                else{
                    if (b<n-1) {
                        c=0;
                    a=b+1;
                    b=b+1;
                    } else {
                        break;
                    }
                    
                }
            }
        }
        if (min==-1) {
            out.println(1);
        } 
        else if (m==0) {
            out.println(0);
        }
        else {
            out.println(min);
        }
        out.close();
    }
}