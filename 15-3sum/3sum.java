class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        Arrays.sort(nums);
        int len=nums.length;
        List<List<Integer>> ans=new ArrayList<List<Integer>>();
        for(int i=0;i<len-2;i++){
           int j=i+1,k=len-1;
           while(j<k){
               int sum=nums[i]+nums[j]+nums[k];
               if(sum==0){
                     ArrayList<Integer> a=new ArrayList<>();
                     a.add(nums[i]); a.add(nums[j]);a.add(nums[k]);
                     ans.add(a);

                      // Skip duplicate elements for j
                    while (j < k && nums[j] == nums[j + 1]) {
                        j++;
                    }

                    // Skip duplicate elements for k
                    while (j < k && nums[k] == nums[k - 1]) {
                        k--;
                    }
                   j++;
                   k--; continue;      
               }
               else if(sum<0){
                j++;
               }
               else{
                k--;
               }
            }  while (i<len-2 && nums[i] == nums[i + 1]) {
                i++;
            }  
                      }
                           return ans;
       }
   
        
    }
