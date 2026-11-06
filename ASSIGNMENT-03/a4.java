import java.util.*;
import java.io.*;

public class a4 {
    public static void main(String[] args)throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        PrintWriter pw = new PrintWriter(System.out);

        StringTokenizer st = new StringTokenizer(br.readLine());
        int T = Integer.parseInt(st.nextToken());
        long mod = 1000000007;

        for(int a=0;a<T;a++){
            st = new StringTokenizer(br.readLine());
            long[][] arr = new long[2][2];
            long[][] res = new long[2][2];

            arr[0][0] = Long.parseLong(st.nextToken()) % mod;
            arr[0][1] = Long.parseLong(st.nextToken()) % mod;
            arr[1][0] = Long.parseLong(st.nextToken()) % mod;
            arr[1][1] = Long.parseLong(st.nextToken()) % mod;

            st = new StringTokenizer(br.readLine());
            long x = Long.parseLong(st.nextToken());

            power(arr,res,x,mod);

            pw.println(res[0][0]+" "+res[0][1]);
            pw.println(res[1][0]+" "+res[1][1]);

        }

        pw.flush();
    }

    public static void power(long[][] arr, long[][] res,long x,long mod){
        res[0][0] = 1; res[0][1] = 0;
        res[1][0] = 0; res[1][1] = 1;

        while(x>0){
            if(x%2 != 0){
                multiply(res,arr,res,mod);
            }

            x = x/2;
            if(x>0){
                multiply(arr,arr,arr,mod);
            }
        }
    }

    public static void multiply(long[][] arr1,long[][] arr2,long[][] res,long mod){

        long r00 = (arr1[0][0] * arr2[0][0] + arr1[0][1] * arr2[1][0]) % mod;
        long r01 = (arr1[0][0] * arr2[0][1] + arr1[0][1] * arr2[1][1]) % mod;
        long r10 = (arr1[1][0] * arr2[0][0] + arr1[1][1] * arr2[1][0]) % mod;
        long r11 = (arr1[1][0] * arr2[0][1] + arr1[1][1] * arr2[1][1]) % mod;

        res[0][0] = r00;
        res[0][1] = r01;
        res[1][0] = r10;
        res[1][1] = r11;
    }
}