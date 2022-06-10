class Solution {
     public boolean checkEven(int x){
        if (x % 2 == 0){
            return true;
        }
        else return false;
    }
   public int countOdds(int low, int high) {
        int s=0;
        int range = high-low;
        if (checkEven(low) && checkEven(high))
            return range/2;
        else
        return ((range)/2)+ 1;
    }
}