import java.io.*;
import java.util.*;

public class a8 {
    public static void main(String[] args)throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        PrintWriter pw = new PrintWriter(System.out);

        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        int q = Integer.parseInt(st.nextToken());

        int[][] arr = new int[n+1][n+1];

        for(int i=1;i<=n;i++){
            for(int j=1;j<=n;j++){
                if(gcd(i,j) == 1 && i != j){
                    arr[i][j] = 1;
                }
            }
        }

        for(int i=0;i<q;i++){
            st = new StringTokenizer(br.readLine());
            int x = Integer.parseInt(st.nextToken());
            int k = Integer.parseInt(st.nextToken());
            int ans = -1;
            int count = 0;

            for(int j=0;j<arr.length;j++){
                if(arr[x][j] == 1){
                    count++;
                    if(count == k){
                        ans = j;
                    }
                }
            }
            pw.println(ans);
        }
        pw.flush();
    }

   public static int gcd(int i,int j){
    if(i == 0){
        return j;
    }
    else{
        return gcd(j%i, i);
    }
}
}