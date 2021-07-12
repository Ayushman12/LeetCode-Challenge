import java.util.*;
public class IsomorphicStrings
{
    public boolean isIsomorphic(String s, String t) {
        if(s.length()!=t.length()) return false;
        HashMap<Character,Character> h1 = new HashMap();
        HashSet<Character> h2 = new HashSet();
        for(int i=0;i<s.length();i++) {
            char c1 = s.charAt(i);
            char c2 = t.charAt(i);
            if(h1.containsKey(c1)) {
                if(h1.get(c1)!=c2) return false;
            }
            else {
                if(h2.contains(c2)) return false;
                else {
                    h1.put(c1,c2);
                    h2.add(c2);
                }
            }
        }
        return true;
    }
    public static void main()
    {
        IsomorphicStrings ob = new IsomorphicStrings();
        System.out.println(ob.isIsomorphic("egg","add"));
    }
}
