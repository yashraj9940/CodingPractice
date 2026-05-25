class Solution {
    public int[] twoSum(int[] numbers, int target) {
        int i=0,j=numbers.length-1;
        while(i<j){
            int m=i+(j-i)/2;
            if(numbers[i]+numbers[j]==target){
                return new int[]{i+1,j+1};
            }
            else if(numbers[i]+numbers[j]>target ){
                j--;
            }
            else
            i++
            ;
        }
        return null;
        
    }
}