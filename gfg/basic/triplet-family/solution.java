class Solution {
    public boolean findTriplet(int[] arr) {
        // code here
        HashSet<Integer> set = new HashSet<>();
        for(int x:arr){
            set.add(x);
        }
        for(int i=0;i<arr.length-1;i++){
            for(int j=i+1;j<arr.length;j++){
                int sum=arr[i]+arr[j];
                if(set.contains(sum)){
                    return true;
                }
            }
        }
        return false;
        
    }
}