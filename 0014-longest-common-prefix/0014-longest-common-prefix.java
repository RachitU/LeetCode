class Solution {
    public String longestCommonPrefix(String[] strs) {
        if (strs.length == 0)
            return "";
        String pre = strs[0];
        for (String r : strs) {
            while (r.indexOf(pre) != 0) {

                pre = pre.substring(0, (pre.length() - 1));

            }
        }

        return pre;

    }
}