import java.util.*;
import java.io.*;

public class a7 {

     static int preIdx = 0;
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
        int[] pre = new int[n];
        for(int i=0;i<n;i++){
            pre[i] = Integer.parseInt(st.nextToken());
        }

        ArrayList<Integer> post = new ArrayList<>();

        buildBT(pre,in,post,0,n-1);

        for(int i=0;i<post.size();i++){
            if(i != post.size()-1){
                pw.print(post.get(i)+" ");
            }
            else{
                pw.print(post.get(i));
            }
        }

        pw.flush();
    }

    public static void buildBT(int[] pre,int[] in, ArrayList<Integer> post,int l, int r){
        if(l>r){
            return;
        }

        int root = pre[preIdx++];

        int inRoot  = 0;
        while(in[inRoot] != root){
            inRoot++;
        }

        buildBT(pre,in,post,l,inRoot-1);
        buildBT(pre,in,post,inRoot+1,r);
        post.add(root);
    }
}