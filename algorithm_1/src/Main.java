/**
 * Middle of the Linked List
 *
 * Linked list 구현.
 *
 * [1,2,3,4,5] = [3,4,5]
 * [1,2,3,4,5,6] = [4,5,6]
 * */

import java.util.LinkedList;

public class Main {
   public static void main(String[] args) {
      System.out.println(new Solution().middle(new int[]{1, 2, 3, 4, 5}).toString());
      System.out.println(new Solution().middle(new int[]{1, 2, 3, 4, 5, 6}).toString());
   }
}

class Solution{
   /*public int[] middle(int[] head){


      return new int[]{};
   }*/

   public Node middle(int[] head){

      LinkedList<Node> nodes = generate_list(head);

      Node slow = nodes.getFirst();
      Node fast = nodes.getFirst();

      while (fast != null && fast.getLink() != null){
         slow = slow.getLink();
         fast = slow.getLink().getLink();
      }

      return slow;

   }

   private LinkedList<Node> generate_list(int[] head) {
      LinkedList<Node> nodes = new LinkedList<>();

      for (int i = 0; i < head.length; i++) {
         Node node = new Node(head[i]);

         if(!nodes.isEmpty()){
            nodes.getLast().setLink(node);
         }
         nodes.add(node);
      }

      return nodes;

   }
}

class Node{
   private int value;
   private Node link;

   public Node(int value){
      this.value = value;
   }

   public void setLink(Node link){
      this.link = link;
   }

   public Node getLink(){
      return this.link;
   }

   public int getValue(){
      return this.value;
   }

   @Override
   public String toString(){
      StringBuilder sb = new StringBuilder();
      sb.append(value);

      Node next = link;
      while (next != null){
         sb.append(",");
         sb.append(next.getValue());
         next = next.getLink();
      }

      return sb.toString();
   }

}