import java.io.*;
import java.util.*;
public class t5{
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
        int a=0;
        int b=1;
                //out.println(a+" "+b);
        int min=0;
        while (b<n)  {
            int c=0;
            for(int i =a;i<=b;i++){
                if (arr[i]==arr[b]) {
                    c++;
                }
            }
            if (c<m) {
                if ((b-a)>min) {
                    min=b-a;
                }
                b++;
            }
            else{
                if (b<n-2) {
                   a=b+1;
                b=b+2; 
                }
                else{
                    if (b==n-1) {
                        break;
                    }
                    else if (arr[n-1]==arr[n-2]) {
                        break;
                    }
                    else{
                        if (min==0) {
                            min++;
                            break;
                        }
                        else{
                            break;
                        }
                    }
                }
                
            }
        }
        out.println(min);
        out.flush();
        out.close();
    }
}