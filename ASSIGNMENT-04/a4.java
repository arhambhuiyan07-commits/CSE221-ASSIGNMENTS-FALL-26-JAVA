import java.io.*;
import java.util.*;

public class a4 {
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
            arr[Integer.parseInt(st1.nextToken())] += 1;
            arr[Integer.parseInt(st2.nextToken())] += 1;
        }

        int odd_count = 0;
        for(int i=0;i<=n;i++){
            if(arr[i] %2 != 0){
                odd_count += 1;
            }
        }

        if(odd_count == 0 || odd_count == 2){
            pw.println("YES");
        }
        else{
            pw.println("NO");
        }

        pw.flush();
    }
}
