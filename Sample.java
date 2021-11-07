/*
 * //To print diff messages for diff year admissions using students class
 * public class Sample{
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
*/

public class Sample{
  public static void main(String args[]){
    System.out.println("Hello user ");
    CseStudent s1 = new CseStudent("Vinay", 183, 20, 2019, 5, "Flytekart training prog");
    EceStudent s2 = new EceStudent("Topper", 106, 20, 2019, 5, 9.9f);
    s1.getInfo();
    s1.findGraduatingYear("Not completed");
    s2.getInfo();
    s2.getAge("Female");
  }
}
