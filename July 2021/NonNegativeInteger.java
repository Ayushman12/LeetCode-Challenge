import java.util.*;
public class NonNegativeInteger
{
    public int findIntegers(int n) {
        if(n==1) return 2;
        if(n==2 || n==3) return 3;
        StringBuilder sb=new StringBuilder(Integer.toBinaryString(n)).reverse();
        n=sb.length();
        int []endZero=new int[n];
        endZero[0]=1;
        endZero[1] = 2;
        for(int i=2;i<n;i++){
            endZero[i]=endZero[i-1]+endZero[i-2];
        }
        int ans=endZero[n-1]+endZero[n-2];       
        for(int i=n-2;i>=0;i--){
            if(sb.charAt(i)=='1' && sb.charAt(i+1)=='1')
                break;
            if(sb.charAt(i)=='0' && sb.charAt(i+1)=='0') {
                if(i==0) ans-=1;
                else ans-=endZero[i-1];
            }
        }
        return ans;
    }
    public static void main()
    {
        NonNegativeInteger ob = new NonNegativeInteger();
        System.out.println(ob.findIntegers(55));
    }
}
