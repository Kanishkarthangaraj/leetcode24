class Solution {
    public String largestNumber(int[] nums) {
      String[] str=new String[nums.length];
      for(int i=0;i<nums.length;i++){
        str[i]=String.valueOf(nums[i]);
      }
      Arrays.sort(str,(a,b)->(b+a).compareTo(a+b));
      StringBuilder str1=new StringBuilder();
      for(String s:str){
        str1.append(s);
      }
      String res=str1.toString();
      if(res.charAt(0)=='0'){
        return "0";
      }
      else{
        return res;
      }
    }
}