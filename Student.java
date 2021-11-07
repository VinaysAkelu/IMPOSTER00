// CLASS STUDENT WITH IT'S PROPERTIES AND GET MODEL

public class Student{
  private int id;
  private String name;
  private int year;

// constructor - acess_modifier class_name(arg[optional])
  public Student(int id1, String name1, int year1)
  {
    id = id1;
    name = name1;
    year = year1;
  }

  public Student()
  {
  }

//method - performing some functionality
  public String getname()
  {
    return name;
  }

  public int getyear()
  {
    return year;
  }
}
