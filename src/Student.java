public class Student {

  // Student name
  private String studentName = "";

  // Test Scores
  private double[] testScores;

  public Student(String name, double[] scores) {
    studentName = name;
    testScores = scores;
  }

  public double getAverage() {
    double sum = 0;

    for (double score : testScores) {
      sum += score;
    }

    double average = Math.round((sum / testScores.length) * 100) / 100.0;
    return average;
    
  }

  public String displayScores() {
    return studentName + " average score is " + getAverage() + " which is " + displayLetterGrade();
  }

  public String displayLetterGrade() {
    if (getAverage() >= 90) {
      return "A";
    } else if (getAverage() < 90 && getAverage() >= 80) {
      return "B";
    } else if (getAverage() < 80 && getAverage() >= 70) {
      return "C";
    } else if (getAverage() < 70 && getAverage() >= 60) {
      return "D";
    } else {
      return "F";
    }
  }
}
