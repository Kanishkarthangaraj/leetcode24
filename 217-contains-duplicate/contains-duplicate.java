import java.util.HashSet;
class Solution {
    public boolean containsDuplicate(int[] nums) {
    HashSet<Integer> num=new HashSet<>();
    for(int i=0;i<nums.length;i++){
        if(num.contains(nums[i])){
            return true;
        }
        num.add(nums[i]);
    }
    return false;
}
}