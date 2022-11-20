import java.util.Vector;

class Solution {
       public int arithmeticTriplets(int[] nums, int diff) {
        int x =0;
        int counter = 0 ;
        Vector<Integer> d =new Vector<>();
        for (int q :
                nums) {
            d.add(q);
        }
        for (int i = 0; i < nums.length; i++) {
        if( d.contains(nums[i]+diff) && d.contains(nums[i]+diff+diff)){
            counter++;
        }
        }
    return counter;
    }
}