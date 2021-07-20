import java.util.*;
class ShuffleArray {
     private int nums[];
    private Random r;
    public ShuffleArray(int[] nums) {
        this.nums = nums;
        this.r = new Random();
    }
    
    /** Resets the array to its original configuration and return it. */
    public int[] reset() {
        return nums;
    }
    
    /** Returns a random shuffling of the array. */
    public int[] shuffle() {
        int a[] = nums.clone();
        for(int i = 0;i<a.length;i++) {
            int r1 = r.nextInt(a.length);
            int temp = a[i];
            a[i] = a[r1];
            a[r1] = temp;
        }
        return a;
    }
}