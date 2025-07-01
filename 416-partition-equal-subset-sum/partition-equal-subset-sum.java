class Solution {
    public boolean canPartition(int[] nums) {
        int sum=0;
        for(int i:nums){
            sum+=i;
        }
        if(sum%2==1)
        return false;

        sum=sum/2;
        int size=nums.length;
        
        boolean[][] a=new boolean[size+1][sum+1];
        for(int i=0;i<size;i++){
            for(int j=0;j<sum;j++){
                if(i==0){
                    a[i][j]=false;
                }
                 if(j==0){
                    a[i][j]=true;
                }
            }
        }

        for(int i=1;i<=size;i++){
            for(int j=0;j<=sum;j++){
                if(nums[i-1]<=j){
                    a[i][j]=    a[i-1][j]     ||   a[i-1][j-nums[i-1]];
                }
                else
                    a[i][j]=a[i-1][j];


         }
        }

        return a[size][sum];


        
    }
}