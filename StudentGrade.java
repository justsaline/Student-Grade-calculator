import java.util.Scanner;

class Student {
    String name;
    int roll;
    int sub1, sub2, sub3, total;
    double average;
    String grade;

    //to calculate student grade
    void calc() {
        total = sub1 + sub2 + sub3;
        average = total / 3.0;
        if(average< 40) {
            grade = "F";
        } else if(average < 60) {
            grade = "C";
        } else if(average < 80) {
            grade = "B";
        } else {
            grade = "A";
        }
    }

    //to print out student details
    void display() {
        System.out.println("Name: " + name);
        System.out.println("Subject 1: " + sub1);
        System.out.println("Subject 2: " + sub2);
        System.out.println("Subject 3: " + sub3);
        System.out.println("Total: " + total);
        System.out.println("Average: " + average);
        System.out.println("Grade: " + grade);
        System.out.println();
    }
}

//Main class
public class StudentGrade { 
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number of students:");
        int n = sc.nextInt();
        sc.nextLine();
        Student[] std = new Student[n];

        //Taking user input
        for(int i = 0; i<n; i++) {
            std[i] = new Student();
            System.out.println("Enter Student name");
            std[i].name = sc.nextLine();
            System.out.println("Enter roll no.");
            std[i].roll = sc.nextInt();
            System.out.println("Enter marks for Subject 1:");
            std[i].sub1 = sc.nextInt();
            System.out.println("Enter marks for Subject 2:");
            std[i].sub2 = sc.nextInt();
            System.out.println("Enter marks for Subject 3:");
            std[i].sub3 = sc.nextInt();
            sc.nextLine();
            System.out.println();
        }

        //Calculating student grade
        for(int i=0; i<n; i++) {
            std[i].calc();
        }

        //Displaying output
        for(int i=0; i<n; i++) {
            std[i].display();
        }
    }
}