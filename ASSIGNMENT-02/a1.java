import java.util.*;
import java.io.*;
public class a1 {
    public static void main(String[] args)throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        PrintWriter pw = new PrintWriter(System.out);

        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());
        long k = Long.parseLong(st.nextToken());

        int[] arr = new int[N];
        StringTokenizer st1 = new StringTokenizer(br.readLine());
        for(int a=0;a<N;a++){
            arr[a] = Integer.parseInt(st1.nextToken());
        }

        int i=0;
        int j=N-1;
        boolean flag = false;
        while(i<j){
            if(arr[i]+arr[j] == k){
                flag = true;
                pw.println((i+1)+" "+(j+1));
                break;
            }
            else if(arr[i]+arr[j] > k){
                j--;
            }
            else{
                i++;
            }
        }

        if(!flag){
            pw.println(-1);
        }

        pw.flush();
    }
}
