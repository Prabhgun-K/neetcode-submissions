class Solution {
    public int[] nextGreaterElement(int[] nums1, int[] nums2) {
        int max = 0;
        int target = 0;
        int[] ans = new int[nums1.length];
        for(int i=0; i<nums1.length; i++) {
            for(int j = 0; j < nums2.length; j++) {
                if(nums1[i] ==  nums2[j]) {
                    target = j;
                    break;
                }
            }
            ans[i] = -1;
            for(int k = target; k < nums2.length; k++) {
                if(nums2[k] > nums2[target]) {
                    ans[i]=nums2[k]; 
                    break;
                }
            }
        }
        return ans;
    }
}