import java.util.*;
public class ReshapeMatrix
{
    public int[][] matrixReshape(int[][] mat, int r, int c) {
        int m=mat.length,n=mat[0].length;
        if(m*n!=r*c)
            return mat;
        int p=0,q=0;
        int ans[][] = new int[r][c];
        for(int i=0;i<r;i++) {
            for(int j=0;j<c;j++) {
                if(q>=n) {
                    p++;
                    q=0;
                }
                ans[i][j] = mat[p][q];
                q++;
            }   
        }
        return ans;
    }
    public static void main()
    {
        Scanner obj = new Scanner(System.in);
        ReshapeMatrix ob = new ReshapeMatrix();
        int ar[][] = {{1,2},{3,4}};
        int ans[][] = ob.matrixReshape(ar,1,4);
        System.out.println("["+ans[0][0]+","+ans[0][1]+","+ans[0][2]+","+ans[0][3]+"]");
    }
}