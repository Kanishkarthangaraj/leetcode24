class Solution {
    public boolean isPalindrome(int x) {
        int rev=0;
        int a=x;
        while(x>0){
            rev=x%10+rev*10;
            x=x/10;

        }
        if(rev==a){
            return true;
        }
        else{
        return false;
        }
        
    }
}