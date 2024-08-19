class Solution {
    public boolean isSubsequence(String s, String t) {
        int d=-1;
        int count=0;
        for(int i=0;i<s.length();i++){
            for(int j=0;j<t.length();j++){
                if(s.charAt(i)==t.charAt(j)&&d<j){
                    count++;
                    d=j;
                    break;
                }
            }
           
        }
        if(count==s.length()){
                return true;
        }
        return false;
    }
}