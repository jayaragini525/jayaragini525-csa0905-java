import java.util.*;

class Student {
    private String name;
    private int registerNumber;
    private int[] subjectMarks;

    public Student(String name, int registerNumber, int[] subjectMarks) {
        this.name = name;
        this.registerNumber = registerNumber;
        this.subjectMarks = subjectMarks;
    }

    public int calculateTotal() {
        int total = 0;
        for (int mark : subjectMarks) {
            total += mark;
        }
        return total;
    }

    public double calculateAverage() {
        int total = calculateTotal();
        return (double) total / subjectMarks.length;
    }

    public void displayStudentDetails() {
        System.out.println("Student Name: " + name);
        System.out.println("Register Number: " + registerNumber);
        System.out.print("Subject Marks: ");
        for (int mark : subjectMarks) {
            System.out.print(mark + " ");
        }
        System.out.println("\nTotal Marks: " + calculateTotal());
        System.out.println("Average Marks: " + calculateAverage());
    }
}

class StudentDetails {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter student name: ");
        String name = scanner.nextLine();

        System.out.print("Enter register number: ");
        int registerNumber = scanner.nextInt();

        int[] subjectMarks = new int[5];
        System.out.println("Enter subject marks for 5 subjects:");
        for (int i = 0; i < 5; i++) {
            System.out.print("Enter mark for Subject " + (i + 1) + ": ");
            subjectMarks[i] = scanner.nextInt();
        }

       
        Student student = new Student(name, registerNumber, subjectMarks);

        System.out.println("\nStudent Details:");
        student.displayStudentDetails();
    }
}