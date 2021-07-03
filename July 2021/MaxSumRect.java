import java.util.*;
import java.io.*;
public class MaxSumRect
{
    public int maxSumSubmatrix(int[][] matrix, int k) {
        int ans = Integer.MIN_VALUE;
        int row = matrix.length;
        int col = matrix[0].length;
        for(int i=0;i<row;i++) {
            int ar[] = new int[col];
            for(int j=i;j<row;j++) {
                for(int z=0;z<col;z++) {
                    ar[z]+=matrix[j][z];
                }
                ans = Math.max(ans,MaxSubarraySum(ar,k));
            }
        }
        return ans;
    }
    public int MaxSubarraySum(int arr[], int k) {
        int right = 0,n=arr.length;
        TreeSet<Integer> bst = new TreeSet<>();
        bst.add(0);
        int ans = Integer.MIN_VALUE;
        for (int i = 0; i < n; ++i) {
            right += arr[i];
            Integer left = bst.ceiling(right - k);
            if (left != null) {
                ans = Math.max(ans, right - left);
            }
            bst.add(right);
        }
        if (ans == Long.MIN_VALUE) 
        return 0;
        return ans;
    }
    /*public int findMaxSubarraySum(int arr[],int K) {
        Set<Integer> cum_set = new HashSet<>();
        cum_set.add(0);
        int max_sum =Integer.MIN_VALUE, cSum = 0,N=arr.length;
        for(int i = 0; i < N; i++) {
            cSum += arr[i];
            ArrayList<Integer> al = new ArrayList<>();
            Iterator<Integer> it = cum_set.iterator();
            int end = 0;
            while (it.hasNext()) {
                end = it.next();
                al.add(end);
            }
            Collections.sort(al);
            int sit = lower_bound(al, cSum - K);
            if (sit != end)
            max_sum = Math.max(max_sum,cSum - sit);
            cum_set.add(cSum);
        }
        return max_sum;
    }
    public int lower_bound(ArrayList<Integer> al,int x) {
        int l = -1, r = al.size();
        while (l + 1 < r) {
            int m = (l + r) >>> 1;
            if (al.get(m) >= x)
            r = m;
            else
            l = m;
        }
        return r;
    }*/
    public static void main()
    {
        //Scanner obj = new Scanner(System.in);
        MaxSumRect ob = new MaxSumRect();
        int k = 3;
        int arr[][] = {{2,2,-1}};
        System.out.println(ob.maxSumSubmatrix(arr,k));
    }
}