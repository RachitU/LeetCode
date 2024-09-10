class Solution {
public:
    int removeDuplicates(vector<int>& nums) {
        if(nums.empty()){
            return 0;
        }
        int f = 1;
        for(int i = 1;i< nums.size();i++) {
            if(nums[i] != nums[i-1]){  //to check if new element has been found
                nums[f] = nums[i];
                f++;
            }
        }
        return f;
        
    }
};