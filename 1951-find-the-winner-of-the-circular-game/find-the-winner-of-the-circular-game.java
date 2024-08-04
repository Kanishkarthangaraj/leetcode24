class Solution {
    public int findTheWinner(int n, int k) {
        Queue<Integer> Q=new LinkedList<>();
        for(int i=1;i<=n;i++){
            Q.add(i);
        }
        while(Q.size()!=1){
            for(int i=0;i<k;i++){
                if(i==k-1){
                    Q.remove();
                    break;
                }
                else{
                    Q.add(Q.poll());
                }
            }
        }
        return Q.poll();
    }
}