class Solution {
    public int missingNumber(int[] nums) {
        int totalsum=0;
        int numsum=0;
        for(int i=0;i<nums.length;i++){
            numsum+=nums[i];
        }
        for(int i=0;i<=nums.length;i++){
            totalsum+=i;
        }
        return totalsum-numsum;
    }
}