package StudyCase2;

import java.util.Scanner;

public class Wifi {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String userType;
        int credits;

        System.out.print("Type User (lecturer/student/other): ");
        userType = input.nextLine();

        if (userType.equalsIgnoreCase("lecturer")) {
            System.out.println("WiFi access granted (lecturer).");

        } else if (userType.equalsIgnoreCase("student")) {
            System.out.print("Enter your SKS (credits): ");
            credits = input.nextInt();

            if (credits >= 12) {
                System.out.println("WiFi access granted (active student).");
            } else {
                System.out.println("Access denied, credits less than 12.");
            }

        } else {
            System.out.println("Access denied not academic people.");
        }

        input.close();
    }
}