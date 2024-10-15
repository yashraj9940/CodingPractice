    class Solution {
        public boolean containsDuplicate(int[] nums) {
            Set<Integer> a=new HashSet<Integer>();
            for(int i:nums){
                a.add(i);
            }
            return a.size()<nums.length;
            
        }
    }