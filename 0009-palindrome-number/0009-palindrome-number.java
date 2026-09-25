class Solution {
    public boolean isPalindrome(int x) {
        if(x<0){
            return false;
            }
 int revers =0; 
 int dup = x;
        while(x >0){
            int lastdigit = x%10;
            revers = ( revers * 10)+lastdigit;
            x= x/10;

        }
        
        return revers == dup;
        
    }
};