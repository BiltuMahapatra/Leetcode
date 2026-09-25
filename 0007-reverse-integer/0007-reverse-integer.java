class Solution {
    public int reverse(int x) {
        long revers = 0;

        while (x != 0) {
            int last = x % 10;
            revers = (revers * 10) + last;
            x = x / 10;
        }
        if (revers > Integer.MAX_VALUE || revers < Integer.MIN_VALUE) {
            return 0;
        }

        return (int) revers;
    }
};