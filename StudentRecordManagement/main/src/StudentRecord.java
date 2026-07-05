import java.util.InputMismatchException;
import java.util.Scanner;

public class StudentRecord {
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);

        boolean running = true; // Variable to control the loop

        while (running) {
            System.out.println("\n===== Student Record =====\n");
            System.out.println("Would you like to:");
            System.out.println("1. View student details");
            System.out.println("2. Add a new student");
            System.out.println("3. Update student information");
            System.out.println("4. Exit");
            System.out.print("\nChoose an option: ");

            try {
                int option = input.nextInt();
                input.nextLine(); // Consume the newline character(↵)

                if (option == 1) {
                    if (StudentManagement.getTotalStudents() == 0) {
                    System.out.println("No students have been added yet.");
                    continue; // Skip the rest of the loop and prompt for input again
                    }

                    System.out.print("\nEnter the student's ID: ");
                    int id = input.nextInt();
                    Student student = StudentManagement.findStudentById(id);
                    if (student != null) {
                        student.displayStudentInformation();
                    } else {
                        System.out.println("Student not found.");
                    }

                }

                else if (option == 2) {
                    System.out.print("\nEnter the student's name: ");
                    String name = input.nextLine();
                    System.out.print("\nEnter the student's ID: ");
                    int id = input.nextInt();
                    Student student = StudentManagement.findStudentById(id);
                    if (student != null) {
                        System.out.println("A student with this ID already exists. Please use a unique ID.");
                        continue; // Skip the rest of the loop and prompt for input again
                    }
                    System.out.print("\nEnter the student's age: ");
                    int age = input.nextInt();
                    System.out.print("\nEnter the student's grade: ");
                    double grade = input.nextDouble();
                    Student newStudent = new Student(name, id, age, grade);
                    StudentManagement.addStudent(newStudent);
                    System.out.println("Student added successfully.");
                }

                else if (option == 3) {
                    if (StudentManagement.getTotalStudents() == 0) {
                    System.out.println("No students have been added yet.");
                    continue;
                    }

                    System.out.print("\nEnter the student's ID: ");
                    int id = input.nextInt();
                    input.nextLine(); // Consume the newline character
                    Student student = StudentManagement.findStudentById(id);
                    if (student != null) {
                        System.out.println("\nWhat would you like to update?");
                        System.out.println("1. Name");
                        System.out.println("2. Age");
                        System.out.println("3. Grade");
                        System.out.println("4. Cancel");
                        System.out.print("Choose an option: ");
                        int updateOption = input.nextInt();
                        input.nextLine(); // Consume the newline 

                        if (updateOption == 1) {
                            System.out.print("\nEnter the new name: ");
                        String newName = input.nextLine();
                        student.setName(newName);
                        System.out.println("Student name updated successfully.");
                        }
                        else if (updateOption == 2) {
                            System.out.print("\nEnter the new age: ");
                            int newAge = input.nextInt();
                            input.nextLine(); // Consume the newline character
                            student.setAge(newAge);
                            System.out.println("Student age updated successfully.");
                        }
                        else if (updateOption == 3) {
                            System.out.print("\nEnter the new grade: ");
                            double newGrade = input.nextDouble();
                            input.nextLine(); // Consume the newline character
                            student.setGrade(newGrade);
                            System.out.println("Student grade updated successfully.");
                        }
                        else if (updateOption == 4) {
                            System.out.println("Update canceled.");
                            continue; // Skip the rest of the loop and prompt for input again
                        } else {
                            System.out.println("Invalid option. Update canceled.");
                            continue; // Skip the rest of the loop and prompt for input again
                        }

                    } else {
                        System.out.println("Student not found.");
                    }
                }

                else if (option == 4) {
                    running = false;
                    System.out.println("Exiting the program.");
                    
                }

                else {
                    System.out.println("Invalid option. Please try again.");
                }


            } catch (InputMismatchException e) {
                System.out.println("Invalid input. Please enter a valid option.");
                input.nextLine(); // Consume the invalid input
            }
        }

        input.close(); // Close the scanner

    }
    
}



