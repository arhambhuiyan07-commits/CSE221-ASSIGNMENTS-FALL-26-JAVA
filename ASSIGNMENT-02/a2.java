import java.util.*;
import java.io.*;
public class a2 {
    public static void main(String[] args)throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        PrintWriter pw = new PrintWriter(System.out);

        StringTokenizer st1 = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st1.nextToken());
        int M = Integer.parseInt(st1.nextToken());;
        long k = Long.parseLong(st1.nextToken());

        StringTokenizer st2 = new StringTokenizer(br.readLine());
        long[] arr1 = new long[N];
        for(int a=0;a<N;a++){
            arr1[a] = Long.parseLong(st2.nextToken());
        }

        StringTokenizer st3 = new StringTokenizer(br.readLine());
        long[] arr2 = new long[M];
        for(int a=0;a<M;a++){
            arr2[a] = Long.parseLong(st3.nextToken());
        }

        int i = 0;
        int j = M-1;
        long abs_sum = Long.MAX_VALUE;
        int[] res = new int[2];
        while(i<N && j>=0){
            long sum = arr1[i]+arr2[j];
            long abs = Math.abs(sum-k);
            if(abs_sum>abs){
                abs_sum = abs;
                res[0] = i+1;
                res[1] = j+1;
            }
            if(sum<k){
                i++;
            }
            else{
                j--;
            }
        }

        pw.print(res[0]+" "+res[1]);
        pw.flush();
    }
}