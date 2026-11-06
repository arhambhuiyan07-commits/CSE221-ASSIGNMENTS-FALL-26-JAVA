import java.util.*;
import java.io.*;

public class a5 {
    public static void main(String[] args)throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        PrintWriter pw = new PrintWriter(System.out);

        StringTokenizer st = new StringTokenizer(br.readLine());
        int T = Integer.parseInt(st.nextToken());

        for(int d=0;d<T;d++){
            st = new StringTokenizer(br.readLine());
            long a = Long.parseLong(st.nextToken());
            long n = Long.parseLong(st.nextToken());
            long m = Long.parseLong(st.nextToken());

            long[][] arr = {
                {a%m,1%m},
                {0,1%m}
            };
            long[][] res = new long[2][2];

            power(arr,res,n,m);
            pw.println((res[0][0]+res[0][1]-1+m)%m);

        }

        pw.flush();
    }

    public static void power(long[][] arr, long[][] res,long x,long m){
        res[0][0] = 1%m; res[0][1] = 0;
        res[1][0] = 0; res[1][1] = 1%m;

        while(x>0){
            if(x%2 != 0){
                multiply(res,arr,res,m);
            }

            x = x/2;
            if(x>0){
                multiply(arr,arr,arr,m);
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