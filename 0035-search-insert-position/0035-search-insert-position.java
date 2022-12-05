class Solution {
    public int searchInsert(int[] nums, int target) {
       int itsIndex=0;
        for(int i =0;i<nums.length;i++){
            if(nums[i] == target){
                itsIndex = i;
                break;
            }
            if (nums[i] < target){
                itsIndex ++;
            }
        
        }
        return itsIndex;
    }
}