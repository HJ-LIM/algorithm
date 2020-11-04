/**
 * 시간 복잡도 예제.
 * */

public class Main {
   public static void main(String[] args) {

//      int n = 5;
//      for (int i = 1; i <= n; i++) {
//         for (int j = 1; j <= i; j++) {
//            System.out.println(i + " : " + j);
//         }
//      }

//      div(10 , 2);
      sqrt(4);


   }

   public static int div(int a, int b){
      int count = 0;
      int sum = b;

      while (sum <= a){
         sum += b;
         count++;
         System.out.println(sum);
      }
      return count;
   }

   public static int sqrt(int n){
      for (int i = 1; i*i <= n ; i++) {
         System.out.println(i);
         if(i*i == n) return i;
      }
      return -1;
   }
}

