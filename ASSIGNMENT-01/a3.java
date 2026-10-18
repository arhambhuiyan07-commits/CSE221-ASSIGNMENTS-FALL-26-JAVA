
import java.io.*;

public class a3 {
    public static void main(String[] args)throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        PrintWriter pw = new PrintWriter(System.out);
        int T = Integer.parseInt(br.readLine());

        for(int i=0;i<T;i++){
            long sum = 0;
            long n = Long.parseLong(br.readLine());
            sum = (n*(n+1))/2;
            pw.println(sum);
        }
        pw.flush();
    }
}