import java.math.BigDecimal;
import java.util.*;

public class Main {
   public static void main(String[] args) {
      String[] s = new String[]{
          "-100",
          "50",
          "0",
          "56.6",
          "90",
          "0.12",
          ".12",
          "02.34",
          "000.000"
      };

      Arrays.sort(s, 0 , 9 ,   new Comparator<String>() {
         @Override
         public int compare(String s1, String s2) {
            BigDecimal a = new BigDecimal(s1);
            BigDecimal b = new BigDecimal(s2);
            return b.compareTo(a); // descending order
         }
      });

      Arrays.sort(s, new Comparator<String>() {
         @Override
         public int compare(String o1, String o2) {
            return new BigDecimal(o2).compareTo(new BigDecimal(o1));
         }
      });

      for(int i=0;i<9;i++){
         System.out.println(s[i]);
      }
   }
}
