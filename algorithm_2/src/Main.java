
/**
 * alphabet palindrome 검증
 *
 * */

public class Main {

   public static void main(String[] args) {
//      System.out.println("A man, a plan, a canal: Panama".replaceAll("\\W" , ""));
//      System.out.println("ab_a".replaceAll("[^a-zA-Z0-9]" , ""));

      System.out.println(new Solution().isPalindrome("A man, a plan, a canal: Panama") == true);
   }
}

class Solution {
   public boolean isPalindrome(String s) {
      s = s.replaceAll("[^a-zA-Z0-9]" , "");
      s = s.toLowerCase();

      for(int i = 0; i < s.length()/2; i++){
         for(int j = s.length()-1; j > s.length()/2; j--){
            if(s.charAt(i) != s.charAt(j)){
               return false;
            }
         }
      }

      return true;
   }
}
