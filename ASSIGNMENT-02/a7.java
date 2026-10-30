import java.util.*;
import java.io.*;
public class a7 {
    public static void main(String[] args)throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        PrintWriter pw = new PrintWriter(System.out);

        StringTokenizer st1 = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st1.nextToken());
        int k = Integer.parseInt(st1.nextToken());

        StringTokenizer st2 = new StringTokenizer(br.readLine());
        int[] arr = new int[n];
        long left = Integer.MIN_VALUE;
        long right = 0;
        for(int i=0;i<n;i++){
            arr[i] = Integer.parseInt(st2.nextToken());
            if(arr[i]>left){
                left = arr[i];
            }
            right += arr[i];
        }

        while(left<=right){
            long mid = (left+right)/2;
            if(canSplit(arr,mid,k)){
                right = mid-1;
            }
            else{
                left = mid +1;
            }
        }

        pw.println(left);
        pw.flush();
    }

    public static boolean canSplit(int[] arr,long mid, int k){
        long count = 1;
        long curr = 0;
        for(int i=0;i<arr.length;i++){
            curr += arr[i];
            if(curr>mid){
                count ++;
                curr = arr[i];
            }
        }

        if(count>k){
            return false;
        }
        else{
            return true;
        }
    }
}