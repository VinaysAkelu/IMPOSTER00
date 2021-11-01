// TO GENERATE UNIQUE ID FOR USER W.R.T YEAR OF ADMISSION

public class Main{
  public static void main(String args[]){
    System.out.println("Hello user -");
    int admission_yr = 2001;
    String course = "CSE";
    int rollno = 183;
    if(admission_yr >= 2015)
    {
      System.out.println("The user's unique id = " + admission_yr + course + rollno);
    }
    else
    {
      System.out.println("The user's unique id = " + rollno + course + admission_yr);
    }
  }
}
