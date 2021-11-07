// TO INITIALIZE A CLASS STUDENT USING PARAMETERIZED AND NON - PARAMETERIZED CONSTRUCTOR
/*
  public class Helloworld{
  public static void main(String args[]){
    System.out.println("Hello user");

    Student s1 = new Student(1,"Rajesh",3);
    Student s2 = new Student();
    System.out.println("Student s1 = " + s1);
    System.out.println("Student s2 = " + s2);

    s2 = s1;
    System.out.println("Student s1 = " + s1);
    System.out.println("Student s2 = " + s2);
    System.out.println("Student s1 = " + s1.getyear());
    System.out.println("Student s1 = " + s1.getname());
  }
}
*/

public class Helloworld{
  public static void main(String args[]){
    System.out.println("Hello user");

        Car car = new Car(4, true, 5, true, "Petrol", 1);
        System.out.println("Wheels count: " + car.getWheelsCount());
        car.printFuelType();
        car.printWheelsCount();

        Car car2 = new Car(4, true, 5, true, "Petrol");
        System.out.println("Wheels count: " + car2.getWheelsCount());
        car2.printFuelType();
        car2.printWheelsCount();
        car2.additionOfTwoNumbers(10, 20);
     }
}
