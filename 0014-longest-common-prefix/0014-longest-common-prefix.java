class Solution {
    public String longestCommonPrefix(String[] strs) {
        if (strs.length == 0)
            return "";
        String pre = strs[0];
        for (String r : strs) {
            while (r.indexOf(pre) != 0) {
            //iterates through each string in list and then keeps reducing the prefix till it matches for all 3
                pre = pre.substring(0, (pre.length() - 1));

            }
        }

        return pre;

    }
}
