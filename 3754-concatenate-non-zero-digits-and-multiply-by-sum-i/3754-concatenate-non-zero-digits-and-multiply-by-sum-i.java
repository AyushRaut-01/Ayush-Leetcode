class Solution {
    public long sumAndMultiply(int n) {
        long sum = 0;
        long num = 0;
        long place = 1;

        while (n > 0) {
            int rem = n % 10;

            if (rem != 0) {
                num += (long) rem * place;
                place *= 10;
                sum += rem;
            }

            n /= 10;
        }

        return num * sum;
    }
}