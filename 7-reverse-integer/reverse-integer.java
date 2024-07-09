class Solution {
    public int reverse(int x) {
        
        long rev=0;
        int min=Integer.MIN_VALUE;
        int max=Integer.MAX_VALUE;
        
        while(x!=0){
          rev=rev*10+x%10;
          x=x/10;
        }
        if (rev>max||rev<min)
            return 0;
        return (int)rev;
        
    }
}