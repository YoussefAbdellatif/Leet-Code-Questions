
class Solution {
  public int getDecimalValue(ListNode head) {
    String c = "";
    while (head != null){
        c+= head.val;
        head=head.next;
    }

    return Integer.parseInt(c,2);
    }
}