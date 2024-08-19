class Solution {
    public List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
        List<Boolean> list1=new ArrayList<>();
        int max=0;
        for(int i=0;i<candies.length;i++){
            if(candies[i]>max){
                max=candies[i];
            }
            
        }
        for(int i=0;i<candies.length;i++){
            if(candies[i]+extraCandies>=max){
                list1.add(true);
            }
            else{
                list1.add(false);
            }
        }
        return list1;
    }
}