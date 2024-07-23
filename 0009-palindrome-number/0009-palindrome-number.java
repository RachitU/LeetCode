class Solution {
    public boolean isPalindrome(int x) {
        String num = String.valueOf(x);
        String rev="";
        for(int i=num.length()-1;i>=0;i--) {
            rev+=num.charAt(i);
        }
        return num.equals(rev);
    }
}