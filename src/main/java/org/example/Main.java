package org.example;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Tracker tracker = new Tracker();
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("===== Aikido Practice Tracker =====");
            System.out.println("1. Add Practice Session");
            System.out.println("2. View Total Practice Time");
            System.out.println("3. Check Graduation Eligibility");
            System.out.println("4. Exit");
            System.out.print("Choose an option: ");

            String choice = scanner.nextLine();
            switch (choice) {
                case "1":
                    System.out.print("Enter session date (YYYY-MM-DD): ");
                    String date = scanner.nextLine(); // Keep this as string for simplicity
                    System.out.print("Enter duration in minutes: ");
                    double duration = scanner.nextDouble();
                    scanner.nextLine();
                    tracker.addSession(date, duration);
                    System.out.println("Session added successfully!\n");
                    break;
                case "2":
                    tracker.viewTotalPracticeTime();
                    break;
                case "3":
                    boolean ok = tracker.checkGraduationEligibility();
                    if (ok) {
                        System.out.println("Congratulations! You are eligible for Kyu graduation.\n");
                    } else {
                        System.out.println("You need more hours to be eligible for Kyu graduation.\n");
                    }
                    break;
                case "4":
                    System.out.println("Exiting... Goodbye!");
                    return;
                default:
                    System.out.println("Invalid choice! Please select a valid option.");
            }
        }
    }
}