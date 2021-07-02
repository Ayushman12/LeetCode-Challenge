import java.util.*;
public class GrayCode
{
    public List<Integer> grayCode(int n) {
        List<Integer> ans = new ArrayList();
        ans.add(0);
        if(n==0)
            return ans;
        ans.add(1);
        int p=2;
        for(int i=2;i<=n;i++){
            for(int j=ans.size()-1;j>=0;j--){
                ans.add(p+ans.get(j));
            }
            p*=2;
        }
        return ans;
    }
    public static void main()
    {
        Scanner obj = new Scanner(System.in);
        GrayCode ob = new GrayCode();
        int n = obj.nextInt();
        List<Integer> l = ob.grayCode(n);
        System.out.print("GrayCode : [");
        for(int i=0;i<l.size();i++)
        System.out.print(l.get(i)+",");
        System.out.println("]");
    }
}