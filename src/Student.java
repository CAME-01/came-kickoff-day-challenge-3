public class Student {
    private String studentId;
    private String name;

    public Student(String studentId, String name) {
        this.studentId = studentId.trim();
        this.name = name.trim();
    }

    public String getStudentId() {
        return studentId;
    }

    public String getName() {
        return name;
    }

    public String toString() {
        return "Student id: " + studentId + ", name: " + name;
    }
}
