class Solution {
    public int singleNumber(int[] nums) {
    int[] b =        Arrays.stream(nums).sorted().toArray();
        int m=0;
    int counter=0;
          while (counter <nums.length){
              if (counter ==nums.length-1){

                   m= b[counter];
                  break;
              }
            if(b[counter] == b[counter+1]){
                b[counter] =0;
                b[counter+1]=0;
            counter+=2;
            }else{
                
               m = b[counter];
                break;
            }
        }
        return m;
    }
}