class Solution {
    public static boolean isPalinArray(int[] arr) {
        // code here.
      

        for (int num : arr) {
            int original = num;
            int rev = 0;

            while (num > 0) {
                int digit = num % 10;
                rev = rev * 10 + digit;
                num /= 10;
            }

            if (original != rev) {
                return false;
            }
        }

        return true;
    }
}
    