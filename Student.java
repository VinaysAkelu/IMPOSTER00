// CLASS STUDENT WITH IT'S PROPERTIES AND GET MODEL

public class Student{
  private int id;
  private String name;
  private int year;

  public Student(int id1, String name1, int year1)
  {
    id = id1;
    name = name1;
    year = year1;
  }

  public Student()
  {
  }

  public String getname()
  {
    return name;
  }

  public int getyear()
  {
    return year;
  }
}
