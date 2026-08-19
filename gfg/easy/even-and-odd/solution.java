class Solution {
    public int[] reArrange(int[] arr) {
        // code here
        int n=arr.length;
        int[] even = new int[n/2];
        int[] odd = new int[n/2];
        int e=0;
        int o=0;
        for(int i=0;i<n;i++){
            if(arr[i]%2==0){
                even[e++]=arr[i];
            }
            else{
                odd[o++]=arr[i];
            }
        }
        e=0;
        o=0;
        for(int i=0;i<arr.length;i++){
            if(i%2==0){
                arr[i]=even[e++];
            }
            else{
                arr[i]=odd[o++];
            }
        }
        return arr;
    }
}