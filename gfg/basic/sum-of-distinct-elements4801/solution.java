class Solution {
    int findSum(int[] arr) {
        // code here
        HashSet<Integer> set = new HashSet<>();
        for(int i=0;i<arr.length;i++){
            set.add(arr[i]);
        }
        int sum=0;
        for(int num: set){
            sum+=num;
        }
        return sum;
    }
}