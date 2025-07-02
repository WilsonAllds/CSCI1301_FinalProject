import java.util.*;
import java.io.*;

public class courseInfoFinal {
   //declaring variables for courseInfoFinal class
   private String courseNumber;
   private String courseName;
   private String creditNumber;
   private String prereqCourse;
   
   //set and get method for courseNumber variable
   public void setCourseNumber(String a)
   {
      courseNumber = a;
   }
   
   public String getCourseNumber()
   {
      return courseNumber;
   }
   
   //set and get method for courseName variable
   public void setCourseName(String b)
   {
      courseName = b;
   }
   
   public String getCourseName()
   {
      return courseName;
   }
   
   //set and get method for creditNumber variable
   public void setCreditNumber(String c)
   {
      creditNumber = c;
   }
   
   public String getCreditNumber()
   {
      return creditNumber;
   }
   
   //set and get method for prereqCourse
   public void setPrereqCourse(String d)
   {
      prereqCourse = d;
   }
   
   public String getPrereqCourse()
   {
      return prereqCourse;
   }

   public courseInfoFinal(String courseNumber, String courseName, String creditNumber, String prereqCourse)
   {
      this.courseNumber = courseNumber;
      this.courseName = courseName;
      this.creditNumber = creditNumber;
      this.prereqCourse = prereqCourse;
   }

   //this creates the header
   public static void header()
   {
      System.out.println("----------------------------------------------------------------------------------");
      System.out.printf("| %-15s | %-20s | %-15s | %-15s |", "Course Number", "Course Name", "Credit Number", "Prerequisite Course");
      System.out.println();
      System.out.println("----------------------------------------------------------------------------------");
   }
   
   //prints a dashed line
   public static void line()
   {
      System.out.println("----------------------------------------------------------------------------------");
   }

   //overrides
   public String toString() 
   {
      return String.format("| %-15s | %-20s | %-15s | %-19s |", getCourseNumber(), getCourseName(), getCreditNumber(), getPrereqCourse());
   }

   public static void start()
   {
      //creating the header category for the CourseInfo class array in a table format
      System.out.println("----------------------------------------------------------------------------------");
      System.out.printf("| %-15s | %-20s | %-15s | %-15s |", "Course Number", "Course Name", "Credit Number", "Prerequisite Course");
      System.out.println();
      System.out.println("----------------------------------------------------------------------------------");
   
      //creating list of the sample data and adding objects to them 
      ArrayList<courseInfoFinal> courseSampleData = new ArrayList<>();  
      courseSampleData.add(new courseInfoFinal("M101", "Calculus I", "3", "None"));
      courseSampleData.add(new courseInfoFinal("M102", "Calculus II", "3", "M101"));
      courseSampleData.add(new courseInfoFinal("P201", "Physics I", "4", "Math 101")); 
      courseSampleData.add(new courseInfoFinal("P202", "Physics II", "4", "P201")); 
      courseSampleData.add(new courseInfoFinal("C201", "Chemistry I", "3", "Math 101")); 
      courseSampleData.add(new courseInfoFinal("C301", "Advanced Chemistry", "3", "M101, C201")); 
   
      //iterates over the list   
      for(courseInfoFinal courseInfoFinal: courseSampleData)  
      {  
         System.out.format("| %-15s | %-20s | %-15s | %-19s |", courseInfoFinal.getCourseNumber(), courseInfoFinal.getCourseName(), courseInfoFinal.getCreditNumber(), courseInfoFinal.getPrereqCourse());
         System.out.println();
      }  
      line();
   
      System.out.println("\n\n");
   }

   public static void exportToFile(ArrayList<courseInfoFinal> courseData) {
      try (PrintWriter writer = new PrintWriter(new FileWriter("course_info.txt"))) {
         // Write header to the file
         writer.println("Course Number | Course Name              | Credit Number | Prerequisite Course");
      
         // Write each course information to the file
         for (courseInfoFinal course : courseData) {
            writer.printf("%-14s | %-24s | %-13s | %-20s%n",
                   course.getCourseNumber(), course.getCourseName(), course.getCreditNumber(), course.getPrereqCourse());
         }
      
         System.out.println("Course Information is was saved in 'course_info.txt'.");
      } catch (IOException e) {
         System.err.println("Error exporting data to file: " + e.getMessage());
      }
   }

   public static void main(String[] args) {
      Scanner scan = new Scanner(System.in);
   
    //creating list of the sample data and adding objects to them
      ArrayList<courseInfoFinal> courseSampleData = new ArrayList<>();
      courseSampleData.add(new courseInfoFinal("M101", "Calculus I", "3", "None"));
      courseSampleData.add(new courseInfoFinal("M102", "Calculus II", "3", "M101"));
      courseSampleData.add(new courseInfoFinal("P201", "Physics I", "4", "Math 101"));
      courseSampleData.add(new courseInfoFinal("P202", "Physics II", "4", "P201"));
      courseSampleData.add(new courseInfoFinal("C201", "Chemistry I", "3", "Math 101"));
      courseSampleData.add(new courseInfoFinal("C301", "Advanced Chemistry", "3", "M101, C201"));
   
      start();
   
      while (true) {
         System.out.println("Select what you would like to do to the array with the corresponding number below. \n1. Search \n2. Add \n3. Delete \n4. Edit \n5. Exit. ");
         int homeMenuInput = scan.nextInt();
         System.out.println();
      
         switch (homeMenuInput) {
            //will execute "search" algorithm
            case 1:
               System.out.println("What would you like to search? \n1. Course Number \n2. Course Name \n3. Credit Number \n4. Prerequisite Course");
               int searchInput = scan.nextInt();
               System.out.println();
            
               switch (searchInput) {
                  case 1:
                     System.out.print("Enter the course number to print that course's information: ");
                     scan.nextLine();
                     String userNumber = scan.nextLine();
                  
                     if (userNumber.equalsIgnoreCase(courseSampleData.get(0).getCourseNumber())) {
                        header();
                        System.out.println(courseSampleData.get(0));
                        line();
                     } else if (userNumber.equalsIgnoreCase(courseSampleData.get(1).getCourseNumber())) {
                        header();
                        System.out.println(courseSampleData.get(1));
                        line();
                     } else if (userNumber.equalsIgnoreCase(courseSampleData.get(2).getCourseNumber())) {
                        header();
                        System.out.println(courseSampleData.get(2));
                        line();
                     } else if (userNumber.equalsIgnoreCase(courseSampleData.get(3).getCourseNumber())) {
                        header();
                        System.out.println(courseSampleData.get(3));
                        line();
                     } else if (userNumber.equalsIgnoreCase(courseSampleData.get(4).getCourseNumber())) {
                        header();
                        System.out.println(courseSampleData.get(4));
                        line();
                     } else if (userNumber.equalsIgnoreCase(courseSampleData.get(5).getCourseNumber())) {
                        header();
                        System.out.println(courseSampleData.get(5));
                        line();
                     } else {
                        System.out.println("Course Number is not in database.");
                     }
                     System.out.println();
                     break;
               
                  case 2:
                     System.out.print("Enter the course name to print that course information: ");
                     scan.nextLine();
                     String userName = scan.nextLine();
                  
                     if (userName.equalsIgnoreCase(courseSampleData.get(0).getCourseName())) {
                        header();
                        System.out.println(courseSampleData.get(0));
                        line();
                     } else if (userName.equalsIgnoreCase(courseSampleData.get(1).getCourseName())) {
                        header();
                        System.out.println(courseSampleData.get(1));
                        line();
                     } else if (userName.equalsIgnoreCase(courseSampleData.get(2).getCourseName())) {
                        header();
                        System.out.println(courseSampleData.get(2));
                        line();
                     } else if (userName.equalsIgnoreCase(courseSampleData.get(3).getCourseName())) {
                        header();
                        System.out.println(courseSampleData.get(3));
                        line();
                     } else if (userName.equalsIgnoreCase(courseSampleData.get(4).getCourseName())) {
                        header();
                        System.out.println(courseSampleData.get(4));
                        line();
                     } else if (userName.equalsIgnoreCase(courseSampleData.get(5).getCourseName())) {
                        header();
                        System.out.println(courseSampleData.get(5));
                        line();
                     } else {
                        System.out.println("Course Number is not in database.");
                     }
                     System.out.println();
                     break;
               
                  case 3:
                     System.out.print("Enter the course credit number to print that course information: ");
                     scan.nextLine();
                     String userCreditNumber = scan.nextLine();
                  
                     if (userCreditNumber.equalsIgnoreCase(courseSampleData.get(0).getCreditNumber()) || userCreditNumber.equalsIgnoreCase(courseSampleData.get(1).getCreditNumber()) || userCreditNumber.equalsIgnoreCase(courseSampleData.get(4).getCreditNumber()) || userCreditNumber.equalsIgnoreCase(courseSampleData.get(5).getCreditNumber())) {
                        header();
                        System.out.println(courseSampleData.get(0));
                        System.out.println(courseSampleData.get(1));
                        System.out.println(courseSampleData.get(4));
                        System.out.println(courseSampleData.get(5));
                        line();
                     } else if (userCreditNumber.equalsIgnoreCase(courseSampleData.get(2).getCreditNumber()) || userCreditNumber.equalsIgnoreCase(courseSampleData.get(3).getCreditNumber())) {
                        header();
                        System.out.println(courseSampleData.get(2));
                        System.out.println(courseSampleData.get(3));
                        line();
                     } else {
                        System.out.println("Credit Number is not in database.");
                     }
                     System.out.println();
                     break;
               
                  case 4:
                     System.out.print("Enter the prerequisite course to print that course information: ");
                     scan.nextLine();
                     String userPrereqCourse = scan.nextLine().toLowerCase();
                  
                     boolean found = false;
                     for (courseInfoFinal course : courseSampleData) {
                        if (course.getPrereqCourse() != null && course.getPrereqCourse().toLowerCase().contains(userPrereqCourse)) {
                           if (!found) {
                              header();
                              found = true;
                           }
                           System.out.println(course);
                        }
                     }
                     line();
                  
                     if (!found) {
                        System.out.println("No courses with the specified prerequisite course found in the database.");
                     }
                     System.out.println();
                     break;
               
                  default:
                     header();
                     for (int i = 0; i < courseSampleData.size(); i++) {
                        System.out.format("| %-15s | %-20s | %-15s | %-19s |",
                                    courseSampleData.get(i).getCourseNumber(), courseSampleData.get(i).getCourseName(),
                                    courseSampleData.get(i).getCreditNumber(), courseSampleData.get(i).getPrereqCourse());
                        System.out.println();
                     }
                     line();
                  
                     exportToFile(courseSampleData);
                  
                     System.exit(0);
                     break;
               }
               break;
         
            case 2:
               start();
            
               System.out.println("Enter the new course's Course Number: ");
               scan.nextLine();
               String newCourseNumber = scan.nextLine();
            
               System.out.println("Enter the new course's Course Name: ");
               String newCourseName = scan.nextLine();
            
               System.out.println("Enter the new course's Credit Number: ");
               String newCreditNumber = scan.nextLine();
            
               System.out.println("Enter the new course's Prerequisite Course: ");
               String newPrereqCourse = scan.nextLine();
            
               courseSampleData.add(new courseInfoFinal(newCourseNumber, newCourseName, newCreditNumber, newPrereqCourse));
            
               header();
               System.out.format("| %-15s | %-20s | %-15s | %-19s |", courseSampleData.get(courseSampleData.size() - 1).getCourseNumber(), courseSampleData.get(courseSampleData.size() - 1).getCourseName(), courseSampleData.get(courseSampleData.size() - 1).getCreditNumber(), courseSampleData.get(courseSampleData.size() - 1).getPrereqCourse());
               System.out.println();
               line();
            
               System.out.println();
               break;
         
            case 3:
               int arraySize = courseSampleData.size();
            
               header();
               for (int i = 0; i < courseSampleData.size(); i++) {
                  System.out.format("| %-15s | %-20s | %-15s | %-19s |", courseSampleData.get(i).getCourseNumber(), courseSampleData.get(i).getCourseName(), courseSampleData.get(i).getCreditNumber(), courseSampleData.get(i).getPrereqCourse());
                  System.out.println();
               }
               line();
            
               System.out.println("Which course would you like to delete? (0-" + (courseSampleData.size() - 1) + "): ");
               int delete = scan.nextInt();
            
               courseSampleData.remove(delete);
            
               header();
               for (int i = 0; i < courseSampleData.size(); i++) {
                  System.out.format("| %-15s | %-20s | %-15s | %-19s |",
                            courseSampleData.get(i).getCourseNumber(), courseSampleData.get(i).getCourseName(),
                            courseSampleData.get(i).getCreditNumber(), courseSampleData.get(i).getPrereqCourse());
                  System.out.println();
               }
               line();
            
               System.out.println();
               break;
         
            case 5:
               header();
               for (int i = 0; i < courseSampleData.size(); i++) {
                  System.out.format("| %-15s | %-20s | %-15s | %-19s |",
                     courseSampleData.get(i).getCourseNumber(), courseSampleData.get(i).getCourseName(),
                     courseSampleData.get(i).getCreditNumber(), courseSampleData.get(i).getPrereqCourse());
                  System.out.println();
               }
               line();
            
            // Export data to text file
               exportToFile(courseSampleData);
            
               System.out.println("Exiting the program.");
               return;         }
      }
   }
}