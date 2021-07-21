import java.util.*;
import java.lang.Math;
public class PushDominoes
{
    public String pushDominoes(String dominoes) {
        int n = dominoes.length();
        int L[] = new int[n];
        int current = -1;
        for(int i=n-1;i>=0;i--) {
            if(dominoes.charAt(i)=='L')
                current = i;
            else if(dominoes.charAt(i)=='R')
                current = -1;
            L[i] = current;
        }
        int R[] = new int[n];
        int curr = -1;
        for(int i=0;i<n;i++) {
            if(dominoes.charAt(i)=='L')
                curr = -1;
            else if(dominoes.charAt(i)=='R')
                curr = i;
            R[i]  = curr;
        }
        char ans[] = new char[n];
        for(int i =0;i<n;i++) {
            if(dominoes.charAt(i)=='.') {
                int ld = L[i]==-1 ? Integer.MAX_VALUE : Math.abs(L[i]-i);
                int rd = R[i]==-1 ? Integer.MAX_VALUE : Math.abs(R[i]-i);
                if(ld==rd)
                    ans[i]='.';
                else if(ld<rd)
                    ans[i]='L';
                else if(ld>rd)
                    ans[i] = 'R';
            }
            else
                ans[i] = dominoes.charAt(i);
        }
        return new String(ans);
    }
    public static void main() {
        PushDominoes ob = new PushDominoes();
        System.out.println(ob.pushDominoes("..LLL..RL.R.L.LR.L....R."));
    }
}
