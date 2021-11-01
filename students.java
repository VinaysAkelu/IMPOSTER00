public class students{
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
