class Solution {
    public int differenceOfSum(int[] nums) {
            int count1 = 0, count2 = 0;

        for(int num : nums) {
            count2 += num;

            while(num > 0) {
                count1 += num % 10;
                num /= 10;
            }
        }

        return count2 - count1;
    }
}