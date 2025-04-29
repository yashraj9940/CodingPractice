class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        HashMap<Integer,Integer> a=new HashMap<>();
        for(int i=0;i<nums.length;i++){
            a.put(nums[i],a.getOrDefault(nums[i],0)+1);
        }
        Queue <Integer> q=new PriorityQueue<>( (b,c)->(a.get(b)-a.get(c)));

        for(int i: a.keySet()){
            q.add(i);
            if(q.size()>k)
                q.poll();
          
        }
        int[] ans=new int[k];

        for(int i=0;i<k;i++){
            ans[i]=q.poll();
        }

        return ans;
        
    }
}