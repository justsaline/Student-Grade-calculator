import java.util.Scanner;

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
        System.out.println("------------------------------------------\n");
        System.out.printf("%-15s: %s\n","Name" , name);
        System.out.printf("%-15s: %d\n","Roll number" ,roll);
        System.out.printf("%-15s: %d\n","Subject 1" , sub1);
        System.out.printf("%-15s: %d\n","Subject 2" , sub2);
        System.out.printf("%-15s: %d\n" ,"Subject 3" , sub3);
        System.out.printf("%-15s: %d\n","Total" , total);
        System.out.printf("%-15s: %.2f\n","Average" , average);
        System.out.printf("%-15s: %s\n","Grade" , grade);
        System.out.println();
    }

    static int getIntInput(Scanner sc, String prompt) {
        while (true) {
            try {
                System.out.print(prompt);
                int value = Integer.parseInt(sc.nextLine());
                if(value<0 || value > 100) {
                    System.out.println("Number must be between 0 and 100. Please try again");
                    continue;
                }
                return value;
            } catch (NumberFormatException e) {
                System.out.println("Invalid input! Please enter a valid number.");
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
                n = Integer.parseInt(sc.nextLine());
                if (n <= 0) {
                    System.out.println("Enter a number greater than 0");
                    continue;
                }
                break;
            } catch (NumberFormatException e) {
                System.out.println("Invalid input! Please enter a number");
            }
        }
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
            System.out.println();
        }
        System.out.println("------------------------------------------");
        System.out.println("        Student Details and Grades");

        // Calculate and display student grades
        for (int i = 0; i < n; i++) {
            std[i].calc();
            std[i].display();
        }

        sc.close();
    }
}