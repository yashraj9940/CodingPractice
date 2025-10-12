class Node {
   Integer val;
   Integer count;
   Node(){}
   Node(Integer val,Integer count){
       this.val=val;
       this.count=count;
   }
    Node(Integer val){
        this.val=val;
    }

        
    }

class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        PriorityQueue<Node> a=new PriorityQueue<Node>((aa,b)->( b.count-aa.count));
        Map<Integer,Integer> b=new HashMap<Integer,Integer>();
        for(Integer i:nums){
            b.put(i,(b.getOrDefault(i,0)+1));
        }
        for(int i: b.keySet()){
            a.offer(new Node(i,b.get(i)));
       //       System.out.println("i="+i+"a="+a);
        }
        int[] ans=new int[k];
        int i=0;
       //  System.out.println("i="+i+"ss="+a.isEmpty()+"aa"+((i>=k) && (!a.isEmpty())));
        while((i<k) && (!a.isEmpty())){
            ans[i]=a.poll().val;
            i++;
         //   System.out.println("a="+ans[i]);
        }
        return ans;
    }
}