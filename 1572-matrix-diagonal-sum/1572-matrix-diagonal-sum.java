class Solution {
        private boolean checkEven(int x) {
        if (x % 2 == 0) {
            return true;
        } else return false;
    }

    public int diagonalSum(int[][] mat) {
        int sum =0;
        for (int i = 0; i < mat.length; i++) {
               sum += mat[i][i];
        }
        for (int i = 0; i < mat.length; i++) {
           sum+= mat[i][mat.length-1-i];
        }
        if(!checkEven(mat.length)){
        int f = mat.length/2 ;
        sum-= mat[f][f];}
return sum;
        }
}