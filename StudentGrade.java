import java.util.Scanner;
import java.util.InputMismatchException;

class Student {
    String name;
    int roll;
    int sub1, sub2, sub3, total;
    double average;
    String grade;

    // to calculate student grade
    void calc() {
        total = sub1 + sub2 + sub3;
        average = total / 3.0;
        if (average < 40) {
            grade = "F";
        } else if (average < 60) {
            grade = "C";
        } else if (average < 80) {
            grade = "B";
        } else {
            grade = "A";
        }
    }

    // to print out student details
    void display() {
        System.out.println("Name: " + name);
        System.out.println("Roll number: " + roll);
        System.out.println("Subject 1: " + sub1);
        System.out.println("Subject 2: " + sub2);
        System.out.println("Subject 3: " + sub3);
        System.out.println("Total: " + total);
        System.out.println("Average: " + average);
        System.out.println("Grade: " + grade);
        System.out.println();
    }

    static int getIntInput(Scanner sc, String prompt) {
        while (true) {
            try {
                System.out.print(prompt);
                return sc.nextInt();
            } catch (InputMismatchException e) {
                System.out.println("Invalid input! Please enter a valid number.");
                sc.nextLine();
            }
        }
    }
}

// Main class
public class StudentGrade {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = 0;
        System.out.println("Enter number of students:");
        while (true) {
            try {
                n = sc.nextInt();
                if (n <= 0) {
                    System.out.println("Enter a number greater than 0");
                    continue;
                }
                break;
            } catch (InputMismatchException e) {
                System.out.println("Inavlid input! Please enter a number");
                sc.nextLine();
            }
        }
        sc.nextLine();
        Student[] std = new Student[n];

        // Taking user input
        for (int i = 0; i < n; i++) {
            std[i] = new Student();
            System.out.println("Enter details for student " + (i + 1));

            System.out.print("Name: ");
            std[i].name = sc.nextLine();

            std[i].roll = Student.getIntInput(sc, "Roll number: ");
            std[i].sub1 = Student.getIntInput(sc, "Subject 1 marks: ");
            std[i].sub2 = Student.getIntInput(sc, "Subject 2 marks: ");
            std[i].sub3 = Student.getIntInput(sc, "Subject 3 marks: ");

            sc.nextLine(); // Clear newline
            System.out.println();
        }

        // Calculate and display student grades
        for (int i = 0; i < n; i++) {
            std[i].calc();
            std[i].display();
        }

        sc.close();
    }
}