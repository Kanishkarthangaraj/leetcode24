class Solution {
    public void nextPermutation(int[] arr) {
        int n=arr.length;
        int ind=-1;
        int i;
        for( i=n-1;i>=1;i--){
            if(arr[i-1]<arr[i]){
             ind=i-1;
             break;
            }
        }
        if(ind!=-1){
            for(i=n-1;i>=ind+1;i--){
            if(arr[i]>arr[ind]){
            int temp=arr[i];
            arr[i]=arr[ind];
            arr[ind]=temp;
            break;
            }
            }
        }
    
    int start=ind+1;
    int end=n-1;
    while(start<end){
        int temp=arr[start];
        arr[start]=arr[end];
        arr[end]=temp;
        start++;
        end--;
    }
    }
}