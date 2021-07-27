import java.util.*;
public class Closest3
{
    public int threeSumClosest(int[] nums, int target) 
    {   
        Arrays.sort(nums);
        int i,j,k,sum,l = nums.length;
        int ans = 0,a = Integer.MAX_VALUE;
        for(i=0;i<l-2;i++)
        {
            j = i+1;
            k = l-1;
            while(j<k)
            {
                sum = nums[i]+nums[j]+nums[k];
                int diff = Math.abs(sum-target);
                if(diff<a)
                {
                    a = diff;
                    ans = sum;
                }
                if(sum==target)
                return sum;
                else if(sum>target)
                k--;
                else
                j++;
            }
        }
        return ans;
    }
    public static void main()
    {
        Scanner obj = new Scanner(System.in);
        Closest3 ob = new Closest3();
        System.out.println("Enter the size of array :");
        int size = obj.nextInt();
        int i;
        int ar[] = new int[size];
        System.out.println("Enter array elements:");
        for(i=0;i<size;i++)
        ar[i] = obj.nextInt();
        System.out.println("Enter target");
        int t = obj.nextInt();
        int result = ob.threeSumClosest(ar,t);
        System.out.println("The sum that is closest to the target is "+result);
    }
}