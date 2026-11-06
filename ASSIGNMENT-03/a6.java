import java.util.*;
import java.io.*;

public class a6 {
    public static void main(String[] args)throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        PrintWriter pw = new PrintWriter(System.out);

        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());

        st = new StringTokenizer(br.readLine());
        long[] arr = new long[n];
        for(int a=0;a<n;a++){
            arr[a] = Long.parseLong(st.nextToken());
        }

        ArrayList<Long> res = new ArrayList<>();
        buildBST(arr,res,0,n-1);

        for(int i=0;i<res.size();i++){
            if(i != res.size()-1){
                pw.print(res.get(i)+" ");
            }
            else{
                pw.print(res.get(i));
            }
        }

        pw.flush();
    }

    public static void buildBST(long[] arr,ArrayList<Long> res,int l,int r){
        if(l>r){
            return;
        }

        int mid = l+(r-l)/2;

        res.add(arr[mid]);

        buildBST(arr,res,l,mid-1);
        buildBST(arr,res,mid+1,r);
    }
}