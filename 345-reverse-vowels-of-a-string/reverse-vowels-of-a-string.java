class Solution {
    public String reverseVowels(String s) {
        int i=0;
        int right=s.length()-1;
        char[]arr=s.toCharArray();
        while(i<right){
            if((arr[i]=='a'||arr[i]=='e'||arr[i]=='i'||arr[i]=='o'||arr[i]=='u'||arr[i]=='A'||arr[i]=='E'||arr[i]=='I'||arr[i]=='O'||arr[i]=='U')&&(arr[right]=='a'||arr[right]=='e'||arr[right]=='i'||arr[right]=='o'||arr[right]=='u'||arr[right]=='A'||arr[right]=='E'||arr[right]=='I'||arr[right]=='O'||arr[right]=='U')){
                char temp=arr[i];
                arr[i]=arr[right];
                arr[right]=temp;
                i++;
                right--;
            }
            else if(arr[right]=='a'||arr[right]=='e'||arr[right]=='i'||arr[right]=='o'||arr[right]=='u'||arr[right]=='A'||arr[right]=='E'||arr[right]=='I'||arr[right]=='O'||arr[right]=='U'){
                i++;
            }
            else if(arr[i]=='a'||arr[i]=='e'||arr[i]=='i'||arr[i]=='o'||arr[i]=='u'||arr[i]=='A'||arr[i]=='E'||arr[i]=='I'||arr[i]=='O'||arr[i]=='U'){
                 right--;
            }
            else{
                i++;
                right--;
            }
        }
        String ans="";
        for(int j=0;j<arr.length;j++){
            ans=ans+arr[j];
        }
        return ans;
    }
}