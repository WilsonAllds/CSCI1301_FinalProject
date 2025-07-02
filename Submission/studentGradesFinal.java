import java.util.*;
import java.io.*;


public class studentGradesFinal {

   private double GPA;
   private String studentID;
   private String courseNumber;
//array list creation
   private static Scanner scanner = new Scanner(System.in);
   private static ArrayList<studentGradesFinal> studentDataList = new ArrayList<>();

   public studentGradesFinal(String studentID, String courseNumber, double GPA) {
      this.GPA = GPA;
      this.studentID = studentID;
      this.courseNumber = courseNumber;
   }
//ui creation
   public static void scheduleMenu() {
      System.out.println("Student Grades Menu");
      System.out.println("1. Add student");
      System.out.println("2. Edit Student");
      System.out.println("3. Search Student");
      System.out.println("4. Display all students");
      System.out.println("5. Exit");
      System.out.println("-----------------------------");
   }
//getter and setter methods:
   public void setGPA(double newGPA) {
      this.GPA = newGPA;
   }

   public void setStudentID(String newStudentID) {
      this.studentID = newStudentID;
   }

   public void setCourseNumber(String newCourseNumber) {
      this.courseNumber = newCourseNumber;
   }

   public double getGPA() {
      return GPA;
   }

   public String getStudentID() {
      return studentID;
   }

   public String getCourseNumber() {
      return courseNumber;
   }
//organization header
   public static void header() {
      System.out.println("----------------------------------------");
      System.out.printf("| %-10s | %-12s | %-10s |%n", "Student ID", "Course Number", "Grade");
      System.out.println("----------------------------------------");
   }
//organization header
   public static void line() {
      System.out.println("----------------------------------------");
   }

   public static void addStudentData(String studentID, String courseNumber, double GPA) {
      studentGradesFinal newStudent = new studentGradesFinal(studentID, courseNumber, GPA);
      studentDataList.add(newStudent);
      System.out.println("Student added successfully.");
   }
//display students method
   public static void displayAllStudents() {
      header();

      for (studentGradesFinal student : studentDataList) {
         line();
         System.out.printf("| %-10s | %-12s | %-8.2f |%n",
                 student.getStudentID(), student.getCourseNumber(), student.getGPA());
      }
      line();
   }
//edit choice UI
   public static void editStudent() {
      System.out.println("Edit Student Menu");
      System.out.println("1. Edit Student ID");
      System.out.println("2. Edit Course Number");
      System.out.println("3. Edit GPA");
      System.out.println("4. Back to Main Menu");
      System.out.println("-----------------------------");

      System.out.print("Enter Student ID to edit: ");
      String studentIDToEdit = scanner.nextLine();

      int index = findStudentIndex(studentIDToEdit);

      if (index != -1) {
         boolean editing = true;

         while (editing) {
            System.out.println("Select what to edit:");
            System.out.println("1. Student ID");
            System.out.println("2. Course Number");
            System.out.println("3. GPA");
            System.out.println("4. Done Editing");

            System.out.print("Enter your decision: ");

            if (scanner.hasNextInt()) {
               int editDecision = scanner.nextInt();
               scanner.nextLine();

               switch (editDecision) {
                  case 1:
                     System.out.print("Enter new Student ID: ");
                     String newStudentID = scanner.nextLine();
                     studentDataList.get(index).setStudentID(newStudentID);
                     break;
                  case 2:
                     System.out.print("Enter new Course Number: ");
                     String newCourseNumber = scanner.nextLine();
                     studentDataList.get(index).setCourseNumber(newCourseNumber);
                     break;
                  case 3:
                     System.out.print("Enter new GPA: ");
                     double newGPA = 0;

                     while (true) {
                        if (scanner.hasNextDouble()) {
                           newGPA = scanner.nextDouble();
                           scanner.nextLine();
                           break;
                        } else {
                           System.out.println("Invalid input. Please enter a valid double.");
                           scanner.nextLine();
                        }
                     }

                     studentDataList.get(index).setGPA(newGPA);
                     break;
                  case 4:
                     editing = false;
                     break;
                  default:
                     System.out.println("Invalid decision. Please enter a valid option (1-4).");
               }
            } else {
               System.out.println("Invalid input. Please enter a valid integer (1-4).");
               scanner.nextLine();
            }
         }
      } else {
         System.out.println("Student not found.");
      }
   }

   private static int findStudentIndex(String studentID) {
      for (int i = 0; i < studentDataList.size(); i++) {
         if (studentDataList.get(i).getStudentID().equals(studentID)) {
            return i;
         }
      }
      return -1;
   }
//search student UI
   public static void searchStudents() {
      System.out.println("Search Students Menu");
      System.out.println("1. Search by Student ID");
      System.out.println("2. Search by Course Number");
      System.out.println("3. Search by GPA");
      System.out.println("4. Back to Main Menu");
      System.out.println("-----------------------------");

      System.out.print("Enter your choice: ");
      int searchChoice;

      if (scanner.hasNextInt()) {
         searchChoice = scanner.nextInt();
         scanner.nextLine();
      } else {
         System.out.println("Invalid input. Please enter a valid integer.");
         scanner.nextLine();
         return;
      }
//search choice UI
      switch (searchChoice) {
         case 1:
            System.out.print("Enter Student ID to search: ");
            String studentIDToSearch = scanner.nextLine();
            displaySearchResults(searchByStudentID(studentIDToSearch));
            break;
         case 2:
            System.out.print("Enter Course Number to search: ");
            String courseNumberToSearch = scanner.nextLine();
            displaySearchResults(searchByCourseNumber(courseNumberToSearch));
            break;
         case 3:
            System.out.print("Enter GPA to search: ");
            double gpaToSearch;

            if (scanner.hasNextDouble()) {
               gpaToSearch = scanner.nextDouble();
               scanner.nextLine();
               displaySearchResults(searchByGPA(gpaToSearch));
            } else {
               System.out.println("Invalid input. Please enter a valid double.");
               scanner.nextLine();
            }
            break;
         case 4:
            break;
         default:
            System.out.println("Invalid choice. Please enter a valid option.");
      }
   }

   private static ArrayList<studentGradesFinal> searchByStudentID(String studentID) {
      ArrayList<studentGradesFinal> results = new ArrayList<>();
      for (studentGradesFinal student : studentDataList) {
         if (student.getStudentID().equals(studentID)) {
            results.add(student);
         }
      }
      return results;
   }

   private static ArrayList<studentGradesFinal> searchByCourseNumber(String courseNumber) {
      ArrayList<studentGradesFinal> results = new ArrayList<>();
      for (studentGradesFinal student : studentDataList) {
         if (student.getCourseNumber().equals(courseNumber)) {
            results.add(student);
         }
      }
      return results;
   }

   private static ArrayList<studentGradesFinal> searchByGPA(double gpa) {
      ArrayList<studentGradesFinal> results = new ArrayList<>();
      for (studentGradesFinal student : studentDataList) {
         if (student.getGPA() == gpa) {
            results.add(student);
         }
      }
      return results;
   }

   private static void displaySearchResults(ArrayList<studentGradesFinal> results) {
      if (results.isEmpty()) {
         System.out.println("No matching records found.");
      } else {
         header();
         for (studentGradesFinal student : results) {
            line();
            System.out.printf("| %-10s | %-12s | %-8.2f |%n",
                    student.getStudentID(), student.getCourseNumber(), student.getGPA());
         }
         line();
      }
   }

   public static void main(String[] args) {
      // Sample Data
      addStudentData("202301", "M101", 4.0);
      addStudentData("202302", "P201", 2.0);
      addStudentData("202303", "M101", 4.0);
      addStudentData("202304", "M101", 3.0);

      int choice;

      do {
         scheduleMenu();
         System.out.print("Enter your choice: ");

         String input = scanner.nextLine();

         try {
            choice = Integer.parseInt(input);

            switch (choice) {
               case 1:
                  // Add student options
                  System.out.print("Enter Student ID: ");
                  String newStudentID = scanner.nextLine();
                  System.out.print("Enter Course Number: ");
                  String newCourseNumber = scanner.nextLine();
                  System.out.print("Enter GPA: ");
                  double newGPA = 0;

                  while (true) {
                     if (scanner.hasNextDouble()) {
                        newGPA = scanner.nextDouble();
                        scanner.nextLine();
                        break;
                     } else {
                        System.out.println("Invalid input. Please enter a valid double.");
                        scanner.nextLine();
                     }
                  }

                  addStudentData(newStudentID, newCourseNumber, newGPA);
                  break;
               case 2:
                  editStudent();
                  break;
               case 3:
                  searchStudents();
                  break;
               case 4:
                  displayAllStudents();
                  break;
               case 5:
                  exportDataToFile("studentGradeData.txt");
                  System.out.println("Exiting program.");
                  break;
               default:
                  System.out.println("Invalid choice. Please enter a valid option.");
            }
         } catch (NumberFormatException e) {
            System.out.println("Invalid input. Please enter a valid integer.");
            choice = -1;
         }
      } while (choice != 5);
   }
//data exporting
   private static void exportDataToFile(String fileName) {
      try (FileWriter writer = new FileWriter(fileName)) {
         writer.write("Student ID,Course Number,Grade\n");

              for (studentGradesFinal student : studentDataList) {
            writer.write(String.format("%s,%s,%.2f%n",
                    student.getStudentID(), student.getCourseNumber(), student.getGPA()));
         }

         System.out.println("Data exported to " + fileName);
      } catch (IOException e) {
         System.out.println("An error occurred while exporting data to a file.");
         e.printStackTrace();
      }
   }
}