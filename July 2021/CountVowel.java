import java.util.*;
public class CountVowel
{
    HashMap<String,Long> mp = new HashMap();
    int m = 1000000007;
    public int countVowelPermutation(int n) {
        long ans = 0;
        char[] ar = {'a','e','i','o','u'};
        for(char c:ar)  {
            ans = (ans + nextPermutations(c,n-1))%m;
        }
        return (int)ans;
    }
    public long nextPermutations(char ch,int n)
    {
        if(n==0) return 1;
        String k = ""+ch+n;
        if(mp.containsKey(k)) return mp.get(k);
        long ans = 0;
        if(ch=='a') ans = (nextPermutations('e',n-1))%m;
        else if(ch=='e') ans = (nextPermutations('a',n-1) + nextPermutations('i',n-1))%m;
        else if(ch=='i') ans = (nextPermutations('a',n-1) + nextPermutations('e',n-1) + nextPermutations('o',n-1) + nextPermutations('u',n-1))%m;
        else if(ch=='o') ans = (nextPermutations('i',n-1) + nextPermutations('u',n-1))%m;
        else if(ch=='u') ans = (nextPermutations('a',n-1))%m;
        mp.put(k,ans);
        return ans;
    }
    public static void main()
    {
        Scanner obj = new Scanner(System.in);
        int n = obj.nextInt();
        CountVowel ob = new CountVowel();
        System.out.println("Total number of strings are :"+ob.countVowelPermutation(n));
    }
}