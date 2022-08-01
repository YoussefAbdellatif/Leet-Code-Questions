class Solution {
public int[][] matrixReshape(int[][] mat, int r, int c) {
        int[][] b=new int[r][c];
        int x=0;
        int y=0;
        if ((mat.length*mat[0].length)!= r*c ){
            return mat;
        }
       for (int i = 0; i < mat.length; i++) {
           for (int j = 0; j < mat[i].length; j++) {
              
                  b[x][y]=mat[i][j];
               y++;
               if (y == c){
                   x++;
                   y =0;}
           }
       }

        return b;
    }
}