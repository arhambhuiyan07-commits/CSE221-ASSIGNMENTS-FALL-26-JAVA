import java.util.*;
import java.io.*;
public class a8 {
    public static void main(String[] args)throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        PrintWriter pw = new PrintWriter(System.out);

        StringTokenizer st1 = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st1.nextToken());
        long k = Long.parseLong(st1.nextToken());
        
        StringTokenizer st2 = new StringTokenizer(br.readLine());
        int[] arr = new int[n];
        int high = Integer.MIN_VALUE;
        for(int i=0;i<n;i++){
            arr[i] = Integer.parseInt(st2.nextToken());
            if(arr[i]>high){
                high = arr[i];
            }
        }

        int low = 1;
        int ans = -1;
        while(low<=high){
            int mid = (low+high)/2;
            long p = 0;
            for(int i=0;i<n;i++){
                p += arr[i]/mid;
            }

            if(p>=k){
                ans = mid;
                low = mid + 1;
            }
            else{
                high = mid-1;
            }
        }

        pw.println(ans);
        pw.flush();
    }
}
