import java.io.*;
import java.util.*;

public class a1 {
    public static void main(String[] args)throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        PrintWriter pw = new PrintWriter(System.out);

        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());
        int[][] res = new int[n][n];

        for(int i=0;i<m;i++){
            st = new StringTokenizer(br.readLine());
            int from = Integer.parseInt(st.nextToken());
            int to = Integer.parseInt(st.nextToken());
            int weight = Integer.parseInt(st.nextToken());
            addEdge(from,to,weight,res);
        }

        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                if(j != n-1){
                    pw.print(res[i][j]+" ");
                }
                else{
                    pw.print(res[i][j]);
                    pw.println();
                }
            }
        }

        pw.flush();
    }

    public static void addEdge(int from,int to,int weight,int[][] res){
        res[from-1][to-1] = weight;
    }
}
