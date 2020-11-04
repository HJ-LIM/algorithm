public class Main {
   public static void main(String[] args) {
      int i = new Solution().climbStairs(5);
      System.out.println(i);
   }
}

//class Solution {
//   public int climbStairs(int n) {
//      int a = 1;
//      int b = 2;
//
//      if(n == 1) return a;
//      else if(n == 2) return b;
//
//      int result = 0;
//      for (int i = 3; i <= n; i++) {
//         result = a+b;
//
//         a = b;
//         b = result;
//
//      }
//      return result;
//   }
//}

class Solution {
   public int climbStairs(int n) {
      if (n == 1) {
         return 1;
      }
      int[] dp = new int[n + 1];
      dp[1] = 1;
      dp[2] = 2;
      for (int i = 3; i <= n; i++) {
         dp[i] = dp[i - 1] + dp[i - 2];
      }
      return dp[n];
   }
}