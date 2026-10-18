import java.io.*;
import java.util.StringTokenizer;
public class a4 {
    public static void main(String[] args)throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        PrintWriter pw = new PrintWriter(System.out);
        int T = Integer.parseInt(br.readLine());

        for(int i=0;i<T;i++){
            boolean res = true;
            int N = Integer.parseInt(br.readLine());
            StringTokenizer st = new StringTokenizer(br.readLine());
            int[] arr = new int[N];
            for(int j=0;j<N;j++){
                arr[j] = Integer.parseInt(st.nextToken());
            }

            for(int k=0;k+1<N;k++){
                if(arr[k] > arr[k+1]){
                    res = false;
                    break;
                }
            }

            if(res){
                pw.println("YES");
            }
            else{
                pw.println("NO");
            }
        }

        pw.flush();
    }
}
