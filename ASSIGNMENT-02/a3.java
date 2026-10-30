import java.util.*;
import java.io.*;
public class a3 {
    public static void main(String[] args)throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        PrintWriter pw = new PrintWriter(System.out);

        StringTokenizer st1 = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st1.nextToken());
        StringTokenizer st2 = new StringTokenizer(br.readLine());
        int[] arr1 = new int[N];
        for(int a=0;a<N;a++){
            arr1[a] = Integer.parseInt(st2.nextToken());
        }

        StringTokenizer st3 = new StringTokenizer(br.readLine());
        int M = Integer.parseInt(st3.nextToken());
        StringTokenizer st4 = new StringTokenizer(br.readLine());
        int[] arr2 = new int[M];
        for(int a=0;a<M;a++){
            arr2[a] = Integer.parseInt(st4.nextToken());
        }

        int i=0;
        int j=0;
        int idx = 0;
        int[] res = new int[N+M];
        while(i<N && j<M){
            if(arr1[i]<arr2[j]){
                res[idx++] = arr1[i];
                i++;
            }
            else{
                res[idx++] = arr2[j];
                j++;
            }
        }

        while(i<N){
            res[idx++] = arr1[i++];
        }

        while(j<M){
            res[idx++] = arr2[j++];
        }

        for(int a=0;a<res.length;a++){
            if(a != res.length-1){
            pw.print(res[a]+" ");
            }
            else{
            pw.print(res[a]);
            }
        }

        pw.flush();
    }
}