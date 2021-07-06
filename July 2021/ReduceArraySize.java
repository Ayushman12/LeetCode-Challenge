import java.util.*;
public class ReduceArraySize
{
    public int minSetSize(int[] arr) {
        Map<Integer,Integer> mp  = new HashMap();
        for(int i:arr){
            mp.put(i,mp.getOrDefault(i,0)+1);
        }
        List<Integer> lt = new ArrayList<>(mp.values());
        Collections.sort(lt,Collections.reverseOrder());
        int i=0;
        int n = arr.length;
        int tn = arr.length;
        while(tn>n/2) {
            tn = tn - lt.get(i);
            i++;
        }
        return i;
    }
    public static void main()
    {
        ReduceArraySize ob = new ReduceArraySize();
        int ar[] = {3,3,3,3,5,5,5,2,2,7};
        System.out.println("No of elements removed : "+ob.minSetSize(ar));
    }
}