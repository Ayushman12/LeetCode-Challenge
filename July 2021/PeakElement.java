import java.util.*;
public class PeakElement
{
    public int findPeakElement(int[] nums) {
        if(nums.length==1) return 0;
        if(nums[0]>nums[1]) return 0;
        if(nums[nums.length-1]>nums[nums.length-2]) return nums.length-1;
        for(int i=1;i<nums.length;i++) {
            if(nums[i]>nums[i-1] && nums[i]>nums[i+1])
                return i;
        }
        return 0;
    }
    public static void main() 
    {
        PeakElement ob = new PeakElement();
        int ar[] = {1,2,3,5,1};
        System.out.println(ob.findPeakElement(ar));
    }
}