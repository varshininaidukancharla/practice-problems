class Solution {
    public int moreFrequent(List<Integer> arr, int x, int y) {
        // code here
        int countx = 0;
        int county = 0;
        for(int i=0;i<arr.size();i++){
            if (arr.get(i)==x){
                countx++;
            }
            if(arr.get(i)==y){
                county++;
            }
        }
        if(countx==county){
            if(x<y){
                return x;
            }
            else{
                return y;
            }
        }
        else if(countx>county){
            return x;
        }
        else{
            return y;
        }
    }
}