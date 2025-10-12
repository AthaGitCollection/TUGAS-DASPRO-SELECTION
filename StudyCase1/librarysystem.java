
import java.util.Scanner;

public class librarysystem {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        boolean studentcard, onlineregist;

        System.out.print("You have a student card (true/false): ");
        studentcard = sc.nextBoolean();

        System.out.print("You are done online registered (true/false): ");
        onlineregist = sc.nextBoolean();

        if (studentcard == true || onlineregist == true) {
            System.out.println("Access Granted");
        } else {
            System.out.println("Access Denied");

            sc.close();
        }
    }
}
