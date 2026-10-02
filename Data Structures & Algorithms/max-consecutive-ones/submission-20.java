class Solution {
    public int findMaxConsecutiveOnes(int[] nums) {
        List<Integer> ans = new ArrayList<>();
        int count = 0;
        for(int i=0; i<nums.length; i++) {
            if(nums[i] == 0){
                ans.add(count);
                count = 0;
                continue;
            }
            count++;
        }
        ans.add(count);
        int max = 0;
        for(int i=0; i<ans.size(); i++) {
            if(max < ans.get(i)) max = ans.get(i);
        }
        return max;
    }
}