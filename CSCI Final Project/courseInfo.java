import java.util.*;
import java.util.ArrayList;
import java.util.Scanner;
import java.io.PrintWriter;
import java.io.IOException;
import java.io.FileWriter;

public class courseInfo
{
    public static void main(String[] args)
    {
        Scanner scan = new Scanner(System.in);

        //creating list of the sample data and adding objects to them 
        ArrayList<courseInfo> courseSampleData = new ArrayList<>();  
        courseSampleData.add(new courseInfo("M101", "Calculus I", "3", "None"));
        courseSampleData.add(new courseInfo("M102", "Calculus II", "3", "M101"));
        courseSampleData.add(new courseInfo("P201", "Physics I", "4", "Math 101")); 
        courseSampleData.add(new courseInfo("P202", "Physics II", "4", "P201")); 
        courseSampleData.add(new courseInfo("C201", "Chemistry I", "3", "Math 101")); 
        courseSampleData.add(new courseInfo("C301", "Advanced Chemistry", "3", "M101, C201")); 

        start();
        
        while(true)
        {
            //menu will be prompted so the user can choose what they would like to do
            System.out.println("Select what you would like to do to the array with the corresponding number below. \n1. Search \n2. Add \n3. Delete \n4. Edit \n5. Exit. ");
            int homeMenuInput = scan.nextInt(); //the user's desired function is stored in this variable
            System.out.println();

            //switch function to go through each of the possible actions the user could choose
            switch(homeMenuInput)
            {
                //will execute "search" algorithm
                case 1:
                    System.out.println("What would you like to search? \n1. Course Number \n2. Course Name \n3. Credit Number \n4. Prerequisite Course");
                    int searchInput = scan.nextInt(); //whatever the user chose to search by is stored in this variable
                    System.out.println();

                    //switch function to go through each of the possible actions the user could choose
                    switch(searchInput)
                    {
                        //user will be able to search through the array via course number
                        case 1:
                            System.out.print("Enter the course number to print that course's information: ");
                            scan.nextLine();
                            String userNumber = scan.nextLine();

                            //prints out all course info based on user course number input
                            if(userNumber.equalsIgnoreCase(courseSampleData.get(0).getCourseNumber()))
                            {
                               header();
                               System.out.println(courseSampleData.get(0));
                               line();
                            }
                            else if(userNumber.equalsIgnoreCase(courseSampleData.get(1).getCourseNumber()))
                            {
                               header();
                               System.out.println(courseSampleData.get(1));
                               line();
                            }
                            else if(userNumber.equalsIgnoreCase(courseSampleData.get(2).getCourseNumber()))
                            {
                               header();
                               System.out.println(courseSampleData.get(2));
                               line();
                            }
                            else if(userNumber.equalsIgnoreCase(courseSampleData.get(3).getCourseNumber()))
                            {
                               header();
                               System.out.println(courseSampleData.get(3));
                               line();
                            }
                            else if(userNumber.equalsIgnoreCase(courseSampleData.get(4).getCourseNumber()))
                            {
                               header();
                               System.out.println(courseSampleData.get(4));
                               line();
                            }
                            else if(userNumber.equalsIgnoreCase(courseSampleData.get(5).getCourseNumber()))
                            {
                               header();
                               System.out.println(courseSampleData.get(5));
                               line();
                            }
                            else
                            {
                               System.out.println("Course Number is not in database.");
                            }
                            System.out.println();
                            break;
                        
                        //user will be able to search through the array via course name
                        case 2:
                            System.out.print("Enter the course name to print that course information: ");
                            scan.nextLine();
                            String userName = scan.nextLine();
                            
                            //prints out all course info based on user course number name
                            if(userName.equalsIgnoreCase(courseSampleData.get(0).getCourseName()))
                            {
                                header();
                                System.out.println(courseSampleData.get(0));
                                line();
                            }
                            else if(userName.equalsIgnoreCase(courseSampleData.get(1).getCourseName()))
                            {
                                header();
                                System.out.println(courseSampleData.get(1));
                                line();
                            }
                            else if(userName.equalsIgnoreCase(courseSampleData.get(2).getCourseName()))
                            {
                                header();
                                System.out.println(courseSampleData.get(2));
                                line();
                            }
                            else if(userName.equalsIgnoreCase(courseSampleData.get(3).getCourseName()))
                            {
                                header();
                                System.out.println(courseSampleData.get(3));
                                line();
                            }
                            else if(userName.equalsIgnoreCase(courseSampleData.get(4).getCourseName()))
                            {
                                header();
                                System.out.println(courseSampleData.get(4));
                                line();
                            }
                            else if(userName.equalsIgnoreCase(courseSampleData.get(5).getCourseName()))
                            {
                                header();
                                System.out.println(courseSampleData.get(5));
                                line();
                            }
                            else
                            {
                                System.out.println("Course Number is not in database.");
                            }
                            System.out.println();
                            break;

                        //user will be able to search through the array via credit number
                        case 3: 
                            System.out.print("Enter the course credit number to print that course information: ");
                            scan.nextLine();
                            String userCreditNumber = scan.nextLine();
                            
                            //prints out all course info based on user course credit number
                            if(userCreditNumber.equalsIgnoreCase(courseSampleData.get(0).getCreditNumber()) || userCreditNumber.equalsIgnoreCase(courseSampleData.get(1).getCreditNumber()) || userCreditNumber.equalsIgnoreCase(courseSampleData.get(4).getCreditNumber()) || userCreditNumber.equalsIgnoreCase(courseSampleData.get(5).getCreditNumber()))
                            {
                                header();
                                System.out.println(courseSampleData.get(0));
                                System.out.println(courseSampleData.get(1));
                                System.out.println(courseSampleData.get(4));
                                System.out.println(courseSampleData.get(5));
                                line();
                            }
                            else if (userCreditNumber.equalsIgnoreCase(courseSampleData.get(2).getCreditNumber()) || userCreditNumber.equalsIgnoreCase(courseSampleData.get(3).getCreditNumber()))
                            {
                                header();
                                System.out.println(courseSampleData.get(2));
                                System.out.println(courseSampleData.get(3));
                                line();
                            }
                            else
                            {
                                System.out.println("Credit Number is not in database.");
                            }
                            System.out.println();
                            break;

                      
                        //user will be able to search through the array via prereq course
                        case 4:
                            System.out.print("Enter the prerequisite course to print that course information: ");
                            scan.nextLine();
                            String userPrereqCourse = scan.nextLine().toLowerCase();
                            
                            //prints out all course info based on user course prereq course
                            boolean found = false;
                            for (courseInfo course : courseSampleData) {
                                if (course.getPrereqCourse() != null && course.getPrereqCourse().toLowerCase().contains(userPrereqCourse)) {
                                    if (!found) {
                                        header();
                                        found = true;
                                    }
                                    System.out.println(course);
                                }
                                
                            }
                            line();
                            
                            //will print message if the course the user inputting does not match in the database
                            if (!found) {
                                System.out.println("No courses with the specified prerequisite course found in the database.");
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

                    //user will be prompted for each of the categories for the course information
                    System.out.println("Enter the new course's Course Number: ");
                    scan.nextLine();
                    String newCourseNumber = scan.nextLine();

                    System.out.println("Enter the new course's Course Name: ");
                    String newCourseName = scan.nextLine();

                    System.out.println("Enter the new course's Credit Number: ");
                    String newCreditNumber = scan.nextLine();

                    System.out.println("Enter the new course's Prerequisite Course: ");
                    String newPrereqCourse = scan.nextLine();

                    //adding the new course information
                    courseSampleData.add(new courseInfo(newCourseNumber, newCourseName, newCreditNumber, newPrereqCourse));

                    header();
                    System.out.format("| %-15s | %-20s | %-15s | %-19s |", courseSampleData.get(courseSampleData.size() - 1).getCourseNumber(), courseSampleData.get(courseSampleData.size() - 1).getCourseName(), courseSampleData.get(courseSampleData.size() - 1).getCreditNumber(), courseSampleData.get(courseSampleData.size() - 1).getPrereqCourse());
                    System.out.println();
                    line();

                    System.out.println();
                    break;


                //will execute "delete" algorithm
                case 3:
                    int arraySize = courseSampleData.size();

                    header();
                    //prints all of the course information thus far
                    for (int i = 0; i < courseSampleData.size(); i++) {
                        System.out.format("| %-15s | %-20s | %-15s | %-19s |", courseSampleData.get(i).getCourseNumber(), courseSampleData.get(i).getCourseName(), courseSampleData.get(i).getCreditNumber(), courseSampleData.get(i).getPrereqCourse());
                        System.out.println();
                    }
                    line();

                    //allows the user to select the course they wish to delete
                    System.out.println("Which course would you like to delete? (0-" + (courseSampleData.size() - 1) + "): ");
                    int delete = scan.nextInt();

                    //actually removes the desired course information
                    courseSampleData.remove(delete);
 
                    //prints the updated course information
                    header();
                    for (int i = 0; i < courseSampleData.size(); i++)
                    {
                        System.out.format("| %-15s | %-20s | %-15s | %-19s |", courseSampleData.get(i).getCourseNumber(), courseSampleData.get(i).getCourseName(), courseSampleData.get(i).getCreditNumber(), courseSampleData.get(i).getPrereqCourse());
                        System.out.println();
                    }
                    line();

                    System.out.println();
                    break;

                //will execute "edit" algorithm
                case 4:
                    //prints the courses thus far
                    header();
                    for (int i = 0; i < courseSampleData.size(); i++) {
                        System.out.format("| %-15s | %-20s | %-15s | %-19s |", courseSampleData.get(i).getCourseNumber(), courseSampleData.get(i).getCourseName(), courseSampleData.get(i).getCreditNumber(), courseSampleData.get(i).getPrereqCourse());
                        System.out.println();
                    }
                    line();

                    //allows the user to select the desired course to edit
                    System.out.println("Which course would you like to edit? (0-" + (courseSampleData.size() - 1) + "): ");
                    int editIndex = scan.nextInt();
                
                    // Clear the buffer
                    scan.nextLine();
                
                    //prompts the user to enter the new information to the corresponding categories
                    System.out.println("Enter the new Course Number: ");
                    courseSampleData.get(editIndex).setCourseNumber(scan.nextLine());
                
                    System.out.println("Enter the new Course Name: ");
                    courseSampleData.get(editIndex).setCourseName(scan.nextLine());
                
                    System.out.println("Enter the new Credit Number: ");
                    courseSampleData.get(editIndex).setCreditNumber(scan.nextLine());
                
                    System.out.println("Enter the new Prerequisite Course: ");
                    courseSampleData.get(editIndex).setPrereqCourse(scan.nextLine());
                    
                    //prints the updated course data
                    header();
                    for (int i = 0; i < courseSampleData.size(); i++) {
                        System.out.format("| %-15s | %-20s | %-15s | %-19s |", courseSampleData.get(i).getCourseNumber(), courseSampleData.get(i).getCourseName(), courseSampleData.get(i).getCreditNumber(), courseSampleData.get(i).getPrereqCourse());
                        System.out.println();
                    }
                    line();

                    System.out.println();
                    break;


                //program ends and course information will be sent to a file
                default:
                    header();
                    for (int i = 0; i < courseSampleData.size(); i++) {
                    System.out.format("| %-15s | %-20s | %-15s | %-19s |",
                        courseSampleData.get(i).getCourseNumber(), courseSampleData.get(i).getCourseName(),
                        courseSampleData.get(i).getCreditNumber(), courseSampleData.get(i).getPrereqCourse());
                    System.out.println();
                    }
                    line();
                
                    //export data to text file
                    exportToFile(courseSampleData);
                
                    System.out.println("Exiting the program.");
                    return;         
            }
        }
    }

    //declaring variables for courseInfo class
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

    //referring to the current object on which the method or constructor is being invoked
    public courseInfo(String courseNumber, String courseName, String creditNumber, String prereqCourse)
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

   //created a method that prints out the header and the courses
   public static void start()
   {
        //creating the header category for the CourseInfo class array in a table format
        System.out.println("----------------------------------------------------------------------------------");
        System.out.printf("| %-15s | %-20s | %-15s | %-15s |", "Course Number", "Course Name", "Credit Number", "Prerequisite Course");
        System.out.println();
        System.out.println("----------------------------------------------------------------------------------");

        //creating list of the sample data and adding objects to them 
        ArrayList<courseInfo> courseSampleData = new ArrayList<>();  
        courseSampleData.add(new courseInfo("M101", "Calculus I", "3", "None"));
        courseSampleData.add(new courseInfo("M102", "Calculus II", "3", "M101"));
        courseSampleData.add(new courseInfo("P201", "Physics I", "4", "Math 101")); 
        courseSampleData.add(new courseInfo("P202", "Physics II", "4", "P201")); 
        courseSampleData.add(new courseInfo("C201", "Chemistry I", "3", "Math 101")); 
        courseSampleData.add(new courseInfo("C301", "Advanced Chemistry", "3", "M101, C201")); 

        //iterates over the list   
        for(courseInfo courseInfo: courseSampleData)  
        {  
            System.out.format("| %-15s | %-20s | %-15s | %-19s |", courseInfo.getCourseNumber(), courseInfo.getCourseName(), courseInfo.getCreditNumber(), courseInfo.getPrereqCourse());
            System.out.println();
        }  
        line();

        System.out.println("\n\n");
   }

    //allows all of the up to date course information to be exported to a file
    public static void exportToFile(ArrayList<courseInfo> courseData) 
    {
        try (PrintWriter writer = new PrintWriter(new FileWriter("course_info.txt"))) {
        // Write header to the file
        writer.println("-------------------------------------------------------------------------------");
        writer.println("Course Number  | Course Name              | Credit Number | Prerequisite Course ");
        writer.println("-------------------------------------------------------------------------------");
        
        // Write each course information to the file
        for (courseInfo course : courseData) {
            writer.printf("%-14s | %-24s | %-13s | %-20s%n",
                    course.getCourseNumber(), course.getCourseName(), course.getCreditNumber(), course.getPrereqCourse());
        }
        writer.println("-------------------------------------------------------------------------------");
        
        System.out.println("Course Information is was saved in 'course_info.txt'.");
        } catch (IOException e) {
        System.err.println("Error exporting data to file: " + e.getMessage());
        }
    }
}