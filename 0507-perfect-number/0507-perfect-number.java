class Solution {
    public boolean checkPerfectNumber(int n) {
        if (n <= 1) {
            return false;
        }
        int sum = 1;
        return isPerfectNum(n, 2, sum) == n;
    }

    private int isPerfectNum(int n, int divisor, int sum) {
        if (divisor > n / divisor) {
            return sum;
        }

        if (n % divisor == 0) {
            sum += divisor;

            int pairedDivisor = n / divisor;
            if (pairedDivisor != divisor) {
                sum += pairedDivisor;
            }
        }

        return isPerfectNum(n, divisor + 1, sum);

    }
}