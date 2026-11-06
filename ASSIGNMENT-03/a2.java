import java.util.*;
import java.io.*;

public class a2 {
    public static void main(String[] args)throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        PrintWriter pw = new PrintWriter(System.out);

        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());

        st = new StringTokenizer(br.readLine());
        int[] arr = new int[n];
        for(int i=0;i<n;i++){
            arr[i] = Integer.parseInt(st.nextToken());
        }

        long res = mergeSort(arr,0,n-1);
        
        pw.println(res);
        pw.flush();
    }

    public static long mergeSort(int[] arr, int st, int end){
        if(st<end){
            int mid = st + (end-st)/2;

            long leftCount = mergeSort(arr,st,mid);
            long rightCount = mergeSort(arr, mid+1, end);

            long contCount = countPairs(arr,st,mid,end);
            
            merge(arr,st,mid,end);

            return leftCount+rightCount+contCount;
        }
        return 0;
    }

    public static long countPairs(int[] arr,int left,int mid,int right){
        long count = 0;

        for(int j=mid+1;j<=right;j++){
            long sq = (long) arr[j] * arr[j];

            int lo = left;
            int hi = mid;
            while(lo<=hi){
                int m = lo + (hi-lo)/2;
                if(arr[m]>sq){
                    hi = m-1;
                }
                else{
                    lo = m+1;
                }
            }

            count += (mid-lo+1);
        }

        return count;
    }

    public static void merge(int[] arr,int left,int mid,int right){
        ArrayList<Integer> temp = new ArrayList<>();
        int i=left;
        int j = mid+1;

        while(i<=mid && j<=right){
            if(arr[i]<=arr[j]){
                temp.add(arr[i]);
                i++;
            }
            else{
                temp.add(arr[j]);
                j++;
            }
        }

        while(i<=mid){
            temp.add(arr[i]);
            i++;
        }

        while(j<=right){
            temp.add(arr[j]);
            j++;
        }

        for(int a=0;a<temp.size();a++){
            arr[left+a] = temp.get(a);
        }

    }
}
