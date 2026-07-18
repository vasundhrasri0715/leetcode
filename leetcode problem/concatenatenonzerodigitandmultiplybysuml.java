class Solution {
    public long sumAndMultiply(int n) {
        long x = 0;
        long rev = 0;
        long sum = 0;

        while (n != 0) {
            int digit = n % 10;

            if (digit != 0) {
                rev = rev * 10 + digit;
            }

            n = n / 10;
        }

        while (rev != 0) {
            int digit = (int)(rev % 10);
            x = x * 10 + digit;
            sum = sum + digit;
            rev = rev / 10;
        }

        return x * sum;
    }
}