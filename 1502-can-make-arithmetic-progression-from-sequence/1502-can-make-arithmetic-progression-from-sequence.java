class Solution {
  public boolean canMakeArithmeticProgression(int[] arr) {
        int[] sorted =Arrays.stream(arr).sorted().toArray();
        int m=0;
        int n =(sorted[1] -sorted[0]);
        boolean hamada=true;
        
        for (int i = 0; i < arr.length -1; i++) {
            if (!((sorted[i+1]-sorted[i] )==n))
                hamada=false;
        }
            return hamada;

        }
    }
