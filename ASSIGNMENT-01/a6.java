import java.util.*;
import java.io.*;
public class a6 {
    public static void main(String[] args)throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        PrintWriter pw = new PrintWriter(System.out);
        int n = Integer.parseInt(br.readLine());

        int[] arr = new int[n];

        StringTokenizer st = new StringTokenizer(br.readLine());
        for(int i=0;i<n;i++){
            arr[i] = Integer.parseInt(st.nextToken());
        }

        for(int i=0;i<n;i++){
            int minIdx = i;
            for(int j=i+1;j<n;j++){
                if((arr[i]%2 == 0 && arr[j]%2 == 0) ||(arr[i]%2 != 0 && arr[j]%2 != 0)){
                    if(arr[minIdx] > arr[j]){
                        minIdx = j;
                    }
                }
                else{
                    break;
                }
            }

            int temp = arr[i];
            arr[i] = arr[minIdx];
            arr[minIdx] = temp;
        }

        for(int i=0;i<n;i++){
            if(i != n-1){
                pw.println(arr[i]+" ");
            }
            else{
                pw.println(arr[i]);
            }
        }

        pw.flush();
    }
}