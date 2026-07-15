class Solution {
    public int minValueToBalance(List<Integer> arr) {
        // code here
        int n = arr.size();
        int mid = n/2;
        int left = 0;
        int right = 0;
        for(int i=0;i<=mid-1;i++){
            left+=arr.get(i);
        }
        for(int j=mid;j<n;j++){
            right += arr.get(j);
        }
        return Math.abs(left-right);
    }
}