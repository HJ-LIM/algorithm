import java.math.BigDecimal;

public class Main {

   public static void main(String[] args) {
      int[][] arr = new int[6][6];

      String[] str = new String[6];
      str[0] = "-1 -1 0 -9 -2 -2";
      str[1] = "-2 -1 -6 -8 -2 -5";
      str[2] = "-1 -1 -1 -2 -3 -4";
      str[3] = "-1 -9 -2 -4 -4 -5";
      str[4] = "-7 -3 -3 -2 -9 -9";
      str[5] = "-1 -3 -1 -2 -4 -5";
      for (int i = 0; i < 6; i++) {
         String[] arrRowItems = str[i].split(" ");
//         scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

         for (int j = 0; j < 6; j++) {
            int arrItem = Integer.parseInt(arrRowItems[j]);
            arr[i][j] = arrItem;
         }
      }

      int y = 0;
      int result = Integer.MIN_VALUE;

      while (y <= arr.length-3){
         int x = 0;
         while (x <= arr[0].length-3 ){
            int sum = 0;

            sum += arr[y][x]
                + arr[y][x+1]
                + arr[y][x+2]
                + arr[y+1][x+1]
                + arr[y+2][x]
                + arr[y+2][x+1]
                + arr[y+2][x+2];

            result = sum > result ? sum : result;

            x++;
         }
         y++;
      }
      System.out.println(result);
   }

}
