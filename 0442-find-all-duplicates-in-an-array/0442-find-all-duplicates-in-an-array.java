import java.util.Vector;

class Solution {
  public List<Integer> findDuplicates(int[] nums) {
    Vector<Integer> v= new Vector<>();
     HashSet<Integer> hashSet = new HashSet<Integer>();
        for (int i :
                nums) {
            if(hashSet.contains(i)){
            v.add(i);
            }
            else {
                hashSet.add(i);
            }
        }
        return Collections.list(v.elements());

    }
}