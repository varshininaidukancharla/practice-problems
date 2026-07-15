class Solution {
    public static boolean isPalindrome(int[] arr) {
        int first = 0;
        int last = arr.length - 1;

        while (first < last) {
            if (arr[first] != arr[last]) {
                return false;
            }
            first++;
            last--;
        }

        return true;
    }
}