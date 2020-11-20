public class Main {
   public static void main(String[] args) {
      System.out.println(new Solution().maxPower("cc"));
   }
}

class Solution {
   public int maxPower(String s) {
      int result = 1 , dummy = 1;

      char temp = s.charAt(0);


      for (int i = 1; i < s.length(); i++) {
         char c = s.charAt(i);

         if(temp != c){
            temp = c;
            result = Math.max(result , dummy);
            dummy = 1;
         }else{
            dummy++;
         }
      }

      result = Math.max(result , dummy);

      return result;
   }
}
