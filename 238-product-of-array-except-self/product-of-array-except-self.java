class Solution {
    public int[] productExceptSelf(int[] nums) {
        int l=nums.length;
        int s[]=new int[l];
        int[] p=new int[l];

        s[l-1]=nums[l-1];
        for(int i=l-2;i>=0;i--){
            s[i]=s[i+1]*nums[i];
        }
         p[0]=nums[0];
        for(int i=1;i<l;i++){
            p[i]=p[i-1]*nums[i];
        }
        int a[]=new int[l];
        a[0]=s[1];
        a[l-1]=p[l-2];
        for(int i=1;i<l-1;i++){
            a[i]=p[i-1]*s[i+1];
        }

        return a;


        
    }
}