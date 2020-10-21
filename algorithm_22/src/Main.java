public class Main {
  /* public static void main(String[] args) {

      String s = "welcometojava";
      int k = 3;

      String smallest = s.substring(0 , k);
      String largest = s.substring(0 , k);

      int index = 0;
      while (index+k <= s.length()){
         if(s.substring(index, index+k).compareTo(smallest) < 0){
            smallest = s.substring(index, index+k);
         }

         if(s.substring(index, index+k).compareTo(largest) > -1){
            largest = s.substring(index, index+k);
         }

         index++;
      }

//      System.out.println(strings);

   }*/

   /*public static void main(String[] args) {
      String s = "madam";

      boolean isRight = true;

      for(int i = 0; i< s.length()/2 ; i++){
         if(s.charAt(i) != s.charAt(s.length() - (i+1))){
            isRight =false;
         }

         if(!isRight) break;
      }

      System.out.println(isRight ? "Yes" : "No");
   }*/

   private String sort(char[] chars){
      String str = null;


      return str;
   }


   public static void main(String[] args) {
      String a = "anagramm";
      String b = "marganaa";

      boolean isRight = true;
      for (int i = 0; i < a.length(); i++) {
         System.out.print((char) a.toLowerCase().chars().sorted().toArray()[i]);
         System.out.print((char) b.toLowerCase().chars().sorted().toArray()[i]);
         System.out.println("");
//         if ((a.toLowerCase()
//             .chars()
//             .sorted()
//             .toArray()[i] != b.toLowerCase()
//             .chars()
//             .sorted()
//             .toArray()[i]) && (a.length() == b.length())){
//            isRight = false;
//         }
      }

   }
}
