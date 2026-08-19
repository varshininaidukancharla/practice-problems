class Solution {
    public int firstIndex(int arr[]) {
        // code here
        int ans=-1;
        for(int i=0;i<arr.length;i++){
            if(arr[i]==1){
                ans=i;
                break;
            }
        }
        return ans;
    }
}