/*
public class CseStudent extends students{
  int semester;
  String project;

  public CseStudent(String name, int id, int age, int joiningYear, int semester, String project){
    super(name, id, age, joiningYear);
    this.semester = semester;
    this.project = project;
  }

  public void getInfo(){
    System.out.println("Demostrating Method overidding using same signatures in CSE STUDENT - ");
    System.out.println("STUDENTs - ");
    super.getInfo();
    System.out.println("CSE STUDENT - ");
    System.out.println("Name: "+name+"\nAge: "+age+"\nJoining Year:"+joiningYear+"\nWorking project: "+project);
  }

  public void findGraduatingYear(String statusOfProject){
    System.out.println("Demostrating Method overidding using diff signatures in CSE STUDENT -  ");
    System.out.println("STUDENTs - ");
    super.findGraduatingYear();
    System.out.println("CSE STUDENT - ");
    System.out.println("Year of admission of student: "+joiningYear+"\nYear of graduation: "+(joiningYear + 4)+"\nStatus of project - "+statusOfProject);
  }

}
*/

public class CseStudent extends students{
  int semester;
  String project;

  public CseStudent(int year1, String course1, int rollNo1, int semester, String project){
    super(year1, course1, rollNo1);
    this.semester = semester;
    this.project = project;
  }

  public String getUniqueId(int year){
    String uniqueId1 = super.getUniqueId(year);
    System.out.println(uniqueId1);
    System.out.println("From the child CSE class - ");
    String uniqueId2 = course + rollNo + admission;              // after 2015
    return uniqueId2;
  }

}
