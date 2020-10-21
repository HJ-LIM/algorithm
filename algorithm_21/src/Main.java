import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Main {
   /*public static void main(String[] args) {

      Scanner scanner = new Scanner(System.in);

      int i  = 1;
      while (scanner.hasNext()){
         System.out.println((i++) + " " + scanner.nextLine());
      }
   }*/

   /*static Scanner sc = new Scanner(System.in);
   static boolean flag = true;
   static int B = sc.nextInt();
   static int H = sc.nextInt();
   static {
      try {

         if(B <= 0 || H <= 0){
            flag = false;
            throw new Exception("Breadth and height must be positive");
         }
      }catch (Exception e){
         System.out.println(e);
      }
   }

   public static void main(String[] args) {
      if(flag){
         int area=B*H;
         System.out.print(area);
      }

   }*/

   /*public static String findDay(int month, int day, int year) {
      return LocalDate.of(year , month, day).getDayOfWeek().name();
   }

   public static void main(String[] args) {
      System.out.println(findDay(8 , 5 , 2015));
   }*/


   /*public static void main(String[] args) {
      Scanner scanner = new Scanner(System.in);
      double payment = scanner.nextDouble();
      scanner.close();

      // Write your code here.
      NumberFormat us = NumberFormat.getCurrencyInstance(Locale.US);
      NumberFormat india = NumberFormat.getCurrencyInstance(new Locale("en" , "IN"));
      NumberFormat china = NumberFormat.getCurrencyInstance(Locale.CHINA);
      NumberFormat france = NumberFormat.getCurrencyInstance(Locale.FRANCE);

      System.out.println("US: " + us.format(payment));
      System.out.println("India: " + india.format(payment));
      System.out.println("China: " + china.format(payment));
      System.out.println("France: " + france.format(payment));
   }*/

   public static void main(String[] args) {

      List<Student> studentList = new ArrayList<Student>();
      studentList.add(new Student(33, "Rumpa", 3.68));
      studentList.add(new Student(85, "Ashis", 3.85));
      studentList.add(new Student(56, "Samiha", 3.75));
      studentList.add(new Student(19, "Samara", 3.75));
      studentList.add(new Student(22, "Fahim", 3.76));

      Collections.sort(studentList , Comparator.comparing(Student::getCgpa).reversed()
          .thenComparing(Student::getFname).thenComparing(Student::getId));

//      Collections.sort(studentList , new Comparator<Student>(){
//         @Override
//         public int compare(Student o1 , Student o2){
//            int order = -1;
//            if(o1.getCgpa() < o2.getCgpa()){
//               order = 1;
//            }else if(o1.getCgpa() == o2.getCgpa()){
//               order = o1.getFname().compareTo(o2.getFname());
//            }else if(o1.getFname().equals(o2.getFname())){
//               order = o1.getId() < o2.getId() ? -1 : 1;
//            }
//
//            return order;
//         }
//      });

      for(Student st: studentList){
         System.out.println(st.getFname());
      }
   }
}

class Student{
   private int id;
   private String fname;
   private double cgpa;
   public Student(int id, String fname, double cgpa) {
      super();
      this.id = id;
      this.fname = fname;
      this.cgpa = cgpa;
   }
   public int getId() {
      return id;
   }
   public String getFname() {
      return fname;
   }
   public double getCgpa() {
      return cgpa;
   }
}
