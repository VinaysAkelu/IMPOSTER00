//To print diff messages for diff year admissions using students class and CollegeGoer parameter
public class Sample{
  public static void main(String args[]){
    System.out.println("Hello user ");

    students s1 = new CseStudent(2015, "CSE", 183, 5, "Flytekart training");
    //students s2 = new students(2001, "ECE", 37);

    String id1 = s1.getUniqueId(2015);
    System.out.println("Unique ID for admissison from or after 2015 - " + id1);

    boolean isEceType = s1 instanceof EceStudent;
    System.out.println(isEceType);

    CollegeGoer s2 = new EceStudent(2016, "ECE" , 37 , 5 , 9.9f);
    CollegeGoer s3 = new Faculty();

    String id2 = s2.getUniqueId(2016);
    System.out.println("Unique ID for admission after 2015 using ECE student class - "+id2);
    String id3 = s3.getUniqueId(2017);
    System.out.println("Unique ID for admission after 2015 using Faculty class - "+id3);
  }
}

/*
// To print two id for diff classes CSE and ECE student type
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
*/
