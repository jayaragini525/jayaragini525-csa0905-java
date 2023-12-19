interface Subject1 {
    double getSubject1Marks();
}

interface Subject2 {
    double getSubject2Marks();
}

interface Subject3 {
    double getSubject3Marks();
}

interface Subject4 {
    double getSubject4Marks();
}

interface Subject5 {
    double getSubject5Marks();
}

interface Subject6 {
    double getSubject6Marks();
}

interface CalculateAggregate {
    double calculateAggregate();
}

interface DisplayResult {
    void displayResult();
}

class Student implements Subject1, Subject2, Subject3, Subject4, Subject5, Subject6, CalculateAggregate, DisplayResult {
    private double subject1Marks;
    private double subject2Marks;
    private double subject3Marks;
    private double subject4Marks;
    private double subject5Marks;
    private double subject6Marks;

    public Student(double subject1Marks, double subject2Marks, double subject3Marks,
                   double subject4Marks, double subject5Marks, double subject6Marks) {
        this.subject1Marks = subject1Marks;
        this.subject2Marks = subject2Marks;
        this.subject3Marks = subject3Marks;
        this.subject4Marks = subject4Marks;
        this.subject5Marks = subject5Marks;
        this.subject6Marks = subject6Marks;
    }

    @Override
    public double getSubject1Marks() {
        return subject1Marks;
    }

    @Override
    public double getSubject2Marks() {
        return subject2Marks;
    }

    @Override
    public double getSubject3Marks() {
        return subject3Marks;
    }

    @Override
    public double getSubject4Marks() {
        return subject4Marks;
    }

    @Override
    public double getSubject5Marks() {
        return subject5Marks;
    }

    @Override
    public double getSubject6Marks() {
        return subject6Marks;
    }

    @Override
    public double calculateAggregate() {
        return (subject1Marks + subject2Marks + subject3Marks + subject4Marks + subject5Marks + subject6Marks) / 6.0;
    }

    @Override
    public void displayResult() {
        double aggregate = calculateAggregate();
        System.out.println("Aggregate: " + aggregate);

        if (aggregate > 75) {
            System.out.println("Grade: Distinction");
        } else if (aggregate >= 60 && aggregate <= 75) {
            System.out.println("Grade: First Division");
        } else if (aggregate >= 50 && aggregate < 60) {
            System.out.println("Grade: Second Division");
        } else if (aggregate >= 40 && aggregate < 50) {
            System.out.println("Grade: Third Division");
        } else {
            System.out.println("Grade: FAIL");
        }
    }
}

public class StudentGradeProgram {
    public static void main(String[] args) {
        Student student = new Student(80, 75, 85, 90, 70, 65);
        student.displayResult();
    }
}
