package be.vdab.EX109Course;

public class TestCourse {
    public static void main(String[] args) {
        Course course1 = new Course("JAVA");
        course1.addStudent("Jan");
        course1.addStudent("Peter");
        course1.addStudent("Pol");
        course1.dropStudent("Pol");
        //course1.clear();
        System.out.println("Course: " + course1.getCourseName());
        String[] students = course1.getStudents();
        for (int i = 0; i < course1.getNumberOfStudents(); i++)
            System.out.print(students[i] + " ");
    }
}
