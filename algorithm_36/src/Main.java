import java.util.ArrayList;

public class Main {

   public static void main(String[] args) {
      ArrayList<Noti> list = new ArrayList<>();
      list.add(new Noti("a" , false));
      list.add(new Noti("c" , false));
      list.add(new Noti("d" , false));
      list.add(new Noti("e" , false));
      list.add(new Noti("f" , false));



      list.stream().forEach(noti -> noti.setRead(true));



      list.stream().forEach(noti -> {
         System.out.println(noti.isRead());
      });
   }

}

class Noti{
   private String name;
   private boolean isRead;

   public Noti(String name, boolean isRead) {
      this.name = name;
      this.isRead = isRead;
   }

   public String getName() {
      return name;
   }

   public void setName(String name) {
      this.name = name;
   }

   public boolean isRead() {
      return isRead;
   }

   public void setRead(boolean read) {
      isRead = read;
   }
}
