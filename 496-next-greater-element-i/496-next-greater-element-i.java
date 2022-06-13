class Solution {
 public int[] nextGreaterElement(int[] nums1, int[] nums2) {
    int[]  v=new int[nums1.length];
    int count=1;
    // check if each element in 1 exists in 2/*
        for (int i = 0; i < nums1.length; i++) {
            for (int j = 0; j < nums2.length; j++) {


                if (nums1[i]==nums2[j]){
                    if((j+1) == nums2.length){
                        v[i]= -1;
                    }else{
                        for (int k = j+1; k <nums2.length ; k++) {
                           if (nums2[k]>nums2[j]) {
                               v [i] = nums2[k];
                               break;
                           }          
                        else{
                               v[i] = -1;
                           }}
                        }
                    }


                    /*
                    {while(!(nums2[j+count]>nums2[j])){
                        v[i] = nums2[j+count];
                        count++;
                    }
*/
            }



            }             return v;
    }
}