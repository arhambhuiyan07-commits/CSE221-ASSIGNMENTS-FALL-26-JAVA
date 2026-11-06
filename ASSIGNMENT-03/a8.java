import java.util.*;
import java.io.*;

public class a8 {
    public static void main(String[] args)throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        PrintWriter pw = new PrintWriter(System.out);

        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());

        st = new StringTokenizer(br.readLine());
        int[] in = new int[n];
        for(int i=0;i<n;i++){
            in[i] = Integer.parseInt(st.nextToken());
        }

        st = new StringTokenizer(br.readLine());
        int[] post = new int[n];
        for(int i=0;i<n;i++){
            post[i] = Integer.parseInt(st.nextToken());
        }

        ArrayList<Integer> pre = new ArrayList<>();

        buildBT(pre,in,post,0,n-1,n-1);

        for(int i=0;i<pre.size();i++){
            if(i != pre.size()-1){
                pw.print(pre.get(i)+" ");
            }
            else{
                pw.print(pre.get(i));
            }
        }

        pw.flush();
    }

    public static void buildBT(ArrayList<Integer> pre,int[] in, int[] post,int l, int r,int pR){
        if(l>r){
            return;
        }

        int root = post[pR];

        int inRoot  = l;
        while(in[inRoot] != root){
            inRoot++;
        }

        int rightSize = r-inRoot;

        pre.add(root);
        buildBT(pre,in,post,l,inRoot-1,pR-rightSize-1);
        buildBT(pre,in,post,inRoot+1,r,pR-1);
    }
}
