class Solution {
        private boolean checkEven(int x){
        if (x % 2 == 0){
            return true;
        }
        else return false;
    }

   public int arraySign(int[] nums) {
        int  product=1;
        int negativenums=0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] < 0)
                negativenums++;
            if (nums[i] == 0)
                return 0;
        }
        if (checkEven(negativenums) && negativenums != 0)
            return 1;
        if(negativenums ==0)
            return 1;
        else
            return -1;
        
    }
}