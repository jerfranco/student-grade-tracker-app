import java.util.ArrayList;

public class Course {
  
  private String courseName = "";
  private ArrayList<Student> studentList;

  public Course(String courseName) {
    this.courseName = courseName;
    this.studentList = new ArrayList<>();
  }

  public String classmates() {
    
    String classmates = "";
    for(int i = 0; i < studentList.size(); i++) {
      if (i == studentList.size() - 1) {
        classmates = classmates + studentList.get(i).studentName();
      } else {
        classmates = classmates + studentList.get(i).studentName() + ", ";
      }
    }

    return classmates;
  }

  public void addStudent(Student s) {
    studentList.add(s);
  }

  public double classAverage() {
    double total = 0;
    for (Student score : studentList) {
      total += score.getAverage();
    }

    return Math.round(total / studentList.size() * 100) / 100.0;
  }

  public void printClassAverage() {
    System.out.println("Course: " + courseName);
    for (Student name : studentList) {
      System.out.println(name.displayScores());
    }
    if(studentList.size() == 0) {
      System.out.println("There are no students in this class");
    } else {
      System.out.println("The class average is: " + classAverage());
    }

  }
}
