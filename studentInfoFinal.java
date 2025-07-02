import java.util.*;
import java.io.*;

public class studentInfoFinal {
   // studentInfo variables
   private String studentID;
   private String firstName;
   private String lastName;
   private String birthday;
   private String mobileNumber;
   private String email;
   private String gender;
   private String address;

   // studentInfo constructor
   public studentInfoFinal(String studentID, String firstName, String lastName, String birthday, String mobileNumber,
           String email, String gender, String address) {
      this.studentID = studentID;
      this.firstName = firstName;
      this.lastName = lastName;
      this.birthday = birthday;
      this.mobileNumber = mobileNumber;
      this.email = email;
      this.gender = gender;
      this.address = address;
   }

   // StudentDatabaseMenu class is created
   public static class StudentDatabaseMenu {
   
      public static void displayMenu() {
         System.out.println("========== Student Database Menu ==========");
         System.out.println("1. Add Student");
         System.out.println("2. Delete Student");
         System.out.println("3. Edit Student");
         System.out.println("4. Search Student");
         System.out.println("5. Display All Students");
         System.out.println("6. Exit");
         System.out.println("==========================================");
      }
   
      public static void performOperation(ArrayList<studentInfoFinal> students, int choice) {
         Scanner scanner = new Scanner(System.in);
      
         switch (choice) {
            case 1:
               // Adding a student
               addStudent(students, scanner);
               break;
         
            case 2:
               // Deleting a student
               deleteStudent(students, scanner);
               break;
         
            case 3:
               // Editing a student
               editStudent(students, scanner);
               break;
         
            case 4:
               // Searching a student
               searchStudent(students, scanner);
               break;
         
            case 5:
               // Display every student
               studentInfoFinal.header();
               for (studentInfoFinal student : students) {
                  System.out.println(student);
               }
               studentInfoFinal.line();
               break;
         
            case 6:
               // Exit function
               exportToTextFile(students, "student_information.txt");
               System.out.println("Exiting");
               System.exit(0);
               break;
         
            default:
               System.out.println("Invalid choice. Please enter a number between 1 and 6.");
         }
      }
   
      private static void addStudent(ArrayList<studentInfoFinal> students, Scanner scanner) {
         System.out.print("Enter student ID: ");
         String studentID = scanner.nextLine();
      
         // Enter first name
         System.out.print("Enter first name: ");
         String firstName = scanner.nextLine();
      
         // Enter last name
         System.out.print("Enter last name: ");
         String lastName = scanner.nextLine();
      
         // Enter birth date
         System.out.print("Enter birthday (MM/DD/YYYY): ");
         String birthday = scanner.nextLine();
      
         // Enter mobile number
         System.out.print("Enter mobile number (XXX-XXX-XXXX): ");
         String mobileNumber = scanner.nextLine();
      
         System.out.print("Enter email: ");
         String email = scanner.nextLine();
      
         System.out.print("Enter gender: ");
         String gender = scanner.nextLine();
      
         System.out.print("Enter address: ");
         String address = scanner.nextLine();
      
         // Creating new object to add to list
         students.add(new studentInfoFinal(studentID, firstName, lastName, birthday, mobileNumber, email, gender,
                address));
      
         System.out.println("Student added successfully!");
      }
   
      private static void deleteStudent(ArrayList<studentInfoFinal> students, Scanner scanner) {
         System.out.print("Enter student ID to delete: ");
         String studentIDToDelete = scanner.nextLine();
      
         Iterator<studentInfoFinal> iterator = students.iterator();
         while (iterator.hasNext()) {
            studentInfoFinal student = iterator.next();
            if (studentIDToDelete.equalsIgnoreCase(student.getStudentID())) {
               iterator.remove();
               System.out.println("Student deleted successfully!");
               return;
            }
         }
         System.out.println("Student with ID " + studentIDToDelete + " not found.");
      }
   
      private static void editStudent(ArrayList<studentInfoFinal> students, Scanner scanner) {
         System.out.print("Enter student ID to edit: ");
         String studentIDToEdit = scanner.nextLine();
      //edit choices
         for (studentInfoFinal student : students) {
            if (studentIDToEdit.equalsIgnoreCase(student.getStudentID())) {
               System.out.println("Editing student with ID: " + studentIDToEdit);
            
               System.out.println("What do you want to edit?");
               System.out.println("1. Gender");
               System.out.println("2. Email");
               System.out.println("3. ID");
               System.out.println("4. Name");
               System.out.println("5. Address");
            //enter edit choices
               int editChoice;
               try {
                  editChoice = Integer.parseInt(scanner.nextLine());
               } catch (NumberFormatException e) {
                  System.out.println("Invalid input. Please enter a number between 1 and 5.");
                  return;
               }
            
               switch (editChoice) {
                  case 1:
                     // Edit student gender
                     System.out.print("Enter new gender: ");
                     String newGender = scanner.nextLine();
                     student.setGender(newGender);
                     break;
               
                  case 2:
                     // Edit student email
                     System.out.print("Enter new email: ");
                     String newEmail = scanner.nextLine();
                     student.setEmail(newEmail);
                     break;
               
                  case 3:
                     // Edit student ID
                     System.out.print("Enter new ID: ");
                     String newID = scanner.nextLine();
                     student.setStudentID(newID);
                     break;
               
                  case 4:
                     // Edit student name
                     System.out.print("Enter new first name: ");
                     String newFirstName = scanner.nextLine();
                     student.setFirstName(newFirstName);
                  
                     System.out.print("Enter new last name: ");
                     String newLastName = scanner.nextLine();
                     student.setLastName(newLastName);
                     break;
               
                  case 5:
                     // Edit student address
                     System.out.print("Enter new address: ");
                     String newAddress = scanner.nextLine();
                     student.setAddress(newAddress);
                     break;
               
                  default:
                     System.out.println("Invalid choice. Please enter a number between 1 and 5.");
                     return;
               }
            
               System.out.println("Student information updated successfully!");
               return;
            }
         }
         System.out.println("Student with ID " + studentIDToEdit + " not found.");
      }
   
      private static void searchStudent(ArrayList<studentInfoFinal> students, Scanner scanner) {
         System.out.print("Enter student ID to search: ");
         String studentIDToSearch = scanner.nextLine();
      
         studentInfoFinal.header();
         for (studentInfoFinal student : students) {
            if (studentIDToSearch.equalsIgnoreCase(student.getStudentID())) {
               System.out.println(student);
               studentInfoFinal.line();
               return;
            }
         }
         System.out.println("Student with ID " + studentIDToSearch + " not found.");
      }
   }

   // Get and set methods:
   public void setStudentID(String a) {
      studentID = a;
   }

   public String getStudentID() {
      return studentID;
   }

   // Set and get methods for firstName
   public void setFirstName(String b) {
      firstName = b;
   }

   public String getFirstName() {
      return firstName;
   }

   // Set and get methods for lastName
   public void setLastName(String c) {
      lastName = c;
   }

   public String getLastName() {
      return lastName;
   }

   // Set and get methods for birthday
   public void setBirthday(String d) {
      birthday = d;
   }

   public String getBirthday() {
      return birthday;
   }

   // Set and get methods for mobileNumber
   public void setMobileNumber(String e) {
      mobileNumber = e;
   }

   public String getMobileNumber() {
      return mobileNumber;
   }

   // Set and get methods for email
   public void setEmail(String f) {
      email = f;
   }

   public String getEmail() {
      return email;
   }

   // Set and get methods for gender
   public void setGender(String f) {
      gender = f;
   }

   public String getGender() {
      return gender;
   }

   // Set and get methods for address
   public void setAddress(String g) {
      address = g;
   }

   public String getAddress() {
      return address;
   }

   // Header method created (organization)
   public static void header() {
      System.out.println(
             "---------------------------------------------------------------------------------------------------------------------------");
      System.out.printf("| %-10s | %-10s | %-8s | %-10s | %-12s | %-15s | %-6s | %-24s  |", "Student ID", "First Name",
             "Last Name", "Birth Date", "Mobile Number", "Email", "Gender", "Address");
      System.out.println();
      System.out.println(
             "---------------------------------------------------------------------------------------------------------------------------");
   }

   // Line printer method (organization)
   public static void line() {
      System.out.println(
             "---------------------------------------------------------------------------------------------------------------------------");
   }

   // Method to print students by student ID
   public static void printStudentsByID(ArrayList<studentInfoFinal> students, String targetStudentID) {
      header();
      for (studentInfoFinal student : students) {
         if (targetStudentID.equalsIgnoreCase(student.getStudentID())) {
            System.out.println(student);
         }
      }
      line();
   }

   // Method to print students by first name (none of these methods are case sensitive)
   public static void printStudentsByFirstName(ArrayList<studentInfoFinal> students, String targetFirstName) {
      header();
      for (studentInfoFinal student : students) {
         if (targetFirstName.equalsIgnoreCase(student.getFirstName())) {
            System.out.println(student);
         }
      }
      line();
   }

   // Method to print students by last name
   public static void printStudentsByLastName(ArrayList<studentInfoFinal> students, String targetLastName) {
      header();
      for (studentInfoFinal student : students) {
         if (targetLastName.equalsIgnoreCase(student.getLastName())) {
            System.out.println(student);
         }
      }
      line();
   }

   // Method to print students by birthday
   public static void printStudentsByBirthday(ArrayList<studentInfoFinal> students, String targetBirthday) {
      header();
      for (studentInfoFinal student : students) {
         if (targetBirthday.equalsIgnoreCase(student.getBirthday())) {
            System.out.println(student);
         }
      }
      line();
   }

   // Method to print students by mobile number
   public static void printStudentsByMobileNumber(ArrayList<studentInfoFinal> students, String targetMobileNumber) {
      header();
      for (studentInfoFinal student : students) {
         if (targetMobileNumber.equalsIgnoreCase(student.getMobileNumber())) {
            System.out.println(student);
         }
      }
      line();
   }

   // Method to print students by email
   public static void printStudentsByEmail(ArrayList<studentInfoFinal> students, String targetEmail) {
      header();
      for (studentInfoFinal student : students) {
         if (targetEmail.equalsIgnoreCase(student.getEmail())) {
            System.out.println(student);
         }
      }
      line();
   }

   // Method to print students by gender
   public static void printStudentsByGender(ArrayList<studentInfoFinal> students, String targetGender) {
      header();
      for (studentInfoFinal student : students) {
         if (targetGender.equalsIgnoreCase(student.getGender())) {
            System.out.println(student);
         }
      }
      line();
   }

   // Method to print students by address
   public static void printStudentsByAddress(ArrayList<studentInfoFinal> students, String targetAddress) {
      header();
      for (studentInfoFinal student : students) {
         if (targetAddress.equalsIgnoreCase(student.getAddress())) {
            System.out.println(student);
         }
      }
      line();
   }

   // exports student info to text file
   public static void exportToTextFile(ArrayList<studentInfoFinal> students, String filename) {
      try (PrintWriter writer = new PrintWriter(new FileWriter(filename))) {
         for (studentInfoFinal student : students) {
            writer.println(studentInfoFinal.formatStudentInfo(student));
         }
         System.out.println("Student information exported to text file: " + filename);
      } catch (IOException e) {
         e.printStackTrace();
      }
   }

   // Format student information export for organization to file
   public static String formatStudentInfo(studentInfoFinal student) {
      return String.format("| %-10s | %-10s | %-9s | %-10s | %-13s | %-15s | %-6s | %-25s |", student.getStudentID(),
             student.getFirstName(), student.getLastName(), student.getBirthday(), student.getMobileNumber(),
             student.getEmail(), student.getGender(), student.getAddress());
   }

   public String toString() {
      return String.format("| %-10s | %-10s | %-9s | %-10s | %-13s | %-15s | %-6s | %-25s |",
             getStudentID(), getFirstName(), getLastName(), getBirthday(), getMobileNumber(),
             getEmail(), getGender(), getAddress());
   }

   public static void main(String[] args) {
      Scanner scan = new Scanner(System.in);
   
      // given sample data
      ArrayList<studentInfoFinal> studentSampleData = new ArrayList<>();
      studentSampleData.add(new studentInfoFinal("202301", "John", "Doe", "03/12/1995", "123-456-7890",
             "john@email.com", "Male", "123 Main St, Atlanta, GA"));
      studentSampleData.add(new studentInfoFinal("202302", "Alice", "Johnson", "08/25/1997", "987-654-3210",
             "alice@email.com", "Female", "456 Elm St, Atlanta, GA"));
      studentSampleData.add(new studentInfoFinal("202303", "Bob", "Smith", "11/5/1996", "555-123-7890",
             "bob@email.com", "Male", "789 Oak St, Atlanta, GA"));
   
      // UI menu
      while (true) {
         StudentDatabaseMenu.displayMenu();
         System.out.print("Enter your choice (1-6): ");
      
         // Prompt user for choice
         int choice;
         try {
            choice = Integer.parseInt(scan.nextLine());
         } catch (NumberFormatException e) {
            System.out.println("Invalid input. Please enter a number between 1 and 6.");
            continue; // Continue to the next iteration of the loop
         }
      
         StudentDatabaseMenu.performOperation(studentSampleData, choice);
      }
   }
}