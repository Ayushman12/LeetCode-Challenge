import java.util.*;
public class KthSmallMatrix
{
    public int kthSmallest(int[][] matrix, int k) {
        PriorityQueue<Integer> pq = new PriorityQueue(Collections.reverseOrder());
        int n = matrix.length;
        for(int i=0;i<n*n;i++){
            pq.add(matrix[i/n][i%n]);
            if(pq.size()>k){
                pq.poll();
            }
        }
        return pq.peek();
    }
    public static void main()
    {
        KthSmallMatrix ob = new KthSmallMatrix();
        int matrix[][] = {{1,5,9},{10,11,13},{12,13,15}}, k = 8;
        System.out.println(ob.kthSmallest(matrix,k));
    }
}