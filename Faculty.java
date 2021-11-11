public class Faculty implements CollegeGoer{
  public String getUniqueId(int year){
    String uniqueId = year + "";
    System.out.println("From the Faculty class - ");
    return uniqueId;
  }
  
}