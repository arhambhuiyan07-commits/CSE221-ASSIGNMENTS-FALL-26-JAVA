import java.util.*;
import java.io.*;
public class a4 {
    public static void main(String[] args)throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        PrintWriter pw = new PrintWriter(System.out);

        StringTokenizer st1 = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st1.nextToken());
        long k = Long.parseLong(st1.nextToken());

        int[] arr = new int[N];
        StringTokenizer st2 = new StringTokenizer(br.readLine());
        for(int a=0;a<N;a++){
            arr[a] = Integer.parseInt(st2.nextToken());
        }

        long sum =0;
        int max_len = 0;
        int slow = 0;
        for(int fast=0;fast<N;fast++){
            sum += arr[fast];
            while(slow<N && sum>k){
                sum -= arr[slow];
                slow++;
            }
            int temp = fast-slow+1;
            if(temp>max_len){
                max_len = temp;
            }
        }

        pw.println(max_len);
        pw.flush();
    }
}
