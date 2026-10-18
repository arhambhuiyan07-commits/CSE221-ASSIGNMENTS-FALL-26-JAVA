import java.util.*;
import java.io.*;
public class a5 {
    public static void main(String[] args)throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        PrintWriter pw = new PrintWriter(System.out);
        int n = Integer.parseInt(br.readLine());

        int[] arr = new int[n];
        int[] trace = new int[n*n];
        int count = 0;
        boolean res = true;

        StringTokenizer st = new StringTokenizer(br.readLine());
        for(int i=0;i<n;i++){
            arr[i] = Integer.parseInt(st.nextToken());
        }

        if(n<3){
            if(n == 2 && arr[0] > arr[1]){
                res = false;
            }
        }
        else{
            int idx = 0;
            for(int i=0;i<n;i++){
                int j = 2;
                for(int k=0;j<n;k++){
                    if(arr[k] > arr[j]){
                        int temp = arr[k];
                        arr[k] = arr[j];
                        arr[j] = temp;
                        count++;
                        trace[idx++] = k+1;
                        trace[idx++] = j+1;
                    }
                    j++;
                }
            }
        }

        for(int a=0;a+1<n;a++){
            if(arr[a] > arr[a+1]){
                res = false;
                break;
            }
        }

        if(res){
            pw.println("YES");
            pw.println(count);
            for(int i=0;i<count*2;i=i+2){
                pw.println(trace[i]+" "+trace[i+1]);
            }
        }
        else{
            pw.print("NO");
        }

        pw.flush();
    }
}
