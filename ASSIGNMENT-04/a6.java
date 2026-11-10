import java.io.*;
import java.util.*;

public class a6 {
    public static void main(String[] args)throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        PrintWriter pw = new PrintWriter(System.out);

        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());

        st = new StringTokenizer(br.readLine());
        int i = Integer.parseInt(st.nextToken());
        int j = Integer.parseInt(st.nextToken());

        int[] arr1 = {-1,-1,-1,0,0,1,1,1};
        int[] arr2 = {-1,0,1,-1,1,-1,0,1};

        ArrayList<Integer> list = new ArrayList<>();
        int count = 0;

        for(int a=0;a<8;a++){
            int row = i + arr1[a];
            int col = j + arr2[a];

            if(row>=1 && col>=1 && row<= n && col<=n){
                list.add(row);
                list.add(col);
                count++;
            }
        }

        pw.println(count);
        for(int b=0;b<list.size();b+=2){
            pw.println(list.get(b)+" "+list.get(b+1));
        }

        pw.flush();
    }
}