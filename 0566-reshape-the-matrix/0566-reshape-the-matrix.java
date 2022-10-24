class Solution {
  public int[][] matrixReshape(int[][] mat, int r, int c) {
        int[][] reshaped = new int[r][c];
        int rows =0;
        int columns =0;
        if ((mat.length*mat[0].length)!= r*c ){
            return mat;
        }
        for (int i = 0; i < mat.length; i++) {
            for (int j = 0; j < mat[i].length; j++) {
                
                    reshaped[rows][columns] = mat[i][j];
                    columns++;
                if (columns ==c){
                    rows++;
                    columns=0;}
                }
            }
        
        return reshaped;
    }
}