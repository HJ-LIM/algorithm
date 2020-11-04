/**
 * palindrome Number
 * */

public class Main {
   public static void main(String[] args) {
      System.out.println(new Solution().isPalindrome(1234321) == true);
//      System.out.println(new Solution().isPalindrome(121) == true);
//      System.out.println(new Solution().isPalindrome(-121) == false);
//      System.out.println(new Solution().isPalindrome(10) == false);
//      System.out.println(new Solution().isPalindrome(-101) == false);

   }
}

//class Solution {
//   public boolean isPalindrome(int x) {
//      return  String.valueOf(x).equals(new StringBuilder(String.valueOf(x)).reverse().toString());
//   }
//}

class Solution{
   public boolean isPalindrome(int x) {
      if(x < 0|| ( 10 <= x && x%10 == 0)){
         return false;
      }

      int halfValue = 0;

      while (x > halfValue){
         halfValue = (x%10) + (halfValue*10);
         x = x/10;
      }
      return (x == halfValue) || (x == halfValue/10);
   }
}