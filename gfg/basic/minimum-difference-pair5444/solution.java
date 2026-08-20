class Solution {
    public int minDiff(int[] arr) {
        // code here
        Arrays.sort(arr);
        int mini = Integer.MAX_VALUE;
        for(int i=1;i<arr.length;i++){
            mini=Math.min(mini,arr[i]-arr[i-1]);
        }
        return mini;
    }
}