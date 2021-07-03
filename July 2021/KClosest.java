import java.util.*;
public class KClosest
{
    public List<Integer> findClosestElements(int[] arr, int k, int x) {
        List<Integer> lt = new ArrayList();
        int front=0,rear=arr.length-1;
        while(rear-front>=k){
            if((Math.abs(arr[front]-x))>(Math.abs(arr[rear]-x)))
                front++;
            else
                rear--;
        }
        for(int i=front;i<=rear;i++)
            lt.add(arr[i]);
        return lt;
    }
    public static void main()
    {
        Scanner obj = new Scanner(System.in);
        KClosest ob = new KClosest();
        int n = obj.nextInt();
        int k = obj.nextInt();
        int x = obj.nextInt();
        int ar[] = new int[n];
        for(int i=0;i<n;i++)
        ar[i] = obj.nextInt();
        List<Integer> l = ob.findClosestElements(ar,k,x);
        System.out.print("Closed Integers are : [");
        for(int i=0;i<l.size();i++)
        System.out.print(l.get(i)+",");
        System.out.println("]");
    }
}