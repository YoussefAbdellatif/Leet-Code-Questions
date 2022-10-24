class Solution {
   public int[][] generateMatrix(int n) {
        int[][] result = new int[n][n];
        int beginRow = 0;
        int beginColumn = 0;
        int endRow = n - 1;
        int endColumn = n - 1;
        int number = 1;
        while (beginRow <= endRow && beginColumn <= endColumn) {

            for (int i = beginColumn; i <= endColumn; i++) {
                result[beginRow][i] = number;
                number++;
            }
            beginRow++;
            for (int i = beginRow; i <= endRow; i++) {
                result[i][endColumn] = number;
                number++;
            }
            endColumn--;

            if (beginRow <= endRow && beginColumn <= endColumn) {
                for (int i = endColumn; i >= beginColumn; i--) {
                    result[endRow][i] = number;
                    number++;
                }
                endRow--;
                for (int i = endRow; i >= beginRow; i--) {
                    result[i][beginColumn] = number;
                    number++;
                }
                beginColumn++;


            }


        }
        return result;

    }


}