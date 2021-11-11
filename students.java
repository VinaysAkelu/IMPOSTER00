public class students implements CollegeGoer{
  int admission;
  String course;
  int rollNo;

  public students(int year1, String course1, int rollNo1){
    admission = year1;
    course = course1;
    rollNo = rollNo1;
  }

  public String getUniqueId(int year){
    System.out.println("From the parent class - ");
    String uniqueId1 = year + course + rollNo;                   // after 2015
    return uniqueId1;
  }

  public String getUniqueId(){
    String uniqueId2 = rollNo + course + admission;              // before 2015
    return uniqueId2;
  }

}

/*
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
*/
