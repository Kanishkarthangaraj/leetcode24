class Solution {
    public String reversePrefix(String word, char ch) {
        char[] arr=word.toCharArray();
        for(int i=0;i<word.length();i++){
            if(arr[i]==ch){
                int j=0;
                while(j<i){
                 char temp=arr[i];
                 arr[i]=arr[j];
                 arr[j]=temp;
                 j++;
                 i--;
                }
        String str=new String(arr);
        return str;
            }
         
        }
        return word;
        
    }
}