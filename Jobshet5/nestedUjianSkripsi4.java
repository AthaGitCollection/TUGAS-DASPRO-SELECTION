package Jobshet5;

    import java.util.Scanner;

public class nestedUjianSkripsi4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String message;

        System.out.println("Has the student have been cleared of compensasion (Y/T or Yes/No)");
        String Compensationstatus = sc.nextLine().trim();

        if (Compensationstatus.equalsIgnoreCase("Y") || Compensationstatus.equalsIgnoreCase("Yes")) 
        System.out.println("Enter the number guidence logs with supervisor 1 : ");
        int supervisor1 = sc.nextInt();
        System.out.println("Enter the number guidence logs with supervisor 2 : ");
        int supervisor2 = sc.nextInt();
        
        
        
         if (supervisor1 >= 8 && supervisor2 >= 4) {
    message = "All requirements are met. The student may register for the thesis exam.";
    } else if (supervisor1 < 8 && supervisor2 < 4) {
    message = "Failed: Guidance logs with Supervisor 1 are fewer than 8 AND Supervisor 2 fewer than 4.";
    } else if (supervisor1 < 8 && supervisor2 >= 4) {
    message = "Failed: Guidance logs with Supervisor 1 are fewer than 8.";
    } else if (supervisor1 >= 8 && supervisor2 < 4) {
    message = "Failed: Guidance logs with Supervisor 2 are fewer than 4.";
    } else {
    message = "Failed: The student has not been cleared of compensation.";
    }

System.out.println(message);

        sc.close();

    }
    
}

