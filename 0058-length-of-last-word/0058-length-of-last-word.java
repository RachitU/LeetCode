class Solution {
    public int lengthOfLastWord(String s) {
        int len = s.length();
        int p = s.lastIndexOf(" ");
        if(p==(len-1)){
            s=s.trim();
            len=s.length();
            p=s.lastIndexOf(" ");
        }
    return (len-p-1);
    }
}