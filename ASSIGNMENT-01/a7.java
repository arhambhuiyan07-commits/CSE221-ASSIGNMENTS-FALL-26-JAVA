import java.util.*;
import java.io.*;
public class a7 {
    public static void main(String[] args)throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        PrintWriter pw = new PrintWriter(System.out);
        int T = Integer.parseInt(br.readLine());

        for(int a=0;a<T;a++){
            int n = Integer.parseInt(br.readLine());
            int[] id = new int[n];
            int[] marks = new int[n];

            StringTokenizer st1 = new StringTokenizer(br.readLine());

            for(int b=0;b<n;b++){
                id[b] = Integer.parseInt(st1.nextToken());
            }

            StringTokenizer st2 = new StringTokenizer(br.readLine());

            for(int c=0;c<n;c++){
                marks[c] = Integer.parseInt(st2.nextToken());
            }

            int counter = 0;
            for(int i=0;i<n;i++){
                int idx = i;
                boolean val = false;
                for(int j=i+1;j<n;j++){
                    if(marks[idx]<marks[j]){
                        val = true;
                        idx = j;
                    }
                    else if(marks[idx]==marks[j] && id[idx]>id[j]){
                        val = true;
                        idx = j;
                    }
                }

                if(val){
                    int temp1 = id[i] ;
                    id[i] = id[idx];
                    id[idx] = temp1;

                    int temp2 = marks[i];
                    marks[i] = marks[idx];
                    marks[idx] = temp2;

                    counter++;
                }
            }

            pw.println("Minimum swaps: "+counter);
            for(int k=0;k<n;k++){
                pw.println("ID: "+id[k]+" Mark: "+marks[k]);
            }
        }

        pw.flush();
    }
}