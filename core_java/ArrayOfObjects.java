package core_java;

public class ArrayOfObjects {
  public static void main(String args[]) {
    
    Student s1 = new Student();
    s1.student_roll_number = 101;
    s1.student_name = "Aman";
    s1.student_email = "aman@gmail.com";

    Student s2 = new Student();
    s2.student_roll_number = 102;
    s2.student_name = "Boby";
    s2.student_email = "boby@gmail.com";

    Student s3 = new Student();
    s3.student_roll_number = 103;
    s3.student_name = "Candy";
    s3.student_email = "candy@gmail.com";


    // array of student
    Student students[] = {s1 , s2 , s3};

    for(Student student : students){
      System.out.println(student.student_roll_number + " : " + student.student_name + " : " + student.student_email);
    }
    
    /*  output :
     101 : Aman : aman@gmail.com
     102 : Boby : boby@gmail.com
     103 : Candy : candy@gmail.com
    */

  }
  
}

class Student{
  int student_roll_number;
  String student_name;
  String student_email;
}