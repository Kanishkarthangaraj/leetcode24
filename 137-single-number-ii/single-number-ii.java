class Solution {
    public int singleNumber(int[] nums) {
         HashMap <Integer,Integer> map=new HashMap<>();
         int ans=0;
         for(int i=0;i<nums.length;i++){
            if(!map.containsKey(nums[i])){
                map.put(nums[i],1);
            }
            else{
                map.put(nums[i],map.get(nums[i])+1);
            }
         }
         for(int a:map.keySet()){
                if(map.get(a)==1){
                    ans=a;
                }
                
            }
           
         
          return ans;
    }
}