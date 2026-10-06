class Solution {
    public int fib(int n) {
        if (n <= 1)
            return n;
        int lastNum = fib(n - 1);
        int nextLast = fib(n - 2);

        return lastNum + nextLast;
    }
}
