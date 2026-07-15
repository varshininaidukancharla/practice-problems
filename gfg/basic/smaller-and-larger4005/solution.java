class Solution {
    int[] getMoreAndLess(int[] arr, int target) {
        // code here
        int[] ans = new int[2];
        int c1= 0;
        int c2 = 0;
        for(int i=0;i<arr.length;i++){
            if(arr[i]<=target){
                c1++;
            }
            if(arr[i]>=target){
                c2++;
            }
        }
        ans[0]=c1;
        ans[1]=c2;
        return ans;
    }
}