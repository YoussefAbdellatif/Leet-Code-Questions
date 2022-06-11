class Solution {
 public int largestPerimeter(int[] nums) {
    int[] sorted =Arrays.stream(nums).sorted().toArray();
    int premiter=0;
    for (int i = nums.length-1; i >=2 ; i--) {
        if(sorted[i-1]+sorted[i-2] > sorted[i]){
            premiter= sorted[i] +sorted[i-1]+sorted[i-2];
        break;
        }
        }


        return premiter;


}
}