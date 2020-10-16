public class Main {

   public static void main(String[] args) {
      System.out.println(new Solution().singleNumber(new int[]{4,1,2,1,2}));
      System.out.println(new Solution().singleNumber(new int[]{2,2,1}));
   }

}

class Solution {
   public int singleNumber(int[] nums) {
      if(nums.length == 1){
         return nums[0];
      }

      int num = 0;

      for(int i = 0; i < nums.length; i++){
         boolean isSingleNumber = true;

         for(int j = nums.length-1; j > i; j--){
            if(nums[i] == nums[j]){
               isSingleNumber = false;
               break;
            }
         }

         if(isSingleNumber){
            num = nums[i];
            break;
         }
      }

      return num;
   }
}
//class Solution {
//
//   public int singleNumber(int[] nums) {
//      int a = 0;
//      for (int i : nums) {
//         a ^= i;
//      }
//      return a;
//   }
//}