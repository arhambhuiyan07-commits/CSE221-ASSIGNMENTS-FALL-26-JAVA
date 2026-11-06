import java.util.*;
import java.io.*;

public class a3 {
    public static void main(String[] args)throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        PrintWriter pw = new PrintWriter(System.out);

        StringTokenizer st = new StringTokenizer(br.readLine());
        long a = Long.parseLong(st.nextToken());
        long b = Long.parseLong(st.nextToken());
        long m = 107;

        long res = power(a,b,m);
        pw.println(res);
        pw.flush();
    }

    public static long power(long a, long b, long m){
        long res = 1;
        a = a % m;
        while(b > 0){
            if(b % 2 == 1){
                res = (res * a) % m;
            }

            a = (a*a)%m;
            b = b/2;
        }

        return res;
    }
}