package app;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class CourseMap {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // Key = AFID (unique), Value = Course (duplicates allowed)
        Map<String, String> students = new LinkedHashMap<>();

        System.out.print("How many students do you want to enter? ");
        int n = Integer.parseInt(sc.nextLine().trim());

        int count = 0;
        while (count < n) {
            System.out.print("\nEnter AFID: ");
            String afid = sc.nextLine().trim();

            if (students.containsKey(afid)) {
                System.out.println("AFID already exists! Enter a different AFID.");
                continue;
            }

            System.out.print("Enter Course: ");
            String course = sc.nextLine().trim();

            students.put(afid, course);
            count++;
        }

        System.out.println("\nAFID  ->  Course");
        System.out.println("----------------");
        for (Map.Entry<String, String> entry : students.entrySet()) {
            System.out.println(entry.getKey() + "  ->  " + entry.getValue());
        }

        sc.close();
    }
}
