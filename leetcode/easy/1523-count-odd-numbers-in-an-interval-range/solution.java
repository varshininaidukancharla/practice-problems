class Solution {
    public int countOdds(int low, int high) {
        int count =0;
        for(int i=low;i<=high/2;i++){
            if(i%2 !=0){
                count++;
            }
            
        }
        return count*2;
        
    }
}