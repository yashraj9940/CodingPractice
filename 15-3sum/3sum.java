class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        Arrays.sort(nums);
        List<List<Integer>> ans=new ArrayList<List<Integer>>();
        int len=nums.length;
        for(int i=0;i<len-2;i++){
           

            int l=i+1,h=len-1;;
            while(l<h && nums[i]<=0){
                int sum=nums[i]+nums[l]+nums[h];
                if(sum==0 ){
                   List<Integer> a=new ArrayList<Integer>();
                   //a.add(i);a.add(l);a.add(h);
                     a.add(nums[i]);a.add(nums[l]);a.add(nums[h]);
                  //   if(!ans.contains(a))
                   ans.add(a);

                    // Skip duplicate elements for j
                    while (l < h && nums[l] == nums[l + 1]) {
                        l++;
                    }

                    // Skip duplicate elements for k
                    while (l < h && nums[h] == nums[h - 1]) {
                        h--;
                    }
                   l++;
                   h--; continue;                  
                }
                else if(sum>0){
                        h--;
                }
                else{
                    l++;
                }           
            }   

              while (i<len-2 && nums[i] == nums[i + 1]) {
                i++;
            }

        }
        return ans;
        
    }
}