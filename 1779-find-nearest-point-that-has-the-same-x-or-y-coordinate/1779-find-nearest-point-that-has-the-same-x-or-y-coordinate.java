class Solution {
   public int nearestValidPoint(int x, int y, int[][] points) {
        int min=465465;
        int f=-1;
        //get stream of arrays where x=x or y=y
        for (int i = 0; i < points.length; i++) {
            if (points[i][0] == x || points[i][1] == y) {
                int distance = java.lang.Math.abs(x - points[i][0]) + java.lang.Math.abs(y - points[i][1]);
                if (distance<min)
                {
                    min = distance;
                    f=i;
                }
            }
        }
        return f;
        
    }
}