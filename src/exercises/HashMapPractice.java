package exercises;

import java.util.HashMap;
import java.util.Scanner;

public class HashMapPractice {
    public static void main(String[] args) {
        HashMap<Integer, String> students = new HashMap<>();
        Scanner input = new Scanner(System.in);
        String contLoop;

        do {
            System.out.print("Enter student ID: ");
            int id = input.nextInt();

            System.out.print("Enter student name: ");
            String name = input.next();

            students.put(id, name);


            System.out.print("Continue? (y/N): ");
            contLoop = input.next().toLowerCase();


        } while(contLoop.equals("yes") || contLoop.equals("y"));

        System.out.println(students);
    }


}
