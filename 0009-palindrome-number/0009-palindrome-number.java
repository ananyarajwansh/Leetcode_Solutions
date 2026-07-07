class Solution {
    public boolean isPalindrome(int x) {
         if (x < 0 || (x % 10 == 0 && x != 0)) {
            return false;
        }

        int rev = 0;

        while (x > rev) {
            rev = rev * 10 + x % 10;
            x /= 10;
        }

        // Even digits: x == rev
        // Odd digits: x == rev / 10
        return x == rev || x == rev / 10;
    }
}