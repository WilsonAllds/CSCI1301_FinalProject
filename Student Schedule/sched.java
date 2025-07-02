import java.util.*;
import java.io.*;

public class sched {
    public static void main(String[] args) {
   
        Scanner keyboard = new Scanner(System.in);
        int done=69;//nice
       
        ArrayList<studentSchedule> scheduleSample = new ArrayList<studentSchedule>();  
        scheduleSample.add(new studentSchedule("Fall 2023","202301","M102","MW"));
        scheduleSample.add(new studentSchedule("Fall 2023", "202301", "P201", "TH"));
        scheduleSample.add(new studentSchedule("Fall 2023", "202302", "P201", " MW"));
        scheduleSample.add(new studentSchedule("Fall 2023", "202303", "C301", "MW"));


        while (true) {
            scheduleMenu();
            int userChoice;

            try {
                userChoice = Integer.parseInt(keyboard.nextLine());
            } catch (NumberFormatException e) {
                System.out.println("Invalid, enter a number 1-6");
                continue;
            }
            studentSchedule.fetchInput(studentSchedule, userChoice);
        } 
    
    }        
           


    public static void fetchInput(ArrayList<studentSchedule> input, int userChoice) {
        Scanner keyboard = new Scanner(System.in);

        switch (userChoice) {

            case 1:
            addClass(input, keyboard);
            break;

            case 2:
            deleteClass(input, keyboard);

            case 3: 
            editClass(input, keyboard);

            case 4:
            searchClass(input, keyboard);

            case 5: 
            header();

            default: 
            System.out.println("Enter a number 1-6");
        }
    }


    
    public static void scheduleMenu() {
        System.out.println("Student Schedule Menu");
        System.out.println("[1.] Add Class");
        System.out.println("[2.] Delete Class");
        System.out.println("[3.] Edit Class");
        System.out.println("[4.] Search Class");
        System.out.println("[5.] Display all Classes");
        System.out.println("[6.] Exit");
        System.out.println("-----------------------------");

    }

    public static void header() {
        System.out.println("------------------------");
        System.out.println("Semester Name  CRN  Date");
        System.out.println();
        System.out.println("------------------------");
    }
    
    private static void addClass(ArrayList<studentSchedule> input, Scanner keyboard) {
        System.out.println("Enter semester ");
        String semester = keyboard.nextLine();

        System.out.println("Enter class name");
        String id = keyboard.nextLine();

        System.out.println("Enter CRN");
        String crn = keyboard.nextLine();

        System.out.println("Enter date");
        String date = keyboard.nextLine();

        input.add(new studentSchedule(semester, id, crn, date));

        System.out.println("Loading.....");
        System.out.println("Class added.");
    }

    public static void deleteClass(ArrayList<studentSchedule> input, Scanner keyboard) {
        System.out.println("Enter CRN to delete");
        String crnDelete = keyboard.nextLine();

        Iterator<studentSchedule> iterator = input.iterator();
        while (iterator.hasNext()) {
            studentSchedule input = iterator.next();
            if (crnDelete.equalsIgnoreCase(input.getcourseNumber())) {
                iterator.remove();
                System.out.println("Class removed");
                return;
            }
        }

    }

    public static void editClass() {

    }

    public static void searchClass() {

    }

    public static void displayClass() {

    }

    public static void printClassBySemester() {

    }

    public static void printClassById() {

    }

    public static void printClassByCrn() {

    }

    public static void printClassByDate() {

    }

}

 
    

    

















































