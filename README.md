# Student Grade Management System 📝

A simple Java program to manage student records — calculates total marks, average, and assigns grades based on student performance.


## 📌 Features

- Takes input for multiple students
- Validates marks to ensure they're between 0 and 100
- Calculates total and average
- Assigns grades based on average:
  - A: 80 and above
  - B: 60 – 79
  - C: 40 – 59
  - F: below 40
- Handles invalid inputs gracefully
- Clean, formatted output


## 📷 Sample Output

```
--------------------------------------------------
              STUDENT REPORT CARD              
--------------------------------------------------

Enter number of students:
> 1

Enter details for student 1
Name: Armaan
Roll number: 101
Subject 1 marks: 75
Subject 2 marks: 82
Subject 3 marks: 69

--------------------------------------------------

Name      :       Armaan
Roll number:     101
Subject 1 :       75
Subject 2 :       82
Subject 3 :       69
Total     :       226
Average   :       75.33
Grade     :       B

--------------------------------------------------
```

## 📝 Notes

- Accepts **only three subject marks** per student.
- All marks must be between **0 and 100** — invalid entries are rejected with a prompt.
- Grade is based solely on the **average of the three subjects**


## 📁 File Info

* `StudentGrade.java` — Main program file
