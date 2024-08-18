class Solution {
    public int[] productExceptSelf(int[] nums) {
        int[] preffix=new int[nums.length];
        int pr=1;
        preffix[0]=1;
        for(int i=1;i<nums.length;i++){
            pr=pr*nums[i-1];
            preffix[i]=pr;
        }
         int[] suffix=new int[nums.length];
        int sr=1;
        suffix[nums.length-1]=1;
        for(int i=nums.length-2;i>=0;i--){
            sr=sr*nums[i+1];
            suffix[i]=sr;
        }
        for(int i=0;i<nums.length;i++){
            nums[i]=suffix[i]*preffix[i];
        }
        return nums;
        
    }
}