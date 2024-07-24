class Solution {
    public int reverse(int x) {
        int l=0;
        long maxInt = Integer.MAX_VALUE;
        long minInt = Integer.MIN_VALUE;
        int i=0;
        boolean neg = false;
        if(x==0)return 0;
        if (x<0){
            l=String.valueOf(x).length()-1;
            x=Math.abs(x);
            neg = true;

        }
        else{
            l=String.valueOf(x).length();
        }
        String[] digs = new String[l];
        while(x !=0){
            digs[i] = String.valueOf(x%10);
            x/=10;
            i++;
        }
        
        String ans = "";
        for(int j=0;j<digs.length;j++){


            ans+= digs[j];
        }
        
        long res = 0;
        if(neg==true){
            
            ans = ans.replace("-","");
            res= Long.parseLong(ans)*-1;

            if (res> maxInt || res < minInt ) {
                return 0;
        }
            return (int)(res);
        }
        else{
           
            res = Long.parseLong(ans);
            if (res > maxInt || res < minInt ) {
                return 0;
        }
            return (int)res;
        
        }

        
    }
}