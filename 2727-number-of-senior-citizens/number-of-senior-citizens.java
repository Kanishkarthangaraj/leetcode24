class Solution {
    public int countSeniors(String[] details) {
        int count=0;
        for(String i:details){
            if(((i.charAt(11)-'0')*10+(i.charAt(12)-'0'))>60){
                count+=1;
            }

        }
        return count;
    }
}