public class Sample{
  public static void main(String args[]){
    System.out.println("Hello user ");
    students s1 = new students(2015, "CSE", 183);
    students s2 = new students(2001, "ECE", 37);
    String id1 = s1.getunique_id(2015);
    System.out.println("Unique ID for admissison from or after 2015 - " + id1);
    String id2 = s2.getunique_id();
    System.out.println("Unique ID for admissison before 2015 - " + id2);
  }
}
