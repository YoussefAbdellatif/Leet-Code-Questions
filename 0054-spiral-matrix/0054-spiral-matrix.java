class Solution {
   public List<Integer> spiralOrder(int[][] matrix) {
    List<Integer> result = new ArrayList<>();
    if (matrix.length==0) return result;

    int beginRow= 0;
    int beginColumn=0;
    int endRow=matrix.length-1;
    int endColumn = matrix[0].length-1;

    while(beginRow<=endRow && beginColumn <=endColumn){

        for (int i = beginColumn; i <=endColumn ; i++) {
            result.add(matrix[beginRow][i]);
        }
        beginRow++;
        for (int i = beginRow; i <=endRow ; i++) {
            result.add(matrix[i][endColumn]);
        }
        endColumn--;

        if (beginRow<=endRow && beginColumn <=endColumn) {
            for (int i = endColumn; i >=beginColumn ; i--) {
                result.add(matrix[endRow][i]);
            }
            endRow--;
            for (int i = endRow; i >= beginRow; i--) {
                result.add(matrix[i][beginColumn]);
            }
            beginColumn++;


        }


    }
    return result;

    }
}