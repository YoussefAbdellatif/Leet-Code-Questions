class Solution {
    public boolean isMonotonic(int[] nums) {
         if (nums.length == 1){
            return true;
        }
    boolean increaseingMonotonic= false;
    boolean decreasingMonotonic = false;
        for (int i = 0; i < nums.length - 1; i++) {
            increaseingMonotonic =true;
            if (!(nums[i] <= nums[i+1])){
                increaseingMonotonic = false;
                break;
            }
        }
        if(increaseingMonotonic){
            return increaseingMonotonic;
        }
        for (int i = 0; i < nums.length - 1; i++) {
            decreasingMonotonic =true;
            if (!(nums[i] >= nums[i+1])){
                decreasingMonotonic = false;
                break;
            }
        }
        
        
        return increaseingMonotonic||decreasingMonotonic;
    }
}