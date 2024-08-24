class Solution {
    public String triangleType(int[] nums) {
        String str="equilateral";
        if(nums[0]+nums[1]<=nums[2]||nums[1]+nums[2]<=nums[0]||nums[2]+nums[0]<=nums[1]){
            return "none";
        }
        if(nums[0]==nums[1]&&nums[0]==nums[2]&&nums[1]==nums[2]){
            return str;
        }
        if(nums[0]==nums[1]||nums[1]==nums[2]||nums[2]==nums[0]){
            return "isosceles";
        }
        return "scalene";
        
    }
}