class Solution {
    public String findDifferentBinaryString(String[] nums) {
    StringBuilder builder = new StringBuilder();
        for (int i = 0; i < nums.length; i++) {
            if(nums[i].charAt(i)=='0'){
                builder.append('1');
            }else
            {
                builder.append('0');
            }
           
        }
        return builder.toString();
    }
}