import java.util.*;

class Student {
    protected int[] marks = new int[4];
    protected int total;

    public void inputMarks() {
        Scanner s = new Scanner(System.in);
        System.out.print("Enter the marks in python: ");
        marks[0] = s.nextInt();
        System.out.print("Enter the marks in c programming: ");
        marks[1] = s.nextInt();
        System.out.print("Enter the marks in Mathematics: ");
        marks[2] = s.nextInt();
        System.out.print("Enter the marks in Physics: ");
        marks[3] = s.nextInt();
      
    }

    void calculateTotal() {
        total = 0;
        for (int mark : marks) {
            total += mark;
        }
        System.out.println("Total = " + total);
    }
}

class Result extends Student {
    protected double aggregate;

    public void calculateAggregate() {
        aggregate = (double) total / 4;
        System.out.println("Aggregate = " + aggregate);
    }
}

class Grade extends Result {
    public void calculateGrade() {
        if (aggregate > 75) {
            System.out.println("DISTINCTION");
        } else if (aggregate >= 60 && aggregate < 75) {
            System.out.println("First Division");
        } else if (aggregate >= 50 && aggregate < 60) {
            System.out.println("Second Division");
        } else if (aggregate >= 40 && aggregate < 50) {
            System.out.println("Third Division");
        } else {
            System.out.println("Fail");
        }
    }
}

 class Main {
    public static void main(String args[]) {
        Grade student= new Grade();
        student.inputMarks();
        student.calculateTotal();
        student.calculateAggregate();
        student.calculateGrade();
    }
}
