class Solution {
    public int xorOperation(int n, int start) {
        int nums[]=new int[n];
        int sum=0;
        for(int i=0;i<n;i++){
            ;
            sum^=(start +(2*i));
        }
        return sum;
    }
}