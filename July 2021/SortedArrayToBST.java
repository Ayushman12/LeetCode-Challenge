import java.util.*;
public class SortedArrayToBST
{
    public TreeNode sortedArrayToBST(int[] nums) {
        if(nums.length==0) return null;
        return helper(nums,0,nums.length-1);
    }
    private TreeNode helper(int[] nums, int start, int end) {
        if(start>end) return null;
        int mid = start + (end-start)/2;
        TreeNode ans = new TreeNode(nums[mid]);
        ans.left = helper(nums,start,mid-1);
        ans.right = helper(nums,mid+1,end);
        return ans;
    }
    public static void main() 
    {
        SortedArrayToBST ob = new SortedArrayToBST();
        int nums[] = {1,2,4,7,9,14,16,37,88};
        TreeNode node = ob.sortedArrayToBST(nums);
    }
}