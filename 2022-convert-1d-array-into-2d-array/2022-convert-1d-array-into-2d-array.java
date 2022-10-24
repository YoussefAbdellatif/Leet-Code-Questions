class Solution {
   public int[][] construct2DArray(int[] original, int m, int n) {
    int[][] output = new int[m][n];
    int r= 0;
    int c= 0;

    if (m*n != original.length){
        return new int[0][0];
    }
        for (int i = 0; i < original.length; i++) {
            output[r][c]= original[i];
            c++;
            if(c ==n){
                r++;
                c=0;
            }
        }

        return output;
    }
}