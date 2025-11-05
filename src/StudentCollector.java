import java.util.*;

public class StudentCollector {

    private static final String FILE_NAME = "students.csv";

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<Student> students = new ArrayList<>();

        System.out.println("=== Student Collector App ===");
        System.out.println("Type 'exit' anytime to finish.\n");

        while (true) {
            System.out.print("Enter Student ID (or type 'exit' to finish): ");
            String studentId = scanner.nextLine().trim();
            if (studentId.equalsIgnoreCase("exit")) break;

            if (studentId.isEmpty()) {
                System.out.println("Student ID cannot be empty. Please try again.\n");
                continue;
            }

            System.out.print("Enter Student Name: ");
            String name = scanner.nextLine().trim();
            if (name.isEmpty()) {
                System.out.println("Student Name cannot be empty. Please try again.\n");
                continue;
            }

            students.add(new Student(studentId, name));
            System.out.println("Added: " + studentId + " - " + name + "\n");
        }

        if (students.isEmpty()) {
            System.out.println("No records to save. Goodbye!");
        } else {
            System.out.println("Saved " + students.size() + " record(s) to " + FILE_NAME + ". Goodbye!");
        }
        scanner.close();
    }
}
