class Solution {
    public ArrayList<Integer> minAnd2ndMin(int[] arr) {

        int small = Integer.MAX_VALUE;
        int ssmall = Integer.MAX_VALUE;

        for (int i = 0; i < arr.length; i++) {

            if (arr[i] < small) {
                ssmall = small;
                small = arr[i];
            }
            else if (arr[i] > small && arr[i] < ssmall) {
                ssmall = arr[i];
            }
        }

        ArrayList<Integer> ans = new ArrayList<>();

        if (ssmall == Integer.MAX_VALUE) {
            ans.add(-1);
        }
        else {
            ans.add(small);
            ans.add(ssmall);
        }

        return ans;
    }
}