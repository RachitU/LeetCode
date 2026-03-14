class Solution {
public:

    vector<int> getMaxSubsequence(const vector<int>& nums, int k) {
        int drop = nums.size() - k;
        vector<int> stack;

        for (int num : nums) {
            while (drop > 0 && !stack.empty() && stack.back() < num) {
                stack.pop_back();
                drop--;
            }
            stack.push_back(num);
        }

        stack.resize(k);
        return stack;
    }

    bool compareSuffix(const vector<int>& a, int i, const vector<int>& b, int j) {
        while (i < a.size() && j < b.size() && a[i] == b[j]) {
            i++;
            j++;
        }

        if (j == b.size()) return true;
        if (i == a.size()) return false;

        return a[i] > b[j];
    }

    vector<int> mergeSeqs(const vector<int>& a, const vector<int>& b) {
        vector<int> res;
        int i = 0, j = 0;

        while (i < a.size() || j < b.size()) {
            if (compareSuffix(a, i, b, j)) {
                res.push_back(a[i++]);
            } else {
                res.push_back(b[j++]);
            }
        }

        return res;
    }

    vector<int> maxNumber(vector<int>& nums1, vector<int>& nums2, int k) {
        int M = nums1.size();
        int N = nums2.size();

        vector<int> best;

        for (int i = max(0, k - N); i <= min(k, M); i++) {
            vector<int> sub1 = getMaxSubsequence(nums1, i);
            vector<int> sub2 = getMaxSubsequence(nums2, k - i);

            vector<int> candidate = mergeSeqs(sub1, sub2);

            if (candidate > best) {
                best = candidate;
            }
        }

        return best;
    }
};
