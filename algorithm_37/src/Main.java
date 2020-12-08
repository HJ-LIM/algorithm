import java.math.BigInteger;

public class Main {
   public static void main(String[] args) {
//      System.out.println(new Solution().addBinary("11" , "1"));
//      System.out.println(new Solution().addBinary("1010" , "1011"));
      System.out.println(new Solution().addBinary("10100000100100110110010000010101111011011001101110111111111101000000101111001110001111100001101" , "110101001011101110001111100110001010100001101011101010000011011011001011101111001100000011011110011"));

   }
}

class Solution {
   public String addBinary(String a, String b) {
//      int n = a.length(), m = b.length();
//      if (n < m) return addBinary(b, a);
//      int L = Math.max(n, m);
//
//      StringBuilder sb = new StringBuilder();
//      int carry = 0, j = m - 1;
//      for(int i = L - 1; i > -1; --i) {
//         if (a.charAt(i) == '1') ++carry;
//         if (j > -1 && b.charAt(j--) == '1') ++carry;
//
//         if (carry % 2 == 1) sb.append('1');
//         else sb.append('0');
//
//         carry /= 2;
//      }
//      if (carry == 1) sb.append('1');
//      sb.reverse();
//
//      return sb.toString();
      return null;
   }
}
