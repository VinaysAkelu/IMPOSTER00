/*
 * public class students{
  private int admission;
  private String course;
  private int roll_no;

  public students(int year1, String course1, int rollno1){
    admission = year1;
    course = course1;
    roll_no = rollno1;
  }

  public String getunique_id(int year){
    String unique_id1 = year + course + roll_no;
    return unique_id1;
  }

  public String getunique_id(){
    String unique_id2 = roll_no + course + admission;
    return unique_id2;
  }

}
*/

//Create a parent class Student with name, id, age, joiningYear variables. Create child classes CSEStudent, ECEStudent.
//Think of your own variables for these classes. Also think of your own methods on these classes and override them.
//Try method override with same method signature and try it with different signature.
//Try with different return type in parent class and different return type in child class. Tell me what is the output.

public class students{
  String name;
  int id;
  int age;
  int joiningYear;

  public students(String name, int id, int age, int joiningYear){
    this.name = name;
    this.id = id;
    this.age = age;
    this.joiningYear = joiningYear;
  }

  public void getInfo(){
    System.out.println("Name using students : "+name+"\nAge using students : "+age+"\nJoining Year using students :"+joiningYear);
  }

  public void findGraduatingYear(){
    System.out.println("The year of admission of student : "+joiningYear);
    System.out.println("The year of graduation of student : "+(joiningYear + 4));
  }

  public void getAge(){
    System.out.println("The age of the student : "+age);
  }

}  
