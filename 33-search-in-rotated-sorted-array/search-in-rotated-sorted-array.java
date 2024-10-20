class Solution {
    public int search(int[] nums, int target) {
        HashMap<Integer,Integer> resultmap=new HashMap<>();
        for(int i=0;i<nums.length;i++){
            resultmap.put(nums[i],i);
        }
        if (resultmap.containsKey(target)){
            return resultmap.get(target);
        }else{
            return -1;
        }
    }
}