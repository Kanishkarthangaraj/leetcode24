import java.util.*;
class Solution {
    public int[] intersect(int[] nums1, int[] nums2) {
        Hashtable<Integer,Integer>nums1Map=new Hashtable<>();
        ArrayList<Integer> intersection=new ArrayList<>();

        for(int i=0;i<nums1.length;i++){
            if(nums1Map.containsKey(nums1[i])){
                nums1Map.put(nums1[i],nums1Map.get(nums1[i])+1);
            }
            else{
                nums1Map.put(nums1[i],1);
            }
        }
           for(int i=0;i<nums2.length;i++){
            if(nums1Map.containsKey(nums2[i])){
               intersection.add(nums2[i]);
               nums1Map.put(nums2[i],nums1Map.get(nums2[i])-1);
               if(nums1Map.get(nums2[i])==0){
                nums1Map.remove(nums2[i]);
               }
            }
        }
        int[]result=new int[intersection.size()];
        for(int i=0;i<result.length;i++){
            result[i]=intersection.get(i);
        }
        return result;
    }
}