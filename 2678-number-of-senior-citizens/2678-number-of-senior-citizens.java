class Solution {
    public int countSeniors(String[] details) {
        int num=0;
        for(int i=0;i<details.length;i++){
        int age = Integer.valueOf(details[i].substring(11,13));
        if(age>60){
            num++;
        }
      }
      return num;
    }
}