import java.util.*;
import java.util.stream.Collectors; 
public class ArrayPartition
{
    private int len=0;
    private List<Integer> left = new ArrayList();
    private int partition(int[] arr) {
        List<Integer> list = Arrays.stream(arr).boxed().collect(Collectors.toList());
        int N = list.size();
        int minIndex = list.indexOf(Collections.min(list));
        if(minIndex==0)
            left.add(arr[0]);
        else
            left.addAll(list.subList(0,minIndex));
        int max = Collections.max(left);
        int min = Collections.min(list.subList(minIndex+1,N));
        if(max<=min) {
            len =  minIndex+1;
            return len;
        }
        else {
            
            list = list.subList(minIndex+1,N);
            len =  len + minIndex + 1 + partition(list.parallelStream().mapToInt(Integer::intValue).toArray());
            return len;
        }
    }
    public int partitionDisjoint(int[] nums) {
        if(nums.length==2) return 1;
        else return (partition(nums));
    }
    public static void main() 
    {
        ArrayPartition ob = new ArrayPartition();
        int num[] = {5,0,3,8,6};
        System.out.println(ob.partitionDisjoint(num));
    }
}
