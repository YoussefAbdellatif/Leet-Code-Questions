import java.util.Scanner;
import java.util.Vector;
class Solution {
    public boolean containsDuplicate(int[] nums) {
       HashSet<Integer> veco = new HashSet<>();
        for (int i = 0; i < nums.length; i++) {
            if (veco.contains(nums[i])) return true;
            veco.add(nums[i]);
            }
        return false;
            
    }
}