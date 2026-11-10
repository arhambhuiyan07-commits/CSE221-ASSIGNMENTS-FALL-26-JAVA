import java.io.*;
import java.util.*;

public class a5 {
    public static void main(String[] args)throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        PrintWriter pw = new PrintWriter(System.out);

        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());

        int[] arr = new int[n+1];
        StringTokenizer st1 = new StringTokenizer(br.readLine());
        StringTokenizer st2 = new StringTokenizer(br.readLine());

        for(int i=0;i<m;i++){
            arr[Integer.parseInt(st1.nextToken())] -= 1;
            arr[Integer.parseInt(st2.nextToken())] += 1;
        }

        for(int i=1;i<=n;i++){
            if(i == n){
                pw.print(arr[i]);
            }
            else{
                pw.print(arr[i]+" ");
            }
        }
        pw.flush();
    }
}
