import java.util.*;
public class BeautifulArray
{
    public int[] beautifulArray(int N) {
        ArrayList<Integer> ans = new ArrayList<>();
        ans.add(1);
        while (ans.size() < N) {
            ArrayList<Integer> list = new ArrayList<>();
            for (int i : ans)   {
                if(2*i -1<=N)
                    list.add(i * 2 - 1);
            }
            for (int i : ans) {
                if(2*i <=N)
                    list.add(i * 2);
            }
            ans = list;
        }
        int[] res = new int[N];
        for(int i=0;i<N;i++){
            res[i] = ans.get(i);
        }
        return res;
    }
    public static void main()
    {
        Scanner obj = new Scanner(System.in);
        BeautifulArray ob = new BeautifulArray();
        System.out.println("Enter value of N : ");
        int N = obj.nextInt();
        int arr[] = ob.beautifulArray(N);
        System.out.print("Beautiful Array : [");
        for(int i = 0;i<N;i++) {
            if(i==N-1)
            System.out.println(arr[i]+"]");
            else System.out.print(arr[i]+",");
        }
    }
}
