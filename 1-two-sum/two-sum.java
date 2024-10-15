class Solution {
    public int[] twoSum(int[] nums, int target) {
        int i=0;
        Map<Integer,Integer> hm=new HashMap<>();
        for(int a:nums){
            if(hm.containsKey(target-a)){
                return new int[]{hm.get(target-a),i};
            }
            else
            {
                hm.put(a,i++);
            }




        }
        return null;
    }
}