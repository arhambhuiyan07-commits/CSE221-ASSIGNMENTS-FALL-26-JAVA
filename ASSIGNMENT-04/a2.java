import java.io.*;
import java.util.*;

public class a2 {
    static class edge{
        int to;
        int weight;

        edge(int t, int w){
            to = t;
            weight = w;
        }
    }
    public static void main(String[] args)throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        PrintWriter pw = new PrintWriter(System.out);

        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());
        ArrayList<ArrayList<edge>> res = new ArrayList<>();

        for(int i=0;i<=n;i++){
            res.add(new ArrayList<>());
        }

        st = new StringTokenizer(br.readLine());
        int[] from = new int[m];
        for(int i=0;i<m;i++){
            from[i] = Integer.parseInt(st.nextToken());
        }

        st = new StringTokenizer(br.readLine());
        int[] to = new int[m];
        for(int i=0;i<m;i++){
            to[i] = Integer.parseInt(st.nextToken());
        }

        st = new StringTokenizer(br.readLine());
        int[] weight = new int[m];
        for(int i=0;i<m;i++){
            weight[i] = Integer.parseInt(st.nextToken());
        }

        for(int i=0;i<m;i++){
            edge e = new edge(to[i],weight[i]);
            res.get(from[i]).add(e);
        }

        for(int i=1;i<=n;i++){
            pw.print(i+": ");
            for(int j=0;j<res.get(i).size();j++){
                edge e = res.get(i).get(j);
                pw.print("("+e.to+","+e.weight+") ");
            }
            pw.println();
        }
 
        pw.flush();
    }
}