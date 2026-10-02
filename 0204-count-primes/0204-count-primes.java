class Solution {
    public int countPrimes(int n) {
        if (n <= 2) {
            return 0;
        }
        boolean[] isPrime = new boolean[n];

        for (int i = 2; i < n; i++) {
            isPrime[i] = true;
        }

        for (int i = 2; i <= (n - 1) / i; i++) {
            if (isPrime[i]) {
                for (int multiple = i * i; multiple < n; multiple += i) {
                    isPrime[multiple] = false;
                }
            }
        }
        int count = 0;
        for (int i =2; i < n; i++) {
            if (isPrime[i]) {
                count++;
            }
        }
        return count;
    }
}
