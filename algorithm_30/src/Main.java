import java.util.Arrays;
import java.util.Collections;

public class Main {

   public static void main(String[] args) {
      int i = new Solution().twoSumLessThanK(new int[]{34, 23, 1, 24, 75, 33, 54, 8}, 60);
      System.out.println(i);




   }
}

class Solution {
   public int twoSumLessThanK(int[] A, int K) {
      int s = -1;

      Arrays.sort(A);

      int a = 0 , b = A.length-1;

      while (a < b){
         if(A[a] + A[b] < K){
            s = Math.max(s , A[a] + A[b]);
            a++;
         }else{
            b--;
         }
      }

      return s;
   }
}
