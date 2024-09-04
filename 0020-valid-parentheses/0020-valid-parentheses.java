class Solution {
    public boolean isValid(String s) {
        Stack<Character> temp = new Stack<Character>();
        HashMap<Character,Character> map = new HashMap<Character,Character>();
        map.put(')','(');
        map.put('}','{');
        map.put(']','[');
        for(char i : s.toCharArray()){
            if(map.containsValue(i)) temp.push(i);//put the opening bracket on top(when u push in a stack the element comes on the top)
            else if (map.containsKey(i)) {
                if( temp.isEmpty() || map.get(i) != temp.pop()) return false;
                /*to check if element removed from top of stack is the value(opening brack) of the key(closing brack)(pop removes the top element)*/
            }
        }
    return temp.isEmpty();
    }
}