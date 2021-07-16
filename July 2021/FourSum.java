import java.util.*;
public class FourSum
{
    public List<List<Integer>> threeSum(int[] nums,int x,int target) 
    {   
        List<List<Integer>> Ar = new ArrayList<List<Integer>>();
        int i,f,r,sum,l = nums.length;
        for(i=x;i<l-2;i++)
        {
            if(i==x || (nums[i]!=nums[i-1]))
            {
                f=i+1;
                r=l-1;
                sum=target-nums[i];
                while(f<r)
                {
                    if(nums[f]+nums[r]==sum)
                    {
                        List<Integer> t = new ArrayList<>();
                        t.add(nums[i]);
                        t.add(nums[f]);
                        t.add(nums[r]);
                        Ar.add(t);
                        while(f<r && nums[f]==nums[f+1]) f++;
                        while(f<r && nums[r]==nums[r-1]) r--;
                        f++;
                        r--;
                    }
                    else if(nums[f]+nums[r]<sum) f++;
                    else r--;
                }
            }
        }
        return Ar;
    }
    public List<List<Integer>> fourSum(int[] nums, int target) 
    {
        int i,j,l = nums.length;
        List<List<Integer>> Ar = new ArrayList<List<Integer>>();
        Arrays.sort(nums);
        for(i=0;i<l-3;i++)
        {
            if(i==0 || (i>0 && nums[i]!=nums[i-1]))
            {
                List<List<Integer>> ar = new ArrayList<List<Integer>>();
                ar = threeSum(nums,i+1,target-nums[i]);
                for(j=0;j<ar.size();j++)
                { 
                    List<Integer> ll = new ArrayList<>();
                    ll.add(nums[i]);
                    ll.addAll(ar.get(j));
                    Ar.add(ll);
                }
            }
        }
        return Ar;
    }
    public static void main()
    {
        Scanner obj = new Scanner(System.in);
        FourSum ob = new FourSum();
        System.out.println("Enter size of array : ");
        int size = obj.nextInt();
        int ar[] = new int[size];
        int i;
        System.out.println("Enter values");
        for(i=0;i<size;i++)
        ar[i] = obj.nextInt();
        System.out.println("Enter target :");
        int tr = obj.nextInt();
        List<List<Integer>> res = ob.fourSum(ar,tr);
        for(i=0;i<res.size();i++)
        System.out.print(res.get(i)+",");
    }
}