import java.io.*;
import java.util.*;

public class a3 {
    public static void main(String[] args)throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        PrintWriter pw = new PrintWriter(System.out);

        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());

        int[][] res = new int[n][n];

        for(int i=0;i<n;i++){
            st = new StringTokenizer(br.readLine());
            int k = Integer.parseInt(st.nextToken());
            for(int j=0;j<k;j++){
                int temp = Integer.parseInt(st.nextToken());
                res[i][temp] = 1;
            }
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
}
