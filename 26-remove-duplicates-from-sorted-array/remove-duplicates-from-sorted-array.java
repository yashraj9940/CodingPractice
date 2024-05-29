class Solution {
    public int removeDuplicates(int[] nums) {
        Set<Integer> a=new LinkedHashSet<Integer>();

       // a.addAll(nums);

          for (int t : nums) { 
            // Add each element into the set 
            a.add(t); 
        } 

        int j=0;
        for(Integer i:a){
            nums[j++]=i;
        }
        return a.size();
        
    }
}