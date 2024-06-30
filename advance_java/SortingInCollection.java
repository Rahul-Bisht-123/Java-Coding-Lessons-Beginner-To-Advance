package advance_java;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class SortingInCollection {
  public static <T> void main(String[] args) {
    
    List<Integer> list = new ArrayList<>();
    list.add(32);
    list.add(21);
    list.add(58);
    list.add(420);

    //-----------------------------------------------------
    // sorting list of numbers in ascending order
    //-----------------------------------------------------

    Collections.sort(list);
    System.out.println(list);  //[2, 20, 120, 220]

    //-----------------------------------------------------
    // sorting list of numbers on the basis of last digit
    //-----------------------------------------------------

    Comparator<Integer> comparator = new Comparator<Integer>() {

      @Override
      public int compare(Integer n1, Integer n2) {
        if(n1%10 > n2%10){
          return 1;
        }
          return - 1;
      }
    };

    Collections.sort(list,comparator);
    System.out.println(list); //[420, 21, 32, 58]

    //-------------------------------------------------
    // sorting list of the string in alphabetical order
    //-------------------------------------------------

    List<String> list2 = new ArrayList<>();
    list2.add("dog");
    list2.add("cat");
    list2.add("ball");
    list2.add("apple");
    list2.add("rich");
    Comparator<String> comp2 = new Comparator<String>() {

      @Override
      public int compare(String s1, String s2) {
        if(s1.charAt(0) > s2.charAt(0)){
          return 1;
        }
        return -1;}
    };
    Collections.sort(list2,comp2);
    System.out.println(list2);  //[apple, ball, cat, dog, rich]

    //----------------------------------------------
    // sorting list on the basis of length of string 
    //----------------------------------------------

    List<String> list3 = new ArrayList<>();
    list3.add("apple");
    list3.add("cake");
    list3.add("pin");
    list3.add("j");
    list3.add("pi");
    Comparator<String> comp3 = new Comparator<String>() {

      @Override
      public int compare(String s1, String s2) {
        if(s1.length() > s2.length()){
          return 1;
        }
        return -1;}
    };
    Collections.sort(list3,comp3);
    System.out.println(list3);  //[j, pi, pin, cake, apple]

    //----------------------------------------------------
    // sorting list of students on the basis of highest marks 
    //----------------------------------------------------

    List<Student> studentsMarks = new ArrayList<>();
    studentsMarks.add(new Student("Aman" , 98));
    studentsMarks.add(new Student("Bob" , 44));
    studentsMarks.add(new Student("Jack" , 21));
    studentsMarks.add(new Student("John" , 87));

    Comparator<Student> comp4 = (Student s1, Student s2) -> {
        return s1.getMarks() < s2.getMarks() ? 1 : -1 ;
    };

    System.out.println(studentsMarks);
    /*
     [
     Student [name=Aman, marks=98], 
     Student [name=Bob, marks=44], 
     Student [name=Jack, marks=21], 
     Student [name=John, marks=87]
     ]
     */
    Collections.sort(studentsMarks , comp4);
    System.out.println(studentsMarks);

    /*
     [
     Student [name=Aman, marks=98], 
     Student [name=John, marks=87], 
     Student [name=Bob, marks=44], 
     Student [name=Jack, marks=21]
     ]
     */
  }
}


class Student{
  private String name;
  private int marks;

  
  public Student(String name, int marks) {
    this.name = name;
    this.marks = marks;
  }

  public String getName() {
    return name;
  }

  public int getMarks() {
    return marks;
  }
  

  @Override
  public String toString() {
    return "Student [name=" + name + ", marks=" + marks + "]";
  }
}