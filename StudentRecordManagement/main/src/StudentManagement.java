public class StudentManagement {

    private static Student[] students = new Student[100]; // Array to store student records
    private static int totalStudents; // Variable to keep track of the total number of students

    public static void addStudent(Student student) {
        if (totalStudents < students.length) {
            students[totalStudents] = student;
            totalStudents++;
        } else {
            System.out.println("Cannot add more students. Maximum limit reached.");
        }
    }

    public static Student findStudentById(int id) {
        for (int i = 0; i < totalStudents; i++) {
            if (students[i].getId() == id) {
                return students[i];
            }
        }
        return null;
    }

    public static int getTotalStudents() {
    return totalStudents;
}

}
