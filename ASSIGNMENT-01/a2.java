import java.util.*;
import java.io.*;

public class a2 {
    public static void main(String[] args)throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        PrintWriter pw = new PrintWriter(System.out);
        int T = Integer.parseInt(br.readLine());

        for(int i=0;i<T;i++){
            StringTokenizer st = new StringTokenizer(br.readLine());
            long a = 0;
            long b = 0;
            String op = "";

            for(int j=0;j<4;j++){
                if(j == 0){
                    st.nextToken();
                }
                else if(j == 1){
                    a = Long.parseLong(st.nextToken());
                }
                else if(j == 2){
                    op = st.nextToken();
                }
                else if(j == 3){
                    b = Long.parseLong(st.nextToken());
                }
            }

            if(op.equals("+")){
                pw.println(a+b);
            }
            else if(op.equals("-")){
                pw.println(a-b);
            }
            else if(op.equals("*")){
                pw.println(a*b);
            }
            else if(op.equals("/")){
                pw.println((double)a/b);
            }
            else if(op.equals("%")){
                pw.println(a%b);
            }
            else if(op.equals("&")){
                pw.println(a&b);
            }
            else if(op.equals("|")){
                pw.println(a|b);
            }
            else if(op.equals("^")){
                pw.println(a^b);
            }
            else if(op.equals("<<")){
                pw.println(a<<b);
            }
            else if(op.equals(">>")){
                pw.println(a>>b);
            }
        }
        pw.flush();
    }
}
