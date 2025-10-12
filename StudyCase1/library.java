
import java.util.Scanner;

public class library {
    public static void main (String[] args) {

        Scanner input = new Scanner(System.in);
        String bringID, registeredOnline;

        System.out.print("Do you bring student ID? (Yes or no): ");
        bringID = input.nextLine();

        System.out.print("Do You have already registered online?  (Yes or no): ");
        registeredOnline = input.nextLine();

        if (bringID.equals("Yes") || registeredOnline.equals("Yes")) {
            System.out.println("Entry granted : You can entry the library.");
        } else {
            System.out.println("Entry denied : You cannot enter the library.");
        }

        input.close();
    }
}







    

    