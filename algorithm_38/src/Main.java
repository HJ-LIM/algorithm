import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Optional;

public class Main {
   public static void main(String[] args) {
      Map<Integer, String> cities = new HashMap<>();
      cities.put(1, "Seoul");
      cities.put(2, "Busan");
      cities.put(3, "Daejeon");

      String city = cities.get(4); // returns null
      int length = city == null ? 0 : city.length(); // null check
      System.out.println(length);

      Optional<String> optional = Optional.ofNullable(cities.get(4));
      length = optional.map(String::length).orElse(0);
      System.out.println(length);


      List<String> cities2 = Arrays.asList("Seoul", "Busan", "Daejeon");
      Optional<String> asOptional = getAsOptional(cities2, 0);
      length = asOptional.map(String::length).orElse(0);
      System.out.println(length);

      asOptional.ifPresent(_city -> {
         System.out.println(_city.length());
      });
   }


   public static <T> Optional<T> getAsOptional(List<T> list, int index) {
      try {
         return Optional.of(list.get(index));
      } catch (ArrayIndexOutOfBoundsException e) {
         return Optional.empty();
      }
   }
}
