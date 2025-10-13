package Jobshet5;

import java.util.Scanner;

public class ifElseCetakKRS3 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("--- Print KRS SIAKAD ---");
        System.out.print("Enter Current Semester (1-8): ");
        int semester = sc.nextInt();

        if (semester == 1) {
                System.out.println("KRS Semester 1 displayed");
        } else if (semester == 2) {
                System.out.println("KRS Semester 2 displayed");
        } else if (semester == 3) {
                 System.out.println("KRS Semester 3 displayed");
        } else if (semester == 4) {
                System.out.println("KRS Semester 4 displayed");
        } else if (semester == 5) {
                System.out.println("KRS Semester 5 displayed");
        } else if (semester == 6) {
                System.out.println("KRS Semester 6 displayed");
        } else if (semester == 7) {
                System.out.println("KRS Semester 7 displayed");
         } else if (semester == 8) {
                System.out.println("KRS Semester 8 displayed");
         } else
                System.out.println("Invalid semester.");
                sc.close();
        };
    }


