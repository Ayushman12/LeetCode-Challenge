import java.util.*;
public class CustomSortString
{
    public String customSortString(String order, String str) {
        if(str.length()==0) return "";
        String ans = "",a1="";
        HashMap<Character,String> mp = new HashMap<Character,String>();
        for(int i=0;i<order.length();i++) {
            mp.put(order.charAt(i),"");
        }
        for(int i=0;i<str.length();i++) {
            char c = str.charAt(i);
            if(mp.containsKey(c))
                mp.put(c,mp.get(c)+c);
            else
                ans=ans+c;
        }
        for(int i=0;i<order.length();i++) {
            a1 = a1 + mp.get(order.charAt(i));
        }
        return (a1+ans);
    }
    public static void main()
    {
        CustomSortString ob = new CustomSortString();
        System.out.println(ob.customSortString("adc","asdesfcde"));
    }
}
