import java.util.*;
import java.io.*;

public class studentInfo {
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
   public studentInfo(String studentID, String firstName, String lastName, String birthday, String mobileNumber,
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
   
      public static void performOperation(ArrayList<studentInfo> students, int choice) {
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
               studentInfo.header();
               for (studentInfo student : students) {
                  System.out.println(student);
               }
               studentInfo.line();
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
   
      private static void addStudent(ArrayList<studentInfo> students, Scanner scanner) {
         System.out.print("Enter student ID: ");
         String studentID = scanner.nextLine();
        //Enter studentID
      
         //Enter first name
         System.out.print("Enter first name: ");
         String firstName = scanner.nextLine();
      //enter last name
         System.out.print("Enter last name: ");
         String lastName = scanner.nextLine();
      // enter birth date
         System.out.print("Enter birthday (MM/DD/YYYY): ");
         String birthday = scanner.nextLine();
      //enter mobile number
         System.out.print("Enter mobile number (XXX-XXX-XXXX): ");
         String mobileNumber = scanner.nextLine();
      
         System.out.print("Enter email: ");
         String email = scanner.nextLine();
      
         System.out.print("Enter gender: ");
         String gender = scanner.nextLine();
      
         System.out.print("Enter address: ");
         String address = scanner.nextLine();
      
         // Creating new object to add to list
         students.add(new studentInfo(studentID, firstName, lastName, birthday, mobileNumber, email, gender, address));
      
         System.out.println("Student added successfully!");
      }
   
      private static void deleteStudent(ArrayList<studentInfo> students, Scanner scanner) {
         System.out.print("Enter student ID to delete: ");
         String studentIDToDelete = scanner.nextLine();
      
         Iterator<studentInfo> iterator = students.iterator();
         while (iterator.hasNext()) {
            studentInfo student = iterator.next();
            if (studentIDToDelete.equalsIgnoreCase(student.getStudentID())) {
               iterator.remove();
               System.out.println("Student deleted successfully!");
               return;
            }
         }
         System.out.println("Student with ID " + studentIDToDelete + " not found.");
      }
   
      private static void editStudent(ArrayList<studentInfo> students, Scanner scanner) {
         System.out.print("Enter student ID to edit: ");
         String studentIDToEdit = scanner.nextLine();
      
         for (studentInfo student : students) {
            if (studentIDToEdit.equalsIgnoreCase(student.getStudentID())) {
               System.out.println("Editing student with ID: " + studentIDToEdit);
            
               // Ask user for new values
               // Updates address
               System.out.print("Enter new address: ");
               String newAddress = scanner.nextLine();
               student.setAddress(newAddress);
            
               System.out.println("Student information updated successfully!");
               return;
            }
         }
         System.out.println("Student with ID " + studentIDToEdit + " not found.");
      }
   
      private static void searchStudent(ArrayList<studentInfo> students, Scanner scanner) {
         System.out.print("Enter student ID to search: ");
         String studentIDToSearch = scanner.nextLine();
      
         studentInfo.header();
         for (studentInfo student : students) {
            if (studentIDToSearch.equalsIgnoreCase(student.getStudentID())) {
               System.out.println(student);
               studentInfo.line();
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
      System.out.println("---------------------------------------------------------------------------------------------------------------------------");
      System.out.printf("| %-10s | %-10s | %-8s | %-10s | %-12s | %-15s | %-6s | %-24s  |", "Student ID", "First Name",
             "Last Name", "Birth Date", "Mobile Number", "Email", "Gender", "Address");
      System.out.println();
      System.out.println("---------------------------------------------------------------------------------------------------------------------------");
   }

   // Line printer method (organization)
   public static void line() {
      System.out.println("---------------------------------------------------------------------------------------------------------------------------");
   }

   // Method to print students by student ID
   public static void printStudentsByID(ArrayList<studentInfo> students, String targetStudentID) {
      header();
      for (studentInfo student : students) {
         if (targetStudentID.equalsIgnoreCase(student.getStudentID())) {
            System.out.println(student);
         }
      }
      line();
   }

   // Method to print students by first name (none of these methods are case sensitive)
   public static void printStudentsByFirstName(ArrayList<studentInfo> students, String targetFirstName) {
      header();
      for (studentInfo student : students) {
         if (targetFirstName.equalsIgnoreCase(student.getFirstName())) {
            System.out.println(student);
         }
      }
      line();
   }

   // Method to print students by last name 
   public static void printStudentsByLastName(ArrayList<studentInfo> students, String targetLastName) {
      header();
      for (studentInfo student : students) {
         if (targetLastName.equalsIgnoreCase(student.getLastName())) {
            System.out.println(student);
         }
      }
      line();
   }

   // Method to print students by birthday
   public static void printStudentsByBirthday(ArrayList<studentInfo> students, String targetBirthday) {
      header();
      for (studentInfo student : students) {
         if (targetBirthday.equalsIgnoreCase(student.getBirthday())) {
            System.out.println(student);
         }
      }
      line();
   }

   // Method to print students by mobile number
   public static void printStudentsByMobileNumber(ArrayList<studentInfo> students, String targetMobileNumber) {
      header();
      for (studentInfo student : students) {
         if (targetMobileNumber.equalsIgnoreCase(student.getMobileNumber())) {
            System.out.println(student);
         }
      }
      line();
   }

   // Method to print students by email
   public static void printStudentsByEmail(ArrayList<studentInfo> students, String targetEmail) {
      header();
      for (studentInfo student : students) {
         if (targetEmail.equalsIgnoreCase(student.getEmail())) {
            System.out.println(student);
         }
      }
      line();
   }

   // Method to print students by gender 
   public static void printStudentsByGender(ArrayList<studentInfo> students, String targetGender) {
      header();
      for (studentInfo student : students) {
         if (targetGender.equalsIgnoreCase(student.getGender())) {
            System.out.println(student);
         }
      }
      line();
   }

   // Method to print students by address 
   public static void printStudentsByAddress(ArrayList<studentInfo> students, String targetAddress) {
      header();
      for (studentInfo student : students) {
         if (targetAddress.equalsIgnoreCase(student.getAddress())) {
            System.out.println(student);
         }
      }
      line();
   }

   // exports student info to text file
   public static void exportToTextFile(ArrayList<studentInfo> students, String filename) {
      try (PrintWriter writer = new PrintWriter(new FileWriter(filename))) {
         for (studentInfo student : students) {
            writer.println(studentInfo.formatStudentInfo(student));
         }
         System.out.println("Student information exported to text file: " + filename);
      } catch (IOException e) {
         e.printStackTrace();
      }
   }

   // Format student information export for organization to file
   public static String formatStudentInfo(studentInfo student) {
      return String.format("| %-10s | %-10s | %-9s | %-10s | %-13s | %-15s | %-6s | %-25s |", student.getStudentID(),
             student.getFirstName(), student.getLastName(), student.getBirthday(), student.getMobileNumber(),
             student.getEmail(), student.getGender(), student.getAddress());
   }

   public static void main(String[] args) {
      Scanner scan = new Scanner(System.in);
   
      //given sample data 
      ArrayList<studentInfo> studentSampleData = new ArrayList<>();
      studentSampleData.add(new studentInfo("202301", "John", "Doe", "03/12/1995", "123-456-7890", "john@email.com",
             "Male", "123 Main St, Atlanta, GA"));
      studentSampleData.add(new studentInfo("202302", "Alice", "Johnson", "08/25/1997", "987-654-3210",
             "alice@email.com", "Female", "456 Elm St, Atlanta, GA"));
      studentSampleData.add(new studentInfo("202303", "Bob", "Smith", "11/5/1996", "555-123-7890", "bob@email.com",
             "Male", "789 Oak St, Atlanta, GA"));
   
      // UI menu
      while (true) {
         StudentDatabaseMenu.displayMenu();
         System.out.print("Enter your choice (1-6): ");
         int choice = scan.nextInt();
      
         // Consume new line character
         scan.nextLine();
      
         StudentDatabaseMenu.performOperation(studentSampleData, choice);
      }
   }
}