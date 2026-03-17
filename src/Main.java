public class Main {
  public static void main(String[] args) {
    double[] grades = {51, 93, 100};
    Student student = new Student("Bob", grades);

    

    System.out.println(student.displayScores());
  }
}
