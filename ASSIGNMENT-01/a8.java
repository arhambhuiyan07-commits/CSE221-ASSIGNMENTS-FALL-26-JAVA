import java.io.*;
import java.util.*;
public class a8 {
    public static void main(String[] args)throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        PrintWriter pw = new PrintWriter(System.out);
        int N = Integer.parseInt(br.readLine());

        String[][] arr = new String[N][4];

        for(int i=0;i<N;i++){
            StringTokenizer st = new StringTokenizer(br.readLine());

            for(int j=0;j<7;j++){
                if(j == 0){
                    arr[i][0] = st.nextToken();
                }
                else if(j == 4){
                    arr[i][1] = st.nextToken();
                }
                else if(j == 6){
                    arr[i][2] = st.nextToken();
                }
                else{
                    st.nextToken();
                }
            }

            arr[i][3] = Integer.toString(i);
        }

        for(int i=0;i<N;i++){
            int idx = i;
            for(int j=i+1;j<N;j++){

                int temp = arr[idx][0].compareTo(arr[j][0]);
                if(temp>0){
                    idx = j;
                }
                else if(temp == 0){
                    StringTokenizer st1 = new StringTokenizer(arr[idx][2],":");
                    StringTokenizer st2 = new StringTokenizer(arr[j][2],":");

                    int t1 = Integer.parseInt(st1.nextToken()+st1.nextToken());
                    int t2 = Integer.parseInt(st2.nextToken()+st2.nextToken());

                    if(t2>t1){
                        idx = j;
                    }
                    else if(t1 == t2){
                        if (Integer.parseInt(arr[idx][3]) > Integer.parseInt(arr[j][3])) {
                            idx = j;
                    }
                }
            }
        }

           String[] t = arr[idx];
           arr[idx] = arr[i];
           arr[i] = t;  
        }

        for(int i=0;i<N;i++){
            pw.println(arr[i][0]+" will departure for "+arr[i][1]+" at "+arr[i][2]);
        }

        pw.flush();
    }
}
