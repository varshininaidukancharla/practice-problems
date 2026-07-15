class Solution {
    public int[] countOddEven(int[] arr) {
        // Code here
        int codd = 0;
        int ceven =0;
        for(int i=0;i<arr.length;i++){
            if(arr[i] % 2 != 0){
                codd++;
            }
            else{
                ceven++;
            }
            
        }
        int[] ans = new int[2];
        ans[0]=codd;
        ans[1]=ceven;
        return ans;
    }
}