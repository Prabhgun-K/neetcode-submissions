class Solution {
    public boolean isMonotonic(int[] nums) {
        boolean flag = false;
        for(int i=0; i<nums.length-1; i++) {
            int elem = nums[i];
            if(elem <= nums[i+1]) {
                flag = true;
                for(int j=i+1; j<nums.length-1; j++) {
                    if(nums[j] <= nums[j+1]) flag = true;
                    else {
                        flag = false;
                        break;
                    }
                }
                break;
            } 
            else if(elem >= nums[i+1]) {
                flag = true;
                for(int j=i+1; j<nums.length-1; j++) {
                    if(nums[j] >= nums[j+1]) flag = true;
                    else {
                        flag = false;
                        break;
                    }
                }
                break;
            }
            else {
                flag = false;
                break;
            }
        }
        return flag;
    }
}