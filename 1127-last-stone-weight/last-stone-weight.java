class Solution {
    public int lastStoneWeight(int[] stones) {
        PriorityQueue<Integer> h=new PriorityQueue<>(Collections.reverseOrder());
        for(int i: stones){
            h.offer(i);
        }
        while(h.size()>1){
            int a=h.poll();
            int b=h.poll();
            int c=a-b;
            h.offer(c);
        }
        if(h.size()==0)
            return 0;
        
        return h.poll();





    }
}