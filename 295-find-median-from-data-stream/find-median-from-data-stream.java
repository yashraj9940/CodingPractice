class MedianFinder {
    PriorityQueue<Integer> low;
    PriorityQueue<Integer> high;

    public MedianFinder() {
         low=new PriorityQueue<>((a,b)->(b-a));
         high=new PriorityQueue<>((a,b)->(a-b));
    }
    
    public void addNum(int num) {
        low.offer(num);
        high.offer(low.poll());
        if(high.size()>low.size()+1){
            low.add(high.poll());
        }
    }
    
    public double findMedian() {
        if((high.size()+low.size())%2==0){
 return (high.peek()+low.peek())/2.0;
        }
        
        return high.peek();
        
    }
}

/**
 * Your MedianFinder object will be instantiated and called as such:
 * MedianFinder obj = new MedianFinder();
 * obj.addNum(num);
 * double param_2 = obj.findMedian();
 */