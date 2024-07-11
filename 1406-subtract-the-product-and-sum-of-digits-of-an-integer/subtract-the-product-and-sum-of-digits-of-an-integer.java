class Solution {
    public int subtractProductAndSum(int n) {
        int a;
        int product=1;
        int sum=0;
        while(n>0){
         a=n%10;
        product*=a;
         sum+=a;
        n=n/10;
        }
        return ( product-sum);

    }
}