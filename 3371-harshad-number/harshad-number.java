class Solution {
    public int sumOfTheDigitsOfHarshadNumber(int x) {
        int y=x;
        int b=0;
        int count=0;
        while(y>0){
            int a=y%10;
            b+=a;
            y=y/10;
        }
        if(x%b==0){
            count=b;
        }
        else{
            return -1;
        }
     return count;  
    }
}