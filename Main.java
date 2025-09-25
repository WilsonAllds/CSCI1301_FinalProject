import java.util.*;
import java.io.*;

public class Main
{
    public static void main(String[] args) throws IOException
    {
        //scanner declaration
        Scanner keyboard = new Scanner(System.in);
        
        //creating the student info array
        int r = 14;
        int c = 7;
        String[][] infoArray = new String[r][c];
       
        int Continue;
        int userContinue;

    /*     studentinfo header = new studentinfo("Student_ID", "First_Name", "Last_Name", "Birthday", "Phone_number", "Email", "Gender", "Address");    
        infoArray[0][0] = header.getStudentId();
        infoArray[0][1] = header.getFirstName();
        infoArray[0][2] = header.getLastName();
        infoArray[0][2] = header.getBirthdate();
        infoArray[0][3] = header.getPhoneNumber();
        infoArray[0][4] = header.getEmail();
        infoArray[0][5] = header.getGender();
        infoArray[0][6] = header.getAddress();
        

        for(int i = 0; i < c; i++)
            System.out.print(infoArray[0][i] + " ");
        System.out.println();
*/
        do 
        {
            //variables for our fetch command
            int studentLine = 1;
            int studentColumn = 0;
            
            //gauging how many students we need to enter info for; we dont need the whole array
            System.out.println("How many students do you want to enter?");
            int numberOfStudents = keyboard.nextInt();
            
            //trailing newline so i dont mess up my for loop 
            keyboard.nextLine();
            
            //this fetches the information from the person who enters it
            for(int j=0;j<numberOfStudents;j++) {
                System.out.println("Student_ID");
                infoArray[studentLine][studentColumn] = keyboard.nextLine();
                System.out.println("First_name");
                infoArray[studentLine][studentColumn+1] = keyboard.nextLine();
                System.out.println("Birthday");
                infoArray[studentLine][studentColumn+2] = keyboard.nextLine();
                System.out.println("Phone_Number");
                infoArray[studentLine][studentColumn+3] = keyboard.nextLine();
                System.out.println("Email");
                infoArray[studentLine][studentColumn+4] = keyboard.nextLine();
                System.out.println("Gender");
                infoArray[studentLine][studentColumn+5] = keyboard.nextLine();
                System.out.println("Address");
                infoArray[studentLine][studentColumn+6] = keyboard.nextLine();
                studentLine++;

            }

        //print the array header
        studentinfo header = new studentinfo("Student_ID", "First_Name", "Last_Name", "Birthday", "Phone_number", "Email", "Gender", "Address");    
        infoArray[0][0] = header.getStudentId();
        infoArray[0][1] = header.getFirstName();
        infoArray[0][2] = header.getLastName();
        infoArray[0][2] = header.getBirthdate();
        infoArray[0][3] = header.getPhoneNumber();
        infoArray[0][4] = header.getEmail();
        infoArray[0][5] = header.getGender();
        infoArray[0][6] = header.getAddress();

        for(int i = 0; i < c; i++)
            System.out.print(infoArray[0][i] + " ");
        System.out.println();
            
        //print the array
        

            //end the array operation
             Continue = 1;
            System.out.println("Type 1 to Exit");
             userContinue = keyboard.nextInt();

        } while(Continue!=userContinue);


        
            
        

            

        
        

    }
}
/* 
    public void fetch() 
    {
        System.out.println("What is your student ID?");
        
    }
}

*/


