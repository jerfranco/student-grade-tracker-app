public class Main {
  public static void main(String[] args) {
    // Test Case 1: Multiple Students
    Course course1 = new Course("Math 101");

    course1.addStudent(new Student("Alice", new double[]{90, 100}));
    course1.addStudent(new Student("Bob", new double[]{80, 85}));
    course1.addStudent(new Student("Charlie", new double[]{70, 75}));

    System.out.println("---- Test Case 1 ----");
    System.out.println(course1.classmates());
    course1.printClassAverage();


    // Test Case 2: One Student
    Course course2 = new Course("Science");

    course2.addStudent(new Student("Bob", new double[]{50, 60}));

    System.out.println("\n---- Test Case 2 ----");
    System.out.println(course2.classmates());
    course2.printClassAverage();


    // 🧪 Test Case 3: No Students
    Course course3 = new Course("History");

    System.out.println("\n---- Test Case 3 ----");
    System.out.println(course3.classmates());
    course3.printClassAverage();


    // Test Case 4: Perfect Scores
    Course course4 = new Course("Physics");

    course4.addStudent(new Student("TopStudent", new double[]{100, 100, 100}));

    System.out.println("\n---- Test Case 4 ----");
    System.out.println(course4.classmates());
    course4.printClassAverage();


    // Test Case 5: Rounding Check
    Course course5 = new Course("Chemistry");

    course5.addStudent(new Student("Test1", new double[]{90, 91, 92}));
    course5.addStudent(new Student("Test2", new double[]{90, 91, 91}));

    System.out.println("\n---- Test Case 5 ----");
    System.out.println(course5.classmates());
    course5.printClassAverage();


    // Test Case 6: More Students (formatting)
    Course course6 = new Course("English");

    course6.addStudent(new Student("Alice", new double[]{80, 85}));
    course6.addStudent(new Student("Bob", new double[]{70, 75}));
    course6.addStudent(new Student("Charlie", new double[]{60, 65}));
    course6.addStudent(new Student("David", new double[]{90, 95}));

    System.out.println("\n---- Test Case 6 ----");
    System.out.println(course6.classmates());
    course6.printClassAverage();
  }
}
