class Solution {
    public int missingNumber(int[] nums) {
        int max=nums[0];
        for(int i=0;i<nums.length;i++){
            if(nums[i]>max){
                max = nums[i];
            }
        }
        HashSet<Integer> set = new HashSet<>();
        for(int numy:nums){
            set.add(numy);
        }
        
        for(int i=0;i<=nums.length;i++){
            if(!set.contains(i)){
                return i;
            }

        }
        
        return -1;
    }
}