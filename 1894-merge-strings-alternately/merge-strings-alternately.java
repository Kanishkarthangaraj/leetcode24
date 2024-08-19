class Solution {
    public String mergeAlternately(String word1, String word2) {
        int max=0;
        if(word1.length()>word2.length()){
            max=word1.length();
        }
        else{
            max=word2.length();
        }
        String ans="";
        for(int i=0;i<max;i++){
            if(word1.length()>i){
                ans=ans+word1.charAt(i);
            }
            if(word2.length()>i){
                ans=ans+word2.charAt(i);
            }
        }
        return ans;
    }
}