import java.io.*;
import java.util.*;

public class a7 {
    public static void main(String[] args)throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        PrintWriter pw = new PrintWriter(System.out);

        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());
        int k = Integer.parseInt(st.nextToken());

        boolean[][] board = new boolean[n+1][m+1];
        int[][] knight_position = new int[k][2];

        for(int i=0;i<k;i++){
            st = new StringTokenizer(br.readLine());
            knight_position[i][0] = Integer.parseInt(st.nextToken());
            knight_position[i][1] = Integer.parseInt(st.nextToken());
            board[knight_position[i][0]][knight_position[i][1]] = true;
        }

        int[] arr1 = {-2,-2,-1,-1,1,1,2,2};
        int[] arr2 = {-1,1,-2,2,-2,2,-1,1};

        boolean found = false;
        for(int i=0;i<k;i++){
            if(found == true){
                break;
            }
            for(int j=0;j<8;j++){
                int row = knight_position[i][0] + arr1[j];
                int col = knight_position[i][1] + arr2[j];
                if(row>=1 && row<=n && col>= 1 && col<=m && board[row][col]){
                    found = true;
                    break;
                }
            }
        }

        if(found){
            pw.println("YES");
        }
        else{
            pw.println("NO");
        }

        pw.flush();
    }
}
