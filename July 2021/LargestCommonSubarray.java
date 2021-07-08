import java.util.*;
import java.lang.Math;
public class LargestCommonSubarray
{
    public int findLength(int[] nums1, int[] nums2) {
        int ar[][] = new int[nums1.length+1][nums2.length+1],ans=0;
        for(int i=1;i<ar.length;i++) {
            for(int j=1;j<ar[0].length;j++) {
                if(nums1[i-1]==nums2[j-1])
                ar[i][j] = ar[i-1][j-1]+1;
                ans = Math.max(ans,ar[i][j]);
            }
        }
        return ans;
    }
    public static void main() {
        int nums1[] ={1,2,3,2,1}, nums2[] = {3,2,1,4,7};
        LargestCommonSubarray ob = new LargestCommonSubarray();
        System.out.println(ob.findLength(nums1,nums2));
    }
}
