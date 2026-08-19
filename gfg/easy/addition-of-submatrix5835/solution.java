class Solution {
    public int subMatrixSum(int[][] arr, int x1, int y1, int x2, int y2) {
        // code herex
        x1--;
        y1--;
        x2--;
        y2--;
        int sum=0;
        for(int i=x1;i<=x2;i++){
            for(int j=y1;j<=y2;j++){
                sum+=arr[i][j];
            }
        }
        return sum;
        
    }
}