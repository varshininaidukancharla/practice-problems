class Solution {
    public int maximumCount(int[] nums) {
        int codd =0;
        int ceven = 0;
        for(int i=0;i<nums.length;i++){
            if(nums[i]>0){
                ceven++;
            }
            if(nums[i]<0){
                codd++;
            }
        }
        return Math.max(ceven,codd);
        
    }
}