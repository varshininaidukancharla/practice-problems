class Solution {
    public long[] findElements(long arr[]) {
        // code he        
        int n= arr.length;
        Arrays.sort(arr);
        long[] brr = new long[n-2];
        for(int i=0;i<n-2;i++){
            brr[i]=arr[i];        
            
        }
        return brr;
    }
}