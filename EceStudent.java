/*
public class EceStudent extends students{
  int semester;
  float cgpa;

  public EceStudent(String name, int id, int age, int joiningYear, int semester, float cgpa){
    super(name, id, age, joiningYear);
    this.semester = semester;
    this.cgpa = cgpa;
  }

  public void getInfo(){
    System.out.println("Demostrating Method overidding using same signatures in ECE STUDENT - ");
    System.out.println("STUDENTs - ");
    super.getInfo();
    System.out.println("Ece Student - ");
    System.out.println("Name : "+name+"\nAge : "+age+"\nJoining Year :"+joiningYear+"\nStudent cgpa : "+cgpa);
  }

  public void getAge(String gender){
    System.out.println("Demostrating Method overidding using diff signatures in ECE STUDENT - ");
    System.out.println("STUDENTs - ");
    super.getAge();
    System.out.println("Ece Student - ");
    System.out.println("The age of the student : "+age+"\nGender of the student - "+gender);
  }

}
*/

public class EceStudent extends students{
  int semester;
  float cgpa;

  public EceStudent(int year1, String course1, int rollNo1, int semester, float cgpa){
    super(year1, course1, rollNo1);
    this.semester = semester;
    this.cgpa = cgpa;
  }

  public String getUniqueId(int year){
    String uniqueId1 = super.getUniqueId(year);
    System.out.println(uniqueId1);
    System.out.println("From the child ECE class - ");
    String uniqueId2 = course + rollNo + admission;              // after 2015
    return uniqueId2;
  }
}
