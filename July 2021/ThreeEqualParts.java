import java.util.*;
public class ThreeEqualParts
{
    public int[] threeEqualParts(int[] arr) {
        int count=0;
        for(int i:arr) {
            count+=i;
        }
        if(count==0) return new int[]{0,arr.length-1};
        int ans[] = {-1,-1};
        if(count%3!=0)
            return ans;
        count=count/3;
        int x[] = new int[3];
        int y=0,z=0;
        for(int i=0;i<arr.length;i++) {
            if(arr[i]==1 ){
                if(y%count==0){
                    x[z]=i;
                    z++;
                }
                y++;
            }
        }
        while(x[2]<arr.length){
            if(arr[x[0]]==arr[x[1]] && arr[x[1]]==arr[x[2]]) {
                x[0]++;
                x[1]++;
                x[2]++;
            }
            else
                return ans;
        }
        return new int[]{x[0]-1,x[1]};
    }
    public static void main()
    {
        ThreeEqualParts ob = new ThreeEqualParts();
        int ans[] = ob.threeEqualParts(new int[]{0,1,1,0,1});
        System.out.println("Answer : ["+ans[0]+","+ans[1]+"]");
    }
}
