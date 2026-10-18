import java.io.*;
public class a1{
    public static void main(String[] args)throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        PrintWriter pw = new PrintWriter(System.out);
        int n = Integer.parseInt(br.readLine());
        for(int i=0;i<n;i++){
            int num = Integer.parseInt(br.readLine());
            if(num % 2 == 0){
                pw.println(num+" is an Even number.");
            }
            else{
                pw.println(num+" is an Odd number.");
            }
        }
        pw.flush();
    }
}