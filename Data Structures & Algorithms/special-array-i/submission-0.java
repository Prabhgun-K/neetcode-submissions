class Solution {
    public boolean isArraySpecial(int[] nums) {
        int n = nums.length;
        boolean[] ans = new boolean[n-1];
        for(boolean ch : ans) {
            ch = false;
        }
        if(n==1 && nums[0]%2!=0) return true;
        for(int i=0; i<(n-1); i++) {
            if(nums[i]%2==0) {
                if(nums[i+1]%2!=0) {
                    ans[i] = true;
                }
            }
            else if(nums[i]%2!=0) {
                if(nums[i+1]%2 == 0) {
                    ans[i] = true;
                }
            }
        }
        for(boolean ch : ans) {
            if(ch==false) return false;
        }
        return true;
    }
}