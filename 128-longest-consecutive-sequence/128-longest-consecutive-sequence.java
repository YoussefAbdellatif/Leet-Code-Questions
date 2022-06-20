class Solution {
 public int longestConsecutive(int[] nums) {
    int[] f= Arrays.stream(nums).sorted().distinct().toArray();
    int length_ofArray =1;
    int currentMax= 1;
    for (int i = 1; i < f.length; i++) {
            if (f[i]-f[i-1] ==1 ){
                length_ofArray++;
                if(length_ofArray>currentMax){
                     currentMax=length_ofArray;
                }
            }else{
                length_ofArray =1;
            }
        }
        if (nums.length == 0){
            currentMax =0;
        }
        if (nums.length ==1)
            currentMax = 1;
    return currentMax;
    }
}