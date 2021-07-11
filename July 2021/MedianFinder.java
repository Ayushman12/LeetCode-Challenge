import java.util.*;
class MedianFinder {
    private PriorityQueue<Integer> mxHp = null;
    private PriorityQueue<Integer> mnHp = null;
    public MedianFinder() {
        mxHp = new PriorityQueue<Integer>((a,b) -> (b-a));
        mnHp = new PriorityQueue<Integer>((a,b) -> (a-b));
    }
    public void addNum(int num) {
        if(mxHp.size() == 0 || mxHp.peek()>=num) mxHp.offer(num);
        else mnHp.offer(num);
        if(mxHp.size() - mnHp.size() >1) mnHp.offer(mxHp.poll());
        else if(mnHp.size() - mxHp.size() >1) mxHp.offer(mnHp.poll());
    }
    public double findMedian() {
        if(mxHp.size()> mnHp.size()) return mxHp.peek();
        else if(mxHp.size()< mnHp.size()) return mnHp.peek();
        else return (mxHp.peek()  + mnHp.peek())/2.0;
    }
}