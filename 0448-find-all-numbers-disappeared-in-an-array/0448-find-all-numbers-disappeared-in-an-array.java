import java.util.Vector;

class Solution {
   public List<Integer> findDisappearedNumbers(int[] nums) {
     HashSet<Integer>  hashSet= new HashSet<>();
     Vector<Integer> vector = new Vector<>();
     for (int i :
                nums) {
            hashSet.add(i);
        }
        for (int i = 1; i <= nums.length; i++) {
            if(!hashSet.contains(i)){
                vector.add(i);
            }
        }
     return Collections.list(vector.elements());
    }
}