import java.util.Scanner;
import java.util.HashSet;

public class movieticket {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        HashSet<Integer> booked = new HashSet<>();

        int totalseat = 20;

        menu:
        while (true) {
            System.out.println("\n1. BOOK A SEAT");
            System.out.println("2. BOOKED SEATS");
            System.out.println("3. AVAILABLE SEATS");
            System.out.println("4. EXIT");
            System.out.print("Choose an option: ");

            int choice = sc.nextInt();
            sc.nextLine(); // consume leftover newline

            switch (choice) {
                case 1:
                    System.out.print("Enter seat numbers (1-" + totalseat + "), comma-separated: ");
                    String input = sc.nextLine();
                    String[] parts = input.split(",");
                    for (String part : parts) {
                        try {
                            int seat = Integer.parseInt(part.trim());
                            if (seat < 1 || seat > totalseat) {
                                System.out.println("Seat " + seat + " - Invalid seat number!");
                            } else if (booked.contains(seat)) {
                                System.out.println("Seat " + seat + " - Already booked!");
                            } else {
                                booked.add(seat);
                                System.out.println("Seat " + seat + " - Booked successfully!");
                            }
                        } catch (NumberFormatException e) {
                            System.out.println("'" + part.trim() + "' is not a valid number!");
                        }
                    }
                    break;

                case 2:
                    if (booked.isEmpty()) {
                        System.out.println("No seats booked yet.");
                    } else {
                        System.out.println("Booked seats: " + booked);
                    }
                    break;

                case 3:
                    System.out.print("Available seats: ");
                    for (int i = 1; i <= totalseat; i++) {
                        if (!booked.contains(i)) {
                            System.out.print(i + " ");
                        }
                    }
                    System.out.println();
                    break;

                case 4:
                    System.out.println("Thank you! Goodbye.");
                    break menu;

                default:
                    System.out.println("Invalid option! Try again.");
            }
        }

        sc.close();
    }
}
