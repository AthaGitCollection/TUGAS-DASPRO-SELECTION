package Jobshet5;
    import java.util.Scanner;
    
public class ifCetakKRS3  {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("--- Print RKS SIAKAD---");
        System.out.println("Have the tution fees been paid full? (True/False) : ");
        boolean uktLunas = sc.nextBoolean();

    System.out.println(
     uktLunas
    ? "UKT has been paid in full. KRS can be printed."
    : "UKT has not been paid in full.KRS cannot be printed."

    );

    sc.close();
    
    }

}
        

  
    

    

