import java.util.*;
import java.io.*;
public class a5 {
    public static void main(String[] args)throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        PrintWriter pw = new PrintWriter(System.out);

        StringTokenizer st1 = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st1.nextToken());
        int limit = Integer.parseInt(st1.nextToken());

        int[] arr = new int[N];
        StringTokenizer st2 = new StringTokenizer(br.readLine());
        for(int a=0;a<N;a++){
            arr[a] = Integer.parseInt(st2.nextToken());
        }

        int[] count = new int[N+1];
        int max = 0;
        int l = 0;
        int dist = 0;
        for(int r=0;r<N;r++){
            if(count[arr[r]] == 0){
                dist += 1;
            }
            count[arr[r]] += 1;
            while(dist>limit){
                count[arr[l]] -= 1;
                if(count[arr[l]] == 0){
                    dist--;
                }
                l++; 
            }
            int temp = r-l+1;
            if(temp>max){
                max = temp;
            }
        }

        pw.println(max);
        pw.flush();
    }
}