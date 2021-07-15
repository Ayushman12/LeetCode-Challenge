import java.util.*;
public class ValidTriangles
{
    public int triangleNumber(int[] nums) {
        int ans  = 0;
        if (nums.length < 3) return ans;
        Arrays.sort(nums);
        for (int i = 2; i < nums.length; i++) {
            int left = 0, right = i - 1;
            while (left < right) {
                if (nums[left] + nums[right] > nums[i]) {
                ans += (right - left);
                right--;
                }
                else {
                    left++;
                }
            }
        }
        return ans;
    }
    public static void main() {
        ValidTriangles ob = new ValidTriangles();
        int ar[] = {2,4,8,7,9,1,4,5,8};
        System.out.println(ob.triangleNumber(ar));
    }
}
