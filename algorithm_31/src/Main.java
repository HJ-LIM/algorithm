import java.util.HashMap;
import java.util.Map;
import java.util.Stack;

public class Main {
   public static void main(String[] args) {
//      System.out.println(new Solution().isValid("()[]{}") == true);
//      System.out.println(new Solution().isValid("([)]") == false);
//      System.out.println(new Solution().isValid("{[]}") == true);
//      System.out.println(new Solution().isValid("]") == true);
      System.out.println(new Solution().isValid("))") == false);
   }
}

class Solution {
   public boolean isValid(String s) {
      if(s.length()%2 == 1) return false;

      Map<Character, Character> map = new HashMap<>();
      map.put(')','(');
      map.put('}','{');
      map.put(']','[');

      Stack<Character> characters = new Stack<>();

      for (int i = 0; i < s.length(); i++) {
         char c = s.charAt(i);

         if(map.containsKey(c)){
            if(characters.isEmpty() || !map.get(c).equals(characters.pop())){
               return false;
            }
         }else{
            characters.add(c);
         }
      }

      return characters.isEmpty();
   }
}


