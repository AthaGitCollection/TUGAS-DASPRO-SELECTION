package Jobshet5;
    import java.util.Scanner;
    
public class ifCetakKRS3  {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("--- Print RKS SIAKAD---");
        System.out.println("Have the tution fees been paid full? (True/False) : ");
        boolean uktLunas = sc.nextBoolean();

    if (uktLunas) {

        System.out.println("UKT Payment has been verified");
        System.out.println("Krs now can be printed and you can ask academic advisor to sign it.");
    }

  else {
    System.out.println("Registration rejected. Please pay UKT first");
            
    }
    sc.close();
    }
}
    

    

