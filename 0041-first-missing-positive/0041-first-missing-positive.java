class Solution {
     public int firstMissingPositive(int[] nums) {
    HashSet<Integer> hashSet = new HashSet<>();
        for (int i :
                nums) {
            hashSet.add(i);
        }
        int x = 1;
        while (true){
            if(hashSet.contains(x)){
               x++;
            }
            else
            {
                return x;
            }
        }
    }
}