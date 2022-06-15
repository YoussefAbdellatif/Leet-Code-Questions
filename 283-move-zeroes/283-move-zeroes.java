class Solution {
    public void moveZeroes(int[] nums) {
        int temp=0;
        int indexWithoutZeroes =0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == 0) {
                temp++;
            } else {
                nums[indexWithoutZeroes] = nums[i];
                indexWithoutZeroes++;
            }
        }
        
        // check if n = 0
        // add 1 to some temp variable
        // if it's a  number add it to index without zeros variable
            // indexwithout++
        for (int i = indexWithoutZeroes; i <nums.length ; i++) {
            nums[i] =0;
        }
        // add zeroes 
       //at indexwithoutzzeores+1 start loop adding zeroes temp times
    }
}