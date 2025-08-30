class MedianFinder {
    PriorityQueue<Integer> max = new PriorityQueue<>((a,b)->b-a);
    PriorityQueue<Integer> min = new PriorityQueue<>((a,b)->a-b );
    public MedianFinder() {
        
    }
    
    public void addNum(int num) {
        max.offer(num);
        min.offer(max.poll());
        if(min.size()>max.size()){
            max.offer(min.poll());
        }
    }
    
    public double findMedian() {
        if (max.size()>min.size()) return max.peek();
        return (max.peek()+min.peek())/2d;
    }
}

/**
 * Your MedianFinder object will be instantiated and called as such:
 * MedianFinder obj = new MedianFinder();
 * obj.addNum(num);
 * double param_2 = obj.findMedian();
 */