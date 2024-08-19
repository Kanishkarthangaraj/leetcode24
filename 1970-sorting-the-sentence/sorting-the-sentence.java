class Solution {
    public String sortSentence(String s) {
        String[] str=s.split(" ");
        String ans[]=new String [str.length];
        for(int i=0;i<str.length;i++){
        int n=str[i].charAt(str[i].length()-1)-'0';
        ans[n-1]=str[i].substring(0,str[i].length()-1);
        }
        String ans1="";
        for(int i=0;i<str.length-1;i++){
            ans1=ans1+ans[i]+" ";
        }
        ans1=ans1+ans[ans.length-1];
        return ans1;
        
    }
}