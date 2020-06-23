package be.vdab.EX109Course;

public class Course {
    private String courseName;
    private String[] students = new String[1];
    private int numberOfStudents;

    public Course(String courseName) {
        this.courseName = courseName;
    }

    public void addStudent(String student) {
        if (numberOfStudents == students.length) {
            String[] a = new String[students.length+1];
            for (int i = 0; i < numberOfStudents; i++) {
                a[i] = students[i];
            }
            students = a;
        }
        students[numberOfStudents] = student;
        numberOfStudents++;
    }

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