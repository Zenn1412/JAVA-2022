
// import the Scanner class
import java.util.Scanner;

public class App {

    // Scanner Object
    static Scanner scan = new Scanner(System.in);

    public static void main(String[] args) {
    

   String crushname = getnameofCrush();
   System.out.println(crushname);
}
static String getnameofCrush() {
   System.out.println("this will show your crush name: ");
   System.out.print("Enter the name of your crush: ");

   String crushName = scan.nextLine();
   return crushName;
   
}
   }