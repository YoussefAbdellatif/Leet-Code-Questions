import java.util.Vector;

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
    private boolean checkEven(int x) {
        if (x % 2 == 0) {   
            return true;
        } else return false;
    }
   public ListNode middleNode(ListNode head) {
        int size = 0;
       Vector<ListNode> vector = new Vector<>();
       
        while (head != null) {
            size++;
            vector.add(head);
            head = head.next;
        }
        
        if (checkEven(size)) {
            return vector.get((vector.size() / 2) );
        }
       return vector.get(vector.size()/2);
        
    }
}