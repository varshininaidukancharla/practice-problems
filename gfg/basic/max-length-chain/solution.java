class Solution {
    public int sumExceptFirstLast(int[] arr) {
        // code here
        int sum=0;
        int n=arr.length;
        for(int i=0;i<n;i++){
            sum+=arr[i];
        }
        return sum-arr[0]-arr[n-1];
    }
}