import java.util.*;
import java.io.*;

public class a1 {
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
        for(int i=0;i<n;i++){
            if(i != (n-1)){
                pw.print(arr[i]+" ");
            }
            else{
                pw.print(arr[i]);
            }
        }

        pw.flush();
    }

    public static long mergeSort(int[] arr, int st, int end){
        if(st<end){
            int mid = st + (end-st)/2;

            long leftCount = mergeSort(arr,st,mid);
            long rightCount = mergeSort(arr, mid+1, end);
            
            long invCount = merge(arr,st,mid,end);

            return leftCount+rightCount+invCount;
        }
        return 0;
    }

    public static long merge(int[] arr,int left,int mid,int right){
        ArrayList<Integer> temp = new ArrayList<>();
        int i=left;
        int j = mid+1;
        long invCount = 0;

        while(i<=mid && j<=right){
            if(arr[i]<=arr[j]){
                temp.add(arr[i]);
                i++;
            }
            else{
                temp.add(arr[j]);
                j++;
                invCount += (mid-i+1);
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

        return invCount;
    }
}
