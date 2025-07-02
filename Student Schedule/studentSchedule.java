import java.util.*;
import java.io.*;

public class studentSchedule {
    
    private String semester; 
    private String studentid;
    private String courseNumber;
    private String date;

    public studentSchedule (String semester, String studentid, String courseNumber, String date) {
        this.semester = semester;
        this.studentid = studentid;
        this.courseNumber = courseNumber;
        this.date = date;
    }

    public static void scheduleMenu() {
            System.out.println("Student Schedule Menu");
            System.out.println("1. Add student");
            System.out.println("2. Delete Student");
            System.out.println("3. Edit Student");
            System.out.println("4. Search Student");
            System.out.println("5. Display all students");
            System.out.println("6. Exit");
            System.out.println("-----------------------------");

        }

    





    public void setSemester(String newsemester) {
       this.semester = newsemester;
    }
    
    public void setstudentid(String newstudentid) {
        this.studentid = newstudentid;
    }

    public void setcourseNumber(String newcourseNumber) {
        this.courseNumber = newcourseNumber;
    }

    public void setdate(String newdate) {
        this.date = newdate;
    }

    public String getsemester() {
        return semester;
    }

    public String getstudentid() {
        return studentid;
    }

    public String getcourseNumber() {
        return courseNumber;
    }

    public String getdate() {
        return date;
    }

}