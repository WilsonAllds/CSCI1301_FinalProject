import java.util.*;
import java.io.*;


public class grade {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);  
        ArrayList<sg> grade = new ArrayList<sg>();
        int repeat = 100;
        grade.add(new sg("202301", "M101", "A"));
        grade.add(new sg("202301", "P201", "C"));
        grade.add(new sg("202302", "M101", "A"));
        grade.add(new sg("202302", "M101", "B"));

    }

    public static void gui() {
        do {
            System.out.println("What would you like to do?\n[1]. Add data\n[2]. Delete data\n[3]. Edit data\n[4]. Search data\n[5]. Display all data\n[6]. Exit");

        } while (repeat !=0);
        
    }
    
    
}
