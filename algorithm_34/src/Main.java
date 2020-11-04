/**
 * 꼭 마스터 할 것.
 * */
public class Main {
   public static void main(String[] args) {
//      ListNode listNode = new Solution().insertionSortList(
//          new ListNode(4,
//              new ListNode(2,
//                  new ListNode(1,
//                      new ListNode(3))))
//      );

      ListNode listNode = new Solution().insertionSortList(
          new ListNode(-1,
              new ListNode(5,
                  new ListNode(3,
                      new ListNode(4 ,
                          new ListNode(0)))))
      );

      ListNode cur = listNode;
      while (cur != null){
         System.out.print(cur.val);
         cur = cur.next;
      }

   }
}

class Solution {
   public ListNode insertionSortList(ListNode head) {

      ListNode dummy = new ListNode();
      ListNode current = head , pre , next;

      while (current != null){
         pre = dummy;
         next = dummy.next;

         while (next !=null && current.val > next.val){
            pre = next;
            next = next.next;
         }

         ListNode nextNode = current.next;

         current.next = next;
         pre.next = current;

         current = nextNode;
      }

      return dummy.next;
   }
}

/*class Solution {
   public ListNode insertionSortList(ListNode head) {

      ListNode pseudoHead = new ListNode();
      ListNode curr = head, prevNode, nextNode;

      while (curr != null) {
         // At each iteration, we insert an element into the resulting list.
         prevNode = pseudoHead;
         nextNode = pseudoHead.next;

         // find the position to insert the current node
         while (nextNode != null) {
            if (curr.val < nextNode.val)
               break;
            prevNode = nextNode;
            nextNode = nextNode.next;
         }
         ListNode nextIter = curr.next;
         // insert the current node to the new list
         curr.next = nextNode;
         prevNode.next = curr;

         // moving on to the next iteration
         curr = nextIter;
      }

      return pseudoHead.next;
   }
}*/


class ListNode {
    int val;
    ListNode next;
    ListNode() {}
    ListNode(int val) { this.val = val; }
    ListNode(int val, ListNode next) { this.val = val; this.next = next; }
}