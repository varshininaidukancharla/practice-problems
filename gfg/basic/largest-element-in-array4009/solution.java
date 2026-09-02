class Solution {
    public static int largest(int[] arr) {
        // code here
        int maxe=arr[0];
        for(int i=1;i<arr.length;i++){
            if(arr[i]>maxe){
                maxe= arr[i];
            }
        }
        return maxe;
    }
}
