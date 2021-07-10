import java.util.*;
public class IncSubsequence
{
    public int lengthOfLIS(int[] nums) {
        TreeSet<Integer> ts = new TreeSet();
        for(int i:nums) {
            if(ts.ceiling(i)==null)
                ts.add(i);
            else {
                ts.remove(ts.ceiling(i));
                ts.add(i);
            }
        }
        return ts.size();
    }
    public static void main()
    {
        IncSubsequence ob = new IncSubsequence();
        int arr[] = {10,9,5,2,3,5,124,17};
        System.out.println(ob.lengthOfLIS(arr));
    }
}
