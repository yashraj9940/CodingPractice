class Solution {
    public int findNumbers(int[] nums) {
        int ans=0;
        for(int i:nums){
            int a=i,j=0;
            while(a>0){
                a=a/10;
                j++;
            }
            if(j%2==0)
            ans++;
        }
        return ans;
        
    }
}