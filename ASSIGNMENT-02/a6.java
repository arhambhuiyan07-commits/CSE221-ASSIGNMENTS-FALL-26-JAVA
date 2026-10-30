import java.util.*;
import java.io.*;
public class a6 {
    public static void main(String[] args)throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        PrintWriter pw = new PrintWriter(System.out);

        StringTokenizer st1 = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st1.nextToken());
        int q = Integer.parseInt(st1.nextToken());

        StringTokenizer st2 = new StringTokenizer(br.readLine());
        int[] arr = new int[n];
        for(int a=0;a<n;a++){
            arr[a] = Integer.parseInt(st2.nextToken());
        }

        for(int i=0;i<q;i++){
            StringTokenizer st3 = new StringTokenizer(br.readLine());
            int lower = Integer.parseInt(st3.nextToken());
            int upper = Integer.parseInt(st3.nextToken());
            int num1 = find_lower_bound(arr,lower);
            int num2 = find_upper_bound(arr,upper);

            pw.println(num2-num1);
        }

        pw.flush();
    }

    public static int find_lower_bound(int[] arr,int lower){
        int l = 0;
        int r = arr.length-1;
        int ans = arr.length;
        while(l<=r){
            int mid = (l+r)/2;
            if(arr[mid]>=lower){
                r = mid-1;
                ans = mid;
            }
            else{
                l = mid+1;
            }
        }
        return ans;
    }

    public static int find_upper_bound(int[] arr,int upper){
        int l = 0;
        int r = arr.length-1;
        int ans = arr.length;
        while(l<=r){
            int mid = (l+r)/2;
            if(arr[mid]>upper){
                r = mid-1;
                ans = mid;
            }
            else{
                l = mid+1;
            }
        }
        return ans;
    }
}