class Solution {
    public static int maxProduct(int[] arr) {
        // code here
        Arrays.sort(arr);
        int mp = arr[arr.length-1]*arr[arr.length-2];
        return mp;
    }
    
}
