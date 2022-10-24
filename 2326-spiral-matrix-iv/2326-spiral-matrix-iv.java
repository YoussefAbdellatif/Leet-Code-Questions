/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
   public int[][] spiralMatrix(int m, int n, ListNode head) {


        int[][] result = new int[m][n];
        for(int[] arr:result){
            Arrays.fill(arr,-1);
        }
        int beginRow = 0;
        int beginColumn = 0;
        int endRow = m - 1;
        int endColumn = n - 1;
        int number = 1;

        while (beginRow <= endRow && beginColumn <= endColumn) {

            for (int i = beginColumn; i <= endColumn; i++) {
               if(head !=null) {
                   result[beginRow][i] = head.val;
                                  head=head.next;

               }

            }
            beginRow++;
            for (int i = beginRow; i <= endRow; i++) {
                if(head !=null){
                    result[i][endColumn] = head.val;
                                head=head.next;
}
            }
            endColumn--;

            if (beginRow <= endRow && beginColumn <= endColumn) {
                for (int i = endColumn; i >= beginColumn; i--) {
                    if(head !=null){
                        result[endRow][i] = head.val;
                                        head=head.next;
}
                }
                endRow--;
                for (int i = endRow; i >= beginRow; i--) {
                    if(head !=null){
                        result[i][beginColumn] = head.val;
                                        head=head.next;
}
                }
                beginColumn++;


            }


        }
        return result;

    }
}