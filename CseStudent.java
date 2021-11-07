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
