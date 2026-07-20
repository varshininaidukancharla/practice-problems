class Solution {
    public int numIdenticalPairs(int[] nums) {
        HashMap<Integer,Integer> map = new HashMap<>();
        int count=0;
        for(int num:nums){
            int fre = map.getOrDefault(num,0);
            count+=fre;
            map.put(num,fre+1);
        } 
        return count;
        
    }
}