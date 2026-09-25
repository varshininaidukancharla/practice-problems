class Solution {
    public int getSecondLargest(int[] arr) {
        // code here
        int n=arr.length;
        int larg =-1;
        int slarg = -1;
        for(int i=0;i<n;i++){
            if(arr[i]>larg){
                larg = arr[i];
            }
        }
        for(int i=0;i<n;i++){
            if(arr[i]>slarg && arr[i]!=larg){
                slarg = arr[i];
            }
        }
        return slarg;
    }
}