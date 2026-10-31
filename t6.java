import java.io.*;
import java.util.*;
public class t6{
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        PrintWriter pw = new PrintWriter(System.out);

        StringTokenizer st = new StringTokenizer(br.readLine());

        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());
        st = new StringTokenizer(br.readLine());
        int a[]=new  int[n];
        for(int i=0;i<n;i++){
            a[i]=Integer.parseInt(st.nextToken());
        }
        ArrayList<int []> al=new ArrayList<>();
        for(int i=0;i<m;i++){
            st = new StringTokenizer(br.readLine());
            int x=Integer.parseInt(st.nextToken());
            int y=Integer.parseInt(st.nextToken());
            al.add(new int[]{x,y});
        }
        ArrayList<Integer> count=new ArrayList<>();
        for(int i=0;i<m;i++){
            int c=al.get(i)[0];
            int d=al.get(i)[1];
            int l=left(c, a);
            int r=right(d,a);
            pw.println(r-l);
        }
        pw.flush();
    }
    public static int left(int a,int []b){
        int ans=b.length;
        int l=0;
        int r=b.length -1;
        while (l<=r) {
            int mid=(l+r)/2;
            if (b[mid]>=a) {
                r=mid-1;
                ans=mid;
            }
            else{
                l=mid+1;
            }
        }
        return ans;
    }
    public static int right(int a,int []b){
        int ans=b.length;
        int l=0;
        int r=b.length -1;
        while (l<=r) {
            int mid=(l+r)/2;
            if (b[mid]>a) {
                r=mid-1;
                ans=mid;
            }
            else{
                l=mid+1;
            }
        }
        return ans;
    }
}