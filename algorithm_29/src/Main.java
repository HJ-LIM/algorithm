public class Main {
   public static void main(String[] args) {

      ListNode l1 = new ListNode(9,
          new ListNode(9,
              new ListNode(9,
                  new ListNode(9,
                      new ListNode(9,
                          new ListNode(9,
                              new ListNode(9)))))
          )
      );

      ListNode l2 = new ListNode(
          9,
          new ListNode(
              9,
              new ListNode(9,
                  new ListNode(9))
          )
      );

      ListNode listNode = new Solution().addTwoNumbers(l1, l2);
//      System.out.printf("[%d , %d , %d ] " , listNode.val , listNode.next.val , listNode.next.next.val);

   }
}

class Solution {
   public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
      ListNode result = new ListNode(0);

      ListNode _l1 = l1 ,  _l2 = l2 , current = result;
      int carry = 0;
      while (_l1 != null || _l2 != null){
         int x = (_l1 != null) ? _l1.val : 0;
         int y = (_l2 != null) ? _l2.val : 0;

         int sum = carry + x + y;
         carry = sum /10;

         current.val = sum % 10;
         if(_l1 != null) _l1 = _l1.next;
         if(_l2 != null) _l2 = _l2.next;
         if(_l1 != null || _l2 != null){
            current.next = new ListNode(0);
            current = current.next;
         }
      }

      if(carry > 0){
         current.next = new ListNode(carry);
      }

      return result;
   }
}


class ListNode {
  int val;
  ListNode next;
  ListNode() {}
  ListNode(int val) { this.val = val; }
  ListNode(int val, ListNode next) { this.val = val; this.next = next; }
}
