import java.util.*;
import java.io.*;

public class studentInfoFinal
{
   public static void main(String[] args)
   {
    
      Scanner scan = new Scanner(System.in);
   
        //creating list of the sample data and adding objects to them 
      ArrayList<studentInfoFinal> studentSampleData = new ArrayList<>();  
      studentSampleData.add(new studentInfoFinal("202301", "John", "Doe", "03/12/1995", "123-456-7890", "john@email.com", "Male", "123 Main St, Atlanta, GA"));
      studentSampleData.add(new studentInfoFinal("202302", "Alice", "Johnson", "08/25/1997", "987-654-3210", "alice@email.com", "Female", "456 Elm St, Atlanta, GA"));
      studentSampleData.add(new studentInfoFinal("202303", "Bob", "Smith", "11/5/1996", "555-123-7890", "bob@email.com", "Male", "789 Oak St, Atlanta, GA")); 
       
      start();
   
      while (true)
      {
         System.out.println("Select what you would like to do to the array with the corresponding number below. \n1. Search \n2. Add \n3. Delete \n4. Edit \n5. Exit. ");
         int homeMenuInput = scan.nextInt();
         System.out.println();
      
         switch (homeMenuInput)
         {   
                //will execute "search" algorithm
            case 1:
               System.out.println("What would you like to search? \n1. Student ID \n2. First Name \n3. Last Name \n4. Birth Date \n5. Mobile Number \n6. Email \n7. Gender \n8. Address");
               int searchInput = scan.nextInt();
               System.out.println();
            
               switch(searchInput)
               {
                        //user will be able to search through the array via student ID
                  case 1:
                     System.out.print("Enter the ID to print that Student's information: ");
                     scan.nextLine();
                     String userID = scan.nextLine();
                            
                            //prints out all student info based on user ID input
                     if(userID.equals(studentSampleData.get(0).getStudentID()))
                     {
                        header();
                        System.out.println(studentSampleData.get(0));
                        line();
                     }
                     else if(userID.equals(studentSampleData.get(1).getStudentID()))
                     {
                        header();
                        System.out.println(studentSampleData.get(1));
                        line();
                     }
                     else if(userID.equals(studentSampleData.get(2).getStudentID()))
                     {
                        header();
                        System.out.println(studentSampleData.get(2));
                        line();
                     }
                     else
                     {
                        System.out.println("ID is not in database.");
                     }
                     System.out.println();
                     break;
                        
                        //user will be able to search through the array via first name
                  case 2:
                     System.out.print("Enter the first name to print that Student's information: ");
                     scan.nextLine();
                     String userFirstName = scan.nextLine();
                            
                            //print certain student information based on user first name input (not case sensitive)    
                     if(userFirstName.equalsIgnoreCase(studentSampleData.get(0).getFirstName()))
                     {
                        header();
                        System.out.println(studentSampleData.get(0));
                        line();
                     }
                     else if(userFirstName.equalsIgnoreCase(studentSampleData.get(1).getFirstName()))
                     {
                        header();
                        System.out.println(studentSampleData.get(1));
                        line();
                     }
                     else if(userFirstName.equalsIgnoreCase(studentSampleData.get(2).getFirstName()))
                     {
                        header();
                        System.out.println(studentSampleData.get(2));
                        line();
                     }
                     else
                     {
                        System.out.println("First Name is not in database.");
                     }
                     System.out.println();
                     break;
               
                        //user will be able to search through the array via last name
                  case 3:
                     System.out.print("Enter the last name to print that Student's information: ");
                     scan.nextLine();
                     String userLastName = scan.nextLine();
                  
                            //print certain student information based on user last name input (not case sensitive)
                     if(userLastName.equalsIgnoreCase(studentSampleData.get(0).getLastName()))
                     {
                        header();
                        System.out.println(studentSampleData.get(0));
                        line();
                     }
                     else if(userLastName.equalsIgnoreCase(studentSampleData.get(1).getLastName()))
                     {
                        header();
                        System.out.println(studentSampleData.get(1));
                        line();
                     }
                     else if(userLastName.equalsIgnoreCase(studentSampleData.get(2).getLastName()))
                     {
                        header();
                        System.out.println(studentSampleData.get(2));
                        line();
                     }
                     else
                     {
                        System.out.println("Last Name is not in database.");
                     }
                  
                     System.out.println();
                     break;
               
                        //user will be able to search through the array via birth date
                  case 4:
                     System.out.print("Enter the birthday to print that Student's information (MM/DD/YYYY): ");
                     scan.nextLine();
                     String userBirthday = scan.nextLine();
                            
                            //print certain student information based on user birthday
                     if(userBirthday.equalsIgnoreCase(studentSampleData.get(0).getBirthday()))
                     {
                        header();
                        System.out.println(studentSampleData.get(0));
                        line();
                     }
                     else if(userBirthday.equalsIgnoreCase(studentSampleData.get(1).getBirthday()))
                     {
                        header();
                        System.out.println(studentSampleData.get(1));
                        line();
                     }
                     else if(userBirthday.equalsIgnoreCase(studentSampleData.get(2).getBirthday()))
                     {
                        header();
                        System.out.println(studentSampleData.get(2));
                        line();
                     }
                     else
                     {
                        System.out.println("Birthday is not in database.");
                     }
                  
                     System.out.println();
                     break;
               
                        //user will be able to search through the array via mobile number
                  case 5:
                     System.out.print("Enter the mobile number to print that Student's information (XXX-XXX-XXXX): ");
                     scan.nextLine();
                     String userMobileNumber = scan.nextLine();
                            
                            //print certain student information based on user mobile number
                     if(userMobileNumber.equalsIgnoreCase(studentSampleData.get(0).getMobileNumber()))
                     {
                        header();
                        System.out.println(studentSampleData.get(0));
                        line();
                     }
                     else if(userMobileNumber.equalsIgnoreCase(studentSampleData.get(1).getMobileNumber()))
                     {
                        header();
                        System.out.println(studentSampleData.get(1));
                        line();
                     }
                     else if(userMobileNumber.equalsIgnoreCase(studentSampleData.get(2).getMobileNumber()))
                     {
                        header();
                        System.out.println(studentSampleData.get(2));
                        line();
                     }
                     else
                     {
                        System.out.println("Mobile Number is not in database.");
                     }
                  
                     System.out.println();
                     break;
               
                        //user will be able to search through the array via email
                  case 6:
                     System.out.print("Enter the email to print that student's information: ");
                     scan.nextLine();
                     String userEmail = scan.nextLine();
                  
                            //print certain student information based on user email
                     if(userEmail.equalsIgnoreCase(studentSampleData.get(0).getEmail()))
                     {
                        header();
                        System.out.println(studentSampleData.get(0));
                        line();
                     }
                     else if(userEmail.equalsIgnoreCase(studentSampleData.get(1).getEmail()))
                     {
                        header();
                        System.out.println(studentSampleData.get(1));
                        line();
                     }
                     else if(userEmail.equalsIgnoreCase(studentSampleData.get(2).getEmail()))
                     {
                        header();
                        System.out.println(studentSampleData.get(2));
                        line();
                     }
                     else
                     {
                        System.out.println("Email is not in database.");
                     }
                      
                     System.out.println();
                     break;
               
                        //user will be able to search through the array via gender
                  case 7:
                     System.out.print("Enter the gender to print that student's information (male/female): ");
                     scan.nextLine();
                     String userGender = scan.nextLine();
                    
                     if(userGender.equalsIgnoreCase(studentSampleData.get(0).getGender()) || userGender.equalsIgnoreCase(studentSampleData.get(2).getGender()))
                     {
                        header();
                        System.out.println(studentSampleData.get(0));
                        System.out.println(studentSampleData.get(2));
                        line();
                     }
                     else if (userGender.equalsIgnoreCase(studentSampleData.get(1).getGender()))
                     {
                        header();
                        System.out.println(studentSampleData.get(1));
                        line();
                     }
                     else
                     {
                        System.out.println("Gender is not in database.");
                     }
                  
                     System.out.println();
                     break;
                
                        //user will be able to search through the array via address
                  case 8:
                     System.out.print("Enter the address to print that student's information: ");
                     scan.nextLine();
                     String userAddress = scan.nextLine();
                    
                            //print certain student information based on user address
                     if(userAddress.equalsIgnoreCase(studentSampleData.get(0).getAddress()))
                     {
                        header();
                        System.out.println(studentSampleData.get(0));
                        line();
                     }
                     else if(userAddress.equalsIgnoreCase(studentSampleData.get(1).getAddress()))
                     {
                        header();
                        System.out.println(studentSampleData.get(1));
                        line();
                     }
                     else if(userAddress.equalsIgnoreCase(studentSampleData.get(2).getAddress()))
                     {
                        header();
                        System.out.println(studentSampleData.get(2));
                        line();
                     }
                     else
                     {
                        System.out.println("Address is not in database.");
                     }
                  
                     System.out.println();
                     break;
                        
                        //user will be directed back to the home menu;
                  default:
                     break;
               }
               break;
         
                //will execute "add" algorithm
            case 2:
               start();    
                    
               System.out.println("Enter the new student's Student ID: ");
               scan.nextLine();
               String newStudentID = scan.nextLine();
                    
               System.out.println("Enter the new student's first name: ");    
               String newStudentFirstName = scan.nextLine(); 
                    
               System.out.println("Enter the new student's last name: ");   
               String newStudentLastName = scan.nextLine();  
            
               System.out.println("Enter the new student's birth date (MM/DD/YYYY): "); 
               String newStudentBirthDate = scan.nextLine();   
            
               System.out.println("Enter the new student's mobile number (XXX-XXX-XXXX): "); 
               String newStudentMobileNumber = scan.nextLine();
                    
               System.out.println("Enter the new student's email: "); 
               String newStudentEmail = scan.nextLine();
            
               System.out.println("Enter the new student's gender (female/male): "); 
               String newStudentGender = scan.nextLine();
            
               System.out.println("Enter the new student's address: "); 
               String newStudentAddress = scan.nextLine();
            
                    //adding the new student
               studentSampleData.add(new studentInfoFinal(newStudentID, newStudentFirstName, newStudentLastName, newStudentBirthDate, newStudentMobileNumber, newStudentEmail, newStudentGender, newStudentAddress));
            
               header();
               System.out.format("| %-10s | %-10s | %-9s | %-10s | %-13s | %-15s | %-6s | %-25s |", studentSampleData.get(studentSampleData.size() - 1).getStudentID(), studentSampleData.get(studentSampleData.size() - 1).getFirstName(), studentSampleData.get(studentSampleData.size() - 1).getLastName(), studentSampleData.get(studentSampleData.size() - 1).getBirthday(), studentSampleData.get(studentSampleData.size() - 1).getMobileNumber(), studentSampleData.get(studentSampleData.size() - 1).getEmail(), studentSampleData.get(studentSampleData.size() - 1).getGender(), studentSampleData.get(studentSampleData.size() - 1).getAddress());
               System.out.println();
               line();
            
               System.out.println();
               break;
         
                //will execute "delete" algorithm
        case 3:
   header();
   for (int i = 0; i < studentSampleData.size(); i++) {
      System.out.format("| %-10s | %-10s | %-9s | %-10s | %-13s | %-15s | %-6s | %-25s |",
               studentSampleData.get(i).getStudentID(), studentSampleData.get(i).getFirstName(),
               studentSampleData.get(i).getLastName(), studentSampleData.get(i).getBirthday(),
               studentSampleData.get(i).getMobileNumber(), studentSampleData.get(i).getEmail(),
               studentSampleData.get(i).getGender(), studentSampleData.get(i).getAddress());
      System.out.println();
   }
   line();
   System.out.println("Enter the Student ID of the student you want to delete: ");
   scan.nextLine(); // Consume the newline character left in the buffer
   String deleteID = scan.nextLine();
   
   boolean found = false;
   for (int i = 0; i < studentSampleData.size(); i++) {
      if (deleteID.equals(studentSampleData.get(i).getStudentID())) {
         studentSampleData.remove(i);
         found = true;
         System.out.println("Student deleted successfully.");
         break;
      }
   }

   if (!found) {
      System.out.println("Student not found. No student deleted.");
   }   
   break;
         
                //will execute "edit" algorithm
            case 4:
               header();
               for (int i = 0; i < studentSampleData.size(); i++) {
                  System.out.format("| %-10s | %-10s | %-9s | %-10s | %-13s | %-15s | %-6s | %-25s |",
                                studentSampleData.get(i).getStudentID(), studentSampleData.get(i).getFirstName(),
                                studentSampleData.get(i).getLastName(), studentSampleData.get(i).getBirthday(),
                                studentSampleData.get(i).getMobileNumber(), studentSampleData.get(i).getEmail(),
                                studentSampleData.get(i).getGender(), studentSampleData.get(i).getAddress());
                  System.out.println();
               }
               line();
                
               System.out.println("Which student would you like to edit? (0-" + (studentSampleData.size() - 1) + "): ");
               int editIndex = scan.nextInt();
                
                    // Clear the buffer
               scan.nextLine();
                
                    // Assuming studentInfoFinal class has appropriate set methods for each field
               System.out.println("Enter the new Student ID: ");
               studentSampleData.get(editIndex).setStudentID(scan.nextLine());
                
               System.out.println("Enter the new First Name: ");
               studentSampleData.get(editIndex).setFirstName(scan.nextLine());
                
               System.out.println("Enter the new Last Name: ");
               studentSampleData.get(editIndex).setLastName(scan.nextLine());
                
               System.out.println("Enter the new Birthday: ");
               studentSampleData.get(editIndex).setBirthday(scan.nextLine());
                
               System.out.println("Enter the new Mobile Number: ");
               studentSampleData.get(editIndex).setMobileNumber(scan.nextLine());
                
               System.out.println("Enter the new Email: ");
               studentSampleData.get(editIndex).setEmail(scan.nextLine());
                
               System.out.println("Enter the new Gender: ");
               studentSampleData.get(editIndex).setGender(scan.nextLine());
                
               System.out.println("Enter the new Address: ");
               studentSampleData.get(editIndex).setAddress(scan.nextLine());
                
                    // Print the updated list
               header();
               for (int i = 0; i < studentSampleData.size(); i++) {
                  System.out.format("| %-10s | %-10s | %-9s | %-10s | %-13s | %-15s | %-6s | %-25s |",
                                studentSampleData.get(i).getStudentID(), studentSampleData.get(i).getFirstName(),
                                studentSampleData.get(i).getLastName(), studentSampleData.get(i).getBirthday(),
                                studentSampleData.get(i).getMobileNumber(), studentSampleData.get(i).getEmail(),
                                studentSampleData.get(i).getGender(), studentSampleData.get(i).getAddress());
                  System.out.println();
               }
               line();
            
               System.out.println();
               break;
         
                //program ends and student information will be sent to a file
            default:
               header();
               try (FileWriter fileWriter = new FileWriter("studentInfoFinal.txt")) {
                  for (int i = 0; i < studentSampleData.size(); i++) {
                     System.out.format("| %-10s | %-10s | %-9s | %-10s | %-13s | %-15s | %-6s | %-25s |",
                        studentSampleData.get(i).getStudentID(), studentSampleData.get(i).getFirstName(),
                        studentSampleData.get(i).getLastName(), studentSampleData.get(i).getBirthday(),
                        studentSampleData.get(i).getMobileNumber(), studentSampleData.get(i).getEmail(),
                        studentSampleData.get(i).getGender(), studentSampleData.get(i).getAddress());
                     System.out.println();
                  
                  // Writing to the file
                     fileWriter.write(studentSampleData.get(i).toString() + "\n");
                  }
                  line();
                  System.out.println("Student Information is created in a text file.");
               } catch (IOException e) {
                  e.printStackTrace();
                  System.out.println("Error writing to file.");
               }
               System.exit(0);   }
      }
   }

    //declaring variables for studentInfoFinal class
   private String studentID;
   private String firstName;
   private String lastName;
   private String birthday;
   private String mobileNumber;
   private String email;
   private String gender;
   private String address;
    
    //set and get method for studentID variable
   public void setStudentID(String a)
   {
      studentID = a;
   }
    
   public String getStudentID()
   {
      return studentID;
   }
    
    //set and get method for firstName variable
   public void setFirstName(String b)
   {
      firstName = b;
   }
    
   public String getFirstName()
   {
      return firstName;
   }
    
    //set and get method for lastName variable
   public void setLastName(String c)
   {
      lastName = c;
   }
    
   public String getLastName()
   {
      return lastName;
   }
    
    //set and get method for birthday variable
   public void setBirthday(String d)
   {
      birthday = d;
   }
    
   public String getBirthday()
   {
      return birthday;
   }
    
    //set and get method for mobileNumber variable
   public void setMobileNumber(String e)
   {
      mobileNumber = e;
   }
    
   public String getMobileNumber()
   {
      return mobileNumber;
   }
    
    //set and get method for email variable
   public void setEmail(String f)
   {
      email = f;
   }
    
   public String getEmail()
   {
      return email;
   }
    
    //set and get method for gender variable
   public void setGender(String f)
   {
      gender = f;
   }
    
   public String getGender()
   {
      return gender;
   }
    
    //set and get method for address variable
   public void setAddress(String g)
   {
      address = g;
   }
    
   public String getAddress()
   {
      return address;
   }
    
   public studentInfoFinal(String studentID, String firstName, String lastName, String birthday, String mobileNumber, String email, String gender, String address)
   {
      this.studentID = studentID;
      this.firstName = firstName;
      this.lastName = lastName;
      this.birthday = birthday;
      this.mobileNumber = mobileNumber;
      this.email = email;
      this.gender = gender;
      this.address = address;
   }
    
    //this creates the header
   public static void header()
   {
      System.out.println("---------------------------------------------------------------------------------------------------------------------------");
      System.out.printf("| %-10s | %-10s | %-8s | %-10s | %-12s | %-15s | %-6s | %-24s  |", "Student ID", "First Name", "Last Name", "Birth Date", "Mobile Number", "Email", "Gender", "Address");
      System.out.println();
      System.out.println("---------------------------------------------------------------------------------------------------------------------------");
   }
    
    //prints a dashed line
   public static void line()
   {
      System.out.println("---------------------------------------------------------------------------------------------------------------------------");
   }
    
    //overrides
   public String toString() 
   {
      return String.format("| %-10s | %-10s | %-9s | %-10s | %-13s | %-15s | %-6s | %-25s |", getStudentID(), getFirstName(), getLastName(), getBirthday(), getMobileNumber(), getEmail(), getGender(), getAddress());
   }

    //method that prints out the students by student ID
   public static void printStudentsByID(ArrayList<studentInfoFinal> students, String targetStudentID)
   {
      header();
      for (studentInfoFinal student : students)
      {
         if(targetStudentID.equalsIgnoreCase(student.getStudentID()))
         {
            System.out.println(student);
         }
      }
      line();
   }
   
   //method that prints out the students by first name (not case-sensitive)
   public static void printStudentsByFirstName(ArrayList<studentInfoFinal> students, String targetFirstName)
   {
      header();
      for (studentInfoFinal student : students)
      {
         if(targetFirstName.equalsIgnoreCase(student.getFirstName()))
         {
            System.out.println(student);
         }
      }
      line();
   }
   
   //method that prints out the students by last name (not case-sensitive)
   public static void printStudentsByLastName(ArrayList<studentInfoFinal> students, String targetLastName)
   {
      header();
      for (studentInfoFinal student : students)
      {
         if(targetLastName.equalsIgnoreCase(student.getLastName()))
         {
            System.out.println(student);
         }
      }
      line();
   }
   
   //method that prints out the students by birthday
   public static void printStudentsByBirthday(ArrayList<studentInfoFinal> students, String targetBirthday)
   {
      header();
      for (studentInfoFinal student : students)
      {
         if(targetBirthday.equalsIgnoreCase(student.getBirthday()))
         {
            System.out.println(student);
         }
      }
      line();
   }
   
   //method that prints out the students by mobile number
   public static void printStudentsByMobileNumber(ArrayList<studentInfoFinal> students, String targetMobileNumber)
   {
      header();
      for (studentInfoFinal student : students)
      {
         if(targetMobileNumber.equalsIgnoreCase(student.getMobileNumber()))
         {
            System.out.println(student);
         }
      }
      line();
   }
   
   //method that prints out the students by email (not case-sensitive)
   public static void printStudentsByEmail(ArrayList<studentInfoFinal> students, String targetEmail)
   {
      header();
      for (studentInfoFinal student : students)
      {
         if(targetEmail.equalsIgnoreCase(student.getEmail()))
         {
            System.out.println(student);
         }
      }
      line();
   }

   //method that prints out the students by gender (not case-sensitive)
   public static void printStudentsByGender(ArrayList<studentInfoFinal> students, String targetGender) 
   {
      header();
      for (studentInfoFinal student : students) 
      {
         if (targetGender.equalsIgnoreCase(student.getGender())) 
         {
            System.out.println(student);
         }
      }
      line();
   }
   
   //method that prints out the students by gender (not case-sensitive)
   public static void printStudentsByAddress(ArrayList<studentInfoFinal> students, String targetAddress) 
   {
      Scanner scan = new Scanner(System.in);
      String userID = scan.nextLine();
      header();
      for (studentInfoFinal student : students) 
      {
         if (targetAddress.equalsIgnoreCase(student.getAddress())) 
         {
            System.out.println(student);
         }
      }
      line();
   }

   public static void start()
   {
        //creating the header category for the StudentInfo class array in a table format
      System.out.println("---------------------------------------------------------------------------------------------------------------------------");
      System.out.printf("| %-10s | %-10s | %-8s | %-10s | %-12s | %-15s | %-6s | %-24s  |", "Student ID", "First Name", "Last Name", "Birth Date", "Mobile Number", "Email", "Gender", "Address");
      System.out.println();
      System.out.println("---------------------------------------------------------------------------------------------------------------------------");
        
        //creating list of the sample data and adding objects to them 
      ArrayList<studentInfoFinal> studentSampleData = new ArrayList<>();  
      studentSampleData.add(new studentInfoFinal("202301", "John", "Doe", "03/12/1995", "123-456-7890", "john@email.com", "Male", "123 Main St, Atlanta, GA"));
      studentSampleData.add(new studentInfoFinal("202302", "Alice", "Johnson", "08/25/1997", "987-654-3210", "alice@email.com", "Female", "456 Elm St, Atlanta, GA"));
      studentSampleData.add(new studentInfoFinal("202303", "Bob", "Smith", "11/5/1996", "555-123-7890", "bob@email.com", "Male", "789 Oak St, Atlanta, GA")); 
        
        
        //iterates over the list   
      for(studentInfoFinal studentInfoFinal: studentSampleData)  
      {  
         System.out.format("| %-10s | %-10s | %-9s | %-10s | %-13s | %-15s | %-6s | %-25s |", studentInfoFinal.getStudentID(), studentInfoFinal.getFirstName(), studentInfoFinal.getLastName(), studentInfoFinal.getBirthday(), studentInfoFinal.getMobileNumber(), studentInfoFinal.getEmail(), studentInfoFinal.getGender(), studentInfoFinal.getAddress());
         System.out.println();
      }  
      line();
   
      System.out.println("\n\n");
   }
   private static void exportToFile(ArrayList<studentInfoFinal> studentData) {
      try {
         FileWriter fileWriter = new FileWriter("student_information.txt");
         PrintWriter printWriter = new PrintWriter(fileWriter);
      
        // Writing the header to the file
         printWriter.println("Student ID\tFirst Name\tLast Name\tBirth Date\tMobile Number\tEmail\tGender\tAddress");
      
        // Writing student information to the file
         for (studentInfoFinal student : studentData) {
            printWriter.println(student.getStudentID() + "\t" + student.getFirstName() + "\t" + student.getLastName() +
                    "\t" + student.getBirthday() + "\t" + student.getMobileNumber() + "\t" +
                    student.getEmail() + "\t" + student.getGender() + "\t" + student.getAddress());
         }
      
         printWriter.close();
         System.out.println("Student Information is created in a text file.");
      } catch (IOException e) {
         System.err.println("Error exporting data to file: " + e.getMessage());
         e.printStackTrace();  // Print the stack trace for more information
      }
   }
}