class Solution {
    public boolean isPalindrome(String s) {
        // your code goes here
        return check(s, 0, s.length() - 1);
    }

    private boolean check(String s, int firstNum, int lastNum) {

        while (firstNum < lastNum && !Character.isLetterOrDigit(s.charAt(firstNum))) {
            firstNum++;
        }
        while (firstNum < lastNum && !Character.isLetterOrDigit(s.charAt(lastNum))) {
            lastNum--;
        }

        if (firstNum >= lastNum) {
            return true;
        }
        if (Character.toLowerCase(s.charAt(firstNum)) != Character.toLowerCase(s.charAt(lastNum))) {
            return false;
        }
        return check(s, firstNum + 1, lastNum - 1);
    }

}