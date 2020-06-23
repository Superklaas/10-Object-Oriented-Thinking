package be.vdab.EX109Course;

public class Course {
    private String courseName;
    private String[] students = new String[3];
    private int numberOfStudents;

    public Course(String courseName) {
        this.courseName = courseName;
    }

    public void addStudent(String student) {
        students[numberOfStudents] = student;
        numberOfStudents++;
    }
        /*numberOfStudents++;
        if (numberOfStudents > students.length) {
            String[] students = new String[numberOfStudents];
            for (int i = 0; i < numberOfStudents-1; i++) {
                students[i] = this.students[i];
            }
        }
        students[numberOfStudents] = student;
    }*/

    public String[] getStudents() {
        String[] newStudents = new String[numberOfStudents];
        for (int i = 0; i < numberOfStudents; i++) {
            newStudents[i] = students[i];
        }
        return newStudents;
    }

    public int getNumberOfStudents() {
        return numberOfStudents;
    }

    public String getCourseName() {
        return courseName;
    }

    public void dropStudent(String student) {
        for (int i = 0; i < numberOfStudents; i++) {
            if (students[i] == student) {
                students[i] = "Dropout" + student;
            }
        }
    }

    public void clear() {
        for (int i = 0; i < numberOfStudents; i++) {
            students [i] = "empty";
        }
    }
}