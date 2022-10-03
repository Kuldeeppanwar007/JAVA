package Assignment_04.oops;
class Student {
  public String name;
  public int rollno;
  public int result;


  void getStudentRecord(String nameNew, int rollno, int result) {
   // this.name = name;
    this.rollno = rollno;
    this.result = result;
  }

  void show() {
    System.out.println("name" + name);
    System.out.println("rollno" + rollno);
    System.out.println("result" + result);
  }
}

public class Add_new_student {

  public static void main(String[] args) {
    Student saloni = new Student();
    saloni.getStudentRecord("saloni", 101, 75);
    saloni.show();
  }

}